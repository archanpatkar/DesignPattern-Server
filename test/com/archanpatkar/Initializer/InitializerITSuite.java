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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Archan Patkar
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.archanpatkar.Initializer.ThreadInitializerIT.class, com.archanpatkar.Initializer.MainServerIT.class, com.archanpatkar.Initializer.MainThreadIT.class, com.archanpatkar.Initializer.InitializerIT.class})
public class InitializerITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}