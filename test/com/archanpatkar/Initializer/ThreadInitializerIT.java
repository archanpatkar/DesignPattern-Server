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
public class ThreadInitializerIT {
    
    public ThreadInitializerIT() {
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
     * Test of PreCoversation method, of class ThreadInitializer.
     */
    @Test
    public void testPreCoversation() {
        System.out.println("PreCoversation");
        ThreadInitializer instance = new ThreadInitializer();
        instance.PreCoversation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DuringConversation method, of class ThreadInitializer.
     */
    @Test
    public void testDuringConversation() {
        System.out.println("DuringConversation");
        ThreadInitializer instance = new ThreadInitializer();
        instance.DuringConversation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PostConversation method, of class ThreadInitializer.
     */
    @Test
    public void testPostConversation() {
        System.out.println("PostConversation");
        ThreadInitializer instance = new ThreadInitializer();
        instance.PostConversation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
