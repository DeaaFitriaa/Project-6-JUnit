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
    public void testGetByPropertyName() {
        System.out.println("getByProperty(name)");
        String property = "name";
        String value = "BRIVA";
        PaymentsDao instance = new PaymentsDao();
        int expResult = 4;
        Payments result = instance.getByProperty(property, value);
        assertEquals(String.valueOf(expResult), String.valueOf(result.getId()));
    }

    /**
     * Test of getById method, of class PaymentsDao.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 3;
        PaymentsDao instance = new PaymentsDao();
        String expResult = "OVO";
        Payments result = instance.getById(id);
        assertEquals(expResult, result.getName());
    }

    /**
     * Test of getAll method, of class PaymentsDao.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        PaymentsDao instance = new PaymentsDao();
        List<Payments> result = instance.getAll();
        assertNotNull(result);
    }
    
}
