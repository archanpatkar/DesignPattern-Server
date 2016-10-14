/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.archanpatkar.Factories;

import com.archanpatkar.Initializer.MainServer;
import com.archanpatkar.Initializer.MainThread;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Archan Patkar
 */
public class InitializerFactoryIT {
    
    public InitializerFactoryIT() {
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
     * Test of getServerInitializer method, of class InitializerFactory.
     */
    @Test
    public void testGetServerInitializer() {
        System.out.println("getServerInitializer");
        MainServer expResult = null;
        MainServer result = InitializerFactory.getServerInitializer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMainThread method, of class InitializerFactory.
     */
    @Test
    public void testGetMainThread() {
        System.out.println("getMainThread");
        MainThread expResult = null;
        MainThread result = InitializerFactory.getMainThread();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
