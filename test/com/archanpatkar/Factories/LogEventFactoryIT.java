/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.archanpatkar.Factories;

import com.archanpatkar.Events.LogEvent;
import com.archanpatkar.Events.LoggedINEventListener;
import com.archanpatkar.Events.LoggedOUTEventListener;
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
public class LogEventFactoryIT {
    
    public LogEventFactoryIT() {
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
     * Test of getLogINEventHandler method, of class LogEventFactory.
     */
    @Test
    public void testGetLogINEventHandler() {
        System.out.println("getLogINEvent");
        LoggedINEventListener expResult = null;
        LoggedINEventListener result = LogEventFactory.getLogINEventHandler();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogOUTEventHandler method, of class LogEventFactory.
     */
    @Test
    public void testGetLogOUTEventHandler() {
        System.out.println("getOUTEvent");
        LoggedOUTEventListener expResult = null;
        LoggedOUTEventListener result = LogEventFactory.getLogOUTEventHandler();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogEvent method, of class LogEventFactory.
     */
    @Test
    public void testGetLogEvent() {
        System.out.println("getLogEvent");
        LogEvent expResult = null;
        LogEvent result = LogEventFactory.getLogEvent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
