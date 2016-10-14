/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.archanpatkar.Factories;

import com.archanpatkar.Initializer.MainThread;
import com.archanpatkar.Network.NetworkObjects;
import com.archanpatkar.Thread.Reader;
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
public class ReaderThreadFactoryIT {
    
    public ReaderThreadFactoryIT() {
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
     * Test of getReaderThread method, of class ReaderThreadFactory.
     */
    @Test
    public void testGetReaderThread() {
        System.out.println("getReaderThread");
        NetworkObjects NO = null;
        MainThread TI = null;
        Reader expResult = null;
        Reader result = ReaderThreadFactory.getReaderThread(NO, TI);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
