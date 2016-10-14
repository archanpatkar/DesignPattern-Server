/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.archanpatkar.Factories;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
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
public class NetworkingObjectsFactoryIT {
    
    public NetworkingObjectsFactoryIT() {
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
     * Test of getNetworkObjectWriters method, of class NetworkingObjectsFactory.
     */
    @Test
    public void testGetNetworkObjectWriters() throws Exception {
        System.out.println("getNetworkObjectWriters");
        Socket soc = null;
        PrintWriter expResult = null;
        PrintWriter result = NetworkingObjectsFactory.getNetworkObjectWriters(soc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNetworkObjectReaders method, of class NetworkingObjectsFactory.
     */
    @Test
    public void testGetNetworkObjectReaders() throws Exception {
        System.out.println("getNetworkObjectReaders");
        Socket soc = null;
        BufferedReader expResult = null;
        BufferedReader result = NetworkingObjectsFactory.getNetworkObjectReaders(soc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNetworkObjectServerSocket method, of class NetworkingObjectsFactory.
     */
    @Test
    public void testGetNetworkObjectServerSocket() throws Exception {
        System.out.println("getNetworkObjectServerSocket");
        int port = 0;
        ServerSocket expResult = null;
        ServerSocket result = NetworkingObjectsFactory.getNetworkObjectServerSocket(port);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
