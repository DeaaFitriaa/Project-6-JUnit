/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

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
public class BaseDaoTest {
    
    public BaseDaoTest() {
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
     * Test of getAll method, of class BaseDao.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        Class pojo = null;
        BaseDao instance = new BaseDao();
        List<Object> expResult = null;
        List<Object> result = instance.getAll(pojo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllWithFetch method, of class BaseDao.
     */
    @Test
    public void testGetAllWithFetch() {
        System.out.println("getAllWithFetch");
        Class pojo = null;
        List<String> fetchs = null;
        BaseDao instance = new BaseDao();
        List<Object> expResult = null;
        List<Object> result = instance.getAllWithFetch(pojo, fetchs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class BaseDao.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        Class pojo = null;
        int id = 0;
        BaseDao instance = new BaseDao();
        Object expResult = null;
        Object result = instance.getById(pojo, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByIdWithFetch method, of class BaseDao.
     */
    @Test
    public void testGetByIdWithFetch() {
        System.out.println("getByIdWithFetch");
        Class pojo = null;
        int id = 0;
        List<String> fetchs = null;
        BaseDao instance = new BaseDao();
        Object expResult = null;
        Object result = instance.getByIdWithFetch(pojo, id, fetchs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByProperty method, of class BaseDao.
     */
    @Test
    public void testGetByProperty() {
        System.out.println("getByProperty");
        Class pojo = null;
        String property = "";
        Object value = null;
        BaseDao instance = new BaseDao();
        Object expResult = null;
        Object result = instance.getByProperty(pojo, property, value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class BaseDao.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Object pojo = null;
        BaseDao instance = new BaseDao();
        boolean expResult = false;
        boolean result = instance.update(pojo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class BaseDao.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Object pojo = null;
        BaseDao instance = new BaseDao();
        boolean expResult = false;
        boolean result = instance.create(pojo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class BaseDao.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Object pojo = null;
        BaseDao instance = new BaseDao();
        boolean expResult = false;
        boolean result = instance.delete(pojo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
