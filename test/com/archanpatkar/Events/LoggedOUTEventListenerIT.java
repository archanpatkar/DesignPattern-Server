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
public class LoggedOUTEventListenerIT {
    
    public LoggedOUTEventListenerIT() {
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
     * Test of LogOUThook method, of class LoggedOUTEventListener.
     */
    @Test
    public void testLogOUThook() {
        System.out.println("LogOUThook");
        String str = "";
        boolean b = false;
        LoggedOUTEventListener instance = new LoggedOUTEventListener();
        instance.LogOUThook(str, b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
