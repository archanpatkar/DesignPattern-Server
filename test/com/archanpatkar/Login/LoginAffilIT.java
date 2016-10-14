/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.archanpatkar.Login;

import com.archanpatkar.Events.LogEvent;
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
public class LoginAffilIT {
    
    public LoginAffilIT() {
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
     * Test of LoggedOutNotify method, of class LoginAffil.
     */
    @Test
    public void testLoggedOutNotify() {
        System.out.println("LoggedOutNotify");
        LogEvent e = null;
        LoginAffil instance = new LoginAffil();
        instance.LoggedOutNotify(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LoggedInNotify method, of class LoginAffil.
     */
    @Test
    public void testLoggedInNotify() {
        System.out.println("LoggedInNotify");
        LogEvent e = null;
        LoginAffil instance = new LoginAffil();
        instance.LoggedInNotify(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LogINhook method, of class LoginAffil.
     */
    @Test
    public void testLogINhook() {
        System.out.println("LogINhook");
        String str = "";
        boolean b = false;
        LoginAffil instance = new LoginAffil();
        instance.LogINhook(str, b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LogOUThook method, of class LoginAffil.
     */
    @Test
    public void testLogOUThook() {
        System.out.println("LogOUThook");
        String str = "";
        boolean b = false;
        LoginAffil instance = new LoginAffil();
        instance.LogOUThook(str, b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
