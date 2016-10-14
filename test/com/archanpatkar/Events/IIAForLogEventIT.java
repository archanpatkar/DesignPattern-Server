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
public class IIAForLogEventIT {
    
    public IIAForLogEventIT() {
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
     * Test of addListener method, of class IIAForLogEvent.
     */
    @Test
    public void testAddListener() {
        System.out.println("addListener");
        ILogListener IL = null;
        IIAForLogEvent.addListener(IL);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeListener method, of class IIAForLogEvent.
     */
    @Test
    public void testRemoveListener() {
        System.out.println("removeListener");
        ILogListener IL = null;
        IIAForLogEvent.removeListener(IL);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Notify method, of class IIAForLogEvent.
     */
    @Test
    public void testNotify() {
        System.out.println("Notify");
        LogEvent e = null;
        IIAForLogEvent.Notify(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
