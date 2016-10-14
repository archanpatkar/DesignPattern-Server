/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.archanpatkar.Events;

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
public class LoggedINEventListenerIT {
    
    public LoggedINEventListenerIT() {
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
     * Test of LogINhook method, of class LoggedINEventListener.
     */
    @Test
    public void testLogINhook() {
        System.out.println("LogINhook");
        String str = "";
        boolean b = false;
        LoggedINEventListener instance = new LoggedINEventListener();
        instance.LogINhook(str, b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
