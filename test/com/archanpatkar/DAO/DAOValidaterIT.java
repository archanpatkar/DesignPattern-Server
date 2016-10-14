/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.archanpatkar.DAO;

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
public class DAOValidaterIT {
    
    public DAOValidaterIT() {
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
     * Test of Validate method, of class DAOValidater.
     */
    @Test
    public void testValidate() {
        System.out.println("Validate");
        String Username = "";
        String Password = "";
        DAOValidater instance = new DAOValidater();
        InformationAboutClient expResult = null;
        InformationAboutClient result = instance.Validate(Username, Password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
