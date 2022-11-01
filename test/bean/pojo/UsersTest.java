/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.pojo;

import dao.UsersDao;
import java.util.Set;
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
public class UsersTest {
    
    UsersDao dao = new UsersDao();
    
    public UsersTest() {
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
     * Test of login method, of class Users.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String email = "admin@gmail.com";
        String password = "123";
        Users instance = dao.login(email, password);
        String expResult = "index.xhtml";
        String result = instance.login();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProfile method, of class Users.
     */
    @Test
    public void testGetProfile() {
        System.out.println("getProfile");
        String email = "admin@gmail.com";
        String password = "123";
        Users instance = dao.login(email, password);
        String expResult = "profile.xhtml";
        String result = instance.getProfile();
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class Users.
     */
    @Test
    public void testUpdateTrue() {
        System.out.println("updateTrue");
        Users instance = dao.getById(2);
        instance.setName("TestUpdate");
        String expResult = "success.xhtml";
        String result = instance.update();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of update method, of class Users.
     */
    @Test
    public void testUpdateFalse() {
        System.out.println("updateFalse");
        Users instance = dao.getById(2);
        instance.setId(0);
        instance.setName("TestUpdate");
        String expResult = "error.xhtml";
        String result = instance.update();
        assertEquals(expResult, result);
    }
    
}
