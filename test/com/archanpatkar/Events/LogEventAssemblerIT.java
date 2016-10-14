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
public class LogEventAssemblerIT {
    
    public LogEventAssemblerIT() {
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
     * Test of inEventAssemble method, of class LogEventAssembler.
     */
    @Test
    public void testInEventAssemble() {
        System.out.println("inEventAssemble");
        String str = "";
        boolean b = false;
        LogEvent expResult = null;
        LogEvent result = LogEventAssembler.inEventAssemble(str, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of outEventAssemble method, of class LogEventAssembler.
     */
    @Test
    public void testOutEventAssemble() {
        System.out.println("outEventAssemble");
        String str = "";
        boolean b = false;
        LogEvent expResult = null;
        LogEvent result = LogEventAssembler.outEventAssemble(str, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
