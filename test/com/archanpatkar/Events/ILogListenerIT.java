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
public class ILogListenerIT {
    
    public ILogListenerIT() {
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
     * Test of LoggedOutNotify method, of class ILogListener.
     */
    @Test
    public void testLoggedOutNotify() {
        System.out.println("LoggedOutNotify");
        LogEvent e = null;
        ILogListener instance = new ILogListenerImpl();
        instance.LoggedOutNotify(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LoggedInNotify method, of class ILogListener.
     */
    @Test
    public void testLoggedInNotify() {
        System.out.println("LoggedInNotify");
        LogEvent e = null;
        ILogListener instance = new ILogListenerImpl();
        instance.LoggedInNotify(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ILogListenerImpl implements ILogListener {

        public void LoggedOutNotify(LogEvent e) {
        }

        public void LoggedInNotify(LogEvent e) {
        }
    }
    
}
