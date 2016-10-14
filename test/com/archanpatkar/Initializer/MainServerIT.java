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
public class MainServerIT {
    
    public MainServerIT() {
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
     * Test of PreServer method, of class MainServer.
     */
    @Test
    public void testPreServer() {
        System.out.println("PreServer");
        MainServer instance = new MainServerImpl();
        instance.PreServer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DuringServer method, of class MainServer.
     */
    @Test
    public void testDuringServer() {
        System.out.println("DuringServer");
        MainServer instance = new MainServerImpl();
        instance.DuringServer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PostServer method, of class MainServer.
     */
    @Test
    public void testPostServer() {
        System.out.println("PostServer");
        MainServer instance = new MainServerImpl();
        instance.PostServer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class MainServerImpl implements MainServer {

        public void PreServer() {
        }

        public void DuringServer() {
        }

        public void PostServer() {
        }
    }
    
}
