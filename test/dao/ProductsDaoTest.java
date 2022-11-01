/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.pojo.Products;
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
public class ProductsDaoTest {
    
    public ProductsDaoTest() {
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
     * Test of getByProperty method, of class ProductsDao.
     */
    @Test
    public void testGetByProperty() {
        System.out.println("getByProperty");
        String property = "name";
        String value = "Danish";
        ProductsDao instance = new ProductsDao();
        String expResult = "Danish Hotdogs";
        Products result = instance.getByProperty(property, value);
        assertEquals(expResult, result.getDescription());
    }
    
}
