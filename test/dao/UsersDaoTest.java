/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.pojo.Users;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dea Fitria
 */
public class UsersDaoTest {
    
    public UsersDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of login method, of class UsersDao.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String email = "admin@gmail.com";
        String password = "123";
        UsersDao instance = new UsersDao();
        Users result = instance.login(email, password);
        assertFalse(result.getName().equals("") || result.getName() == null);
    }

    /**
     * Test of getById method, of class UsersDao.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 1;
        UsersDao instance = new UsersDao();
        Users result = instance.getById(id);
        assertTrue(result.getName().equals("Admin"));
    }
    
}
