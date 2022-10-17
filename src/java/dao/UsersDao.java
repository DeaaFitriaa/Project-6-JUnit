/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.pojo.Users;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Dea Fitria
 */
public class UsersDao extends BaseDao {
    
    Users user;
    
    public Users login(String email, String password) {
        Session session = hibernateUtil.openSession();
        Transaction trans = null;
        try {
            trans = session.beginTransaction();
            
            Query query = session.createQuery("FROM Users WHERE Email = :email AND Password = :password");
            query.setString("email", email);
            query.setString("password", password);
            user = (Users)query.uniqueResult();
        }
        catch(HibernateException e) {
            e.getMessage();
        }
        finally {
            session.close();
        }
        return user;
    }
    
    public Users getById(int id) {
        return Users.class.cast(super.getById(Users.class, id));
    }
    
    public void logout() {
        session.flush();
        session.clear();
        session = hibernateUtil.openSession();
    }
    
    public static void main(String[] args) {
        UsersDao dao = new UsersDao();
//        Users user = dao.login("admin@gmail.com", "321");
        Users user = dao.getById(1);
        
        System.out.println(user);
        System.out.println(user.getEmail());
        System.out.println(user.getPassword());
        System.out.println(user.getName());
        System.out.println(user.getAddress());
    }
}