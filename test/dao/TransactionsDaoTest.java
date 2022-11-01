/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.pojo.Transactions;
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
public class TransactionsDaoTest {
    
    public TransactionsDaoTest() {
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
     * Test of getHistory method, of class TransactionsDao.
     */
    @Test
    public void testGetHistory() {
        System.out.println("getHistory");
        int userId = 0;
        TransactionsDao instance = new TransactionsDao();
        List<Transactions> expResult = null;
        List<Transactions> result = instance.getHistory(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class TransactionsDao.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TransactionsDao.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
