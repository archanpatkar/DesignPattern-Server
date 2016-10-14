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
public class MainThreadIT {
    
    public MainThreadIT() {
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
     * Test of PreCoversation method, of class MainThread.
     */
    @Test
    public void testPreCoversation() {
        System.out.println("PreCoversation");
        MainThread instance = new MainThreadImpl();
        instance.PreCoversation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DuringConversation method, of class MainThread.
     */
    @Test
    public void testDuringConversation() {
        System.out.println("DuringConversation");
        MainThread instance = new MainThreadImpl();
        instance.DuringConversation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PostConversation method, of class MainThread.
     */
    @Test
    public void testPostConversation() {
        System.out.println("PostConversation");
        MainThread instance = new MainThreadImpl();
        instance.PostConversation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class MainThreadImpl implements MainThread {

        public void PreCoversation() {
        }

        public void DuringConversation() {
        }

        public void PostConversation() {
        }
    }
    
}
