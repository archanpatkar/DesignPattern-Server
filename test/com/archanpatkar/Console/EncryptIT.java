/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.archanpatkar.Console;

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
public class EncryptIT {
    
    public EncryptIT() {
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
     * Test of Put method, of class Encrypt.
     */
    @Test
    public void testPut() {
        System.out.println("Put");
        String Encryptant = "";
        Encrypt.Put(Encryptant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EncryptTheFollowing method, of class Encrypt.
     */
    @Test
    public void testEncryptTheFollowing() {
        System.out.println("EncryptTheFollowing");
        String Encryptant = "";
        String expResult = "";
        String result = Encrypt.EncryptTheFollowing(Encryptant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
