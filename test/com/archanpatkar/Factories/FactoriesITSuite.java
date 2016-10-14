/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.archanpatkar.Factories;

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
@Suite.SuiteClasses({com.archanpatkar.Factories.DAOFactoryIT.class, com.archanpatkar.Factories.NetworkingObjectsFactoryIT.class, com.archanpatkar.Factories.InitializerFactoryIT.class, com.archanpatkar.Factories.ReaderThreadFactoryIT.class, com.archanpatkar.Factories.LogEventFactoryIT.class})
public class FactoriesITSuite {

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
