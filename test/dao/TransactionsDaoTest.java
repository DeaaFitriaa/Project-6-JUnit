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
        int userId = 1;
        TransactionsDao instance = new TransactionsDao();
        String expResult = "Hawaiian Chicken";
        List<Transactions> result = instance.getHistory(userId);
        assertEquals(expResult, result.get(1).getProducts().getName());
    }
}
