/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.pojo.Transactions;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Dea Fitria
 */
public class TransactionsDao extends BaseDao {
    
    List<Transactions> listTransaction = new ArrayList<>();
    Transactions transaction;
    
    public List<Transactions> getHistory(int userId) {
        session = hibernateUtil.openSession();
        try {
            trans = session.beginTransaction();
            
            Criteria criteria = session.createCriteria(Transactions.class);
            criteria.setFetchMode("users", FetchMode.JOIN).add(Restrictions.eq("users.id", userId));
            criteria.setFetchMode("products", FetchMode.JOIN);
            criteria.setFetchMode("payments", FetchMode.JOIN);
            
            System.out.println("A");
            listData = criteria.list();
            System.out.println(listData);
            trans.commit();
        }
        catch(HibernateException e) {
            e.getMessage();
        }
        finally {
            session.close();
        }
        if (!listData.isEmpty()) {
            listData.forEach((list) -> {
               listTransaction.add(Transactions.class.cast(list));
            });
        }
        
        return listTransaction;
    }
    
    public static void main(String[] args) {
        TransactionsDao dao = new TransactionsDao();
//        List<Transactions> lists = dao.getHistory(1);
//        
//        lists.forEach((list) -> {
//            System.out.println(list);
//            System.out.println(list.getProducts().getId());
//            System.out.println(list.getPayments().getName());
//            System.out.println(list.getName());
//        });
    }
}
