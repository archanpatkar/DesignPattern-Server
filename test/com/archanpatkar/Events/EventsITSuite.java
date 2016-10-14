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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Archan Patkar
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.archanpatkar.Events.ILogListenerIT.class, com.archanpatkar.Events.LogEventIT.class, com.archanpatkar.Events.LoggedOUTEventListenerIT.class, com.archanpatkar.Events.IIAForLogEventIT.class, com.archanpatkar.Events.LoggedINEventListenerIT.class, com.archanpatkar.Events.LogEventAssemblerIT.class})
public class EventsITSuite {

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
