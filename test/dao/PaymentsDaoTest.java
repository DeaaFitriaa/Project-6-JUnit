/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.pojo.Payments;
import java.util.List;
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
public class PaymentsDaoTest {
    
    public PaymentsDaoTest() {
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
     * Test of getByProperty method, of class PaymentsDao.
     */
    @Test
    public void testGetByProperty() {
        System.out.println("getByProperty");
        String property = "";
        Object value = null;
        PaymentsDao instance = new PaymentsDao();
        Payments expResult = null;
        Payments result = instance.getByProperty(property, value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class PaymentsDao.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 0;
        PaymentsDao instance = new PaymentsDao();
        Payments expResult = null;
        Payments result = instance.getById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class PaymentsDao.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        PaymentsDao instance = new PaymentsDao();
        List<Payments> expResult = null;
        List<Payments> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
