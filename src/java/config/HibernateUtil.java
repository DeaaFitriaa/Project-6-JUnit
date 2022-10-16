/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author Dea Fitria
 */
public class HibernateUtil {
    
    private Configuration cfg;
    
    public Session openSession() {
        cfg = new Configuration().configure("hibernate.cfg.xml");
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build(); 
        SessionFactory sf = cfg.buildSessionFactory(reg);
        Session session = sf.openSession();
        return session;
    }
}
