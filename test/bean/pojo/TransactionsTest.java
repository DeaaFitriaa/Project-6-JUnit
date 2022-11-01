/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.pojo;

import dao.PaymentsDao;
import dao.ProductsDao;
import dao.TransactionsDao;
import dao.UsersDao;
import java.util.Date;
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
public class TransactionsTest {
    
    TransactionsDao dao = new TransactionsDao();
    PaymentsDao paymentDao = new PaymentsDao();
    ProductsDao productDao = new ProductsDao();
    UsersDao userDao = new UsersDao();
    
    Payments payment = paymentDao.getById(3);
    Products product = productDao.getByProperty("id", 7);
    Users user = userDao.getById(1);
    
    Transactions createTrue = new Transactions();
    Transactions createFalse = new Transactions();
    Transactions deleteTrue = new Transactions();
    Transactions deleteFalse = new Transactions();
    
    
    public TransactionsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
//        deleteTrue.setProducts(product);
//        deleteTrue.setName("deleteTrue");
//        deleteTrue.setPayments(payment);
//        deleteTrue.setTimestamp(new Date());
//        deleteTrue.create(user);
//        
//        deleteFalse.setProducts(product);
//        deleteFalse.setName("deleteFalse");
//        deleteFalse.setPayments(payment);
//        deleteFalse.setTimestamp(new Date());
//        deleteFalse.create(user);
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of getHistory method, of class Transactions.
     */
    @Test
    public void testGetHistory_int() {
        System.out.println("getHistory");
        int userId = 1;
        Transactions instance = new Transactions();
        String result = instance.getHistory(userId);
        int length = result.length();
        assertTrue(length != 0);
    }

    /**
     * Test of create method, of class Transactions.
     */
    @Test
    public void testCreateTrue() {
        System.out.println("createTrue");
        Transactions instance = new Transactions();
        instance.setProductName("Veggie Garden");
        instance.setPaymentId(3);
        instance.setName("White Box Test True");
        instance.setEmail(user.getEmail());
        instance.setPhoneNumber(user.getPhoneNumber());
        instance.setAddress(user.getAddress());
        instance.setPaid(false);
        instance.setTimestamp(new Date());
        String expResult = "success.xhtml";
        String result = instance.create(user);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of create method, of class Transactions.
     */
    @Test
    public void testCreateFalse() {
        System.out.println("createFalse");
        Transactions instance = new Transactions();
        instance.setProductName("Veggie Garden");
        instance.setName("White Box Test True");
        instance.setEmail(user.getEmail());
        instance.setPhoneNumber(user.getPhoneNumber());
        instance.setAddress(user.getAddress());
        instance.setPaid(false);
        instance.setTimestamp(new Date());
        String expResult = "error.xhtml";
        String result = instance.create(user);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class Transactions.
     */
    @Test
    public void testDeleteTrue() {
        System.out.println("deleteTrue");
        Transactions transaction = (Transactions)dao.getByProperty(Transactions.class, "id", 10);
        int userId = 0;
        Transactions instance = new Transactions();
        String result = instance.delete(transaction, userId);
        Transactions newTransaction = (Transactions)dao.getByProperty(Transactions.class, "id", 10);
        assertNull(newTransaction);
    }
    
    
}
