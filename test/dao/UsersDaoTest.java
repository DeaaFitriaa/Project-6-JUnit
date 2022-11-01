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
        String email = "";
        String password = "";
        UsersDao instance = new UsersDao();
        Users expResult = null;
        Users result = instance.login(email, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class UsersDao.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 0;
        UsersDao instance = new UsersDao();
        Users expResult = null;
        Users result = instance.getById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logout method, of class UsersDao.
     */
    @Test
    public void testLogout() {
        System.out.println("logout");
        UsersDao instance = new UsersDao();
        instance.logout();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class UsersDao.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        UsersDao.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
