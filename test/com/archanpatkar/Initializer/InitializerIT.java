/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.archanpatkar.Initializer;

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
public class InitializerIT {
    
    public InitializerIT() {
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
     * Test of PreServer method, of class Initializer.
     */
    @Test
    public void testPreServer() {
        System.out.println("PreServer");
        Initializer instance = new Initializer();
        instance.PreServer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DuringServer method, of class Initializer.
     */
    @Test
    public void testDuringServer() {
        System.out.println("DuringServer");
        Initializer instance = new Initializer();
        instance.DuringServer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PostServer method, of class Initializer.
     */
    @Test
    public void testPostServer() {
        System.out.println("PostServer");
        Initializer instance = new Initializer();
        instance.PostServer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
