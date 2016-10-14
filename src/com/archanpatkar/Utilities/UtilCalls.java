/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.archanpatkar.Utilities;

import com.archanpatkar.Console.Log;
import com.archanpatkar.Factories.InitializerFactory;
import com.archanpatkar.Factories.NetworkingObjectsFactory;
import com.archanpatkar.Initializer.Initializer;
import com.archanpatkar.Initializer.ThreadInitializer;
import com.archanpatkar.Network.NetworkObjects;
import com.archanpatkar.errorlabel.Label;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author archanpatkar
 */
public class UtilCalls {

    private static int port;
    private static ServerSocket incoming_REQUEST;
    private static Initializer Initialize;
    private static ThreadInitializer TI;

    public static void mainInitializationUtilCalls(int port) throws IOException {
        port = UtilCalls.port;
        incoming_REQUEST = NetworkingObjectsFactory.getNetworkObjectServerSocket(port);
        Initialize = (Initializer) InitializerFactory.getServerInitializer();
        TI = (ThreadInitializer) InitializerFactory.getMainThread();
        Initialize.PreServer();
        LoginUtility.LInitialize();
        //it's the repalcement of this ---->
        //        LoginData.UP_LOGIN_DATA.put("shri", "hari");
        //        LoginData.UP_LOGIN_DATA.put("walt", "disney");
        //        LoginData.UP_LOGIN_DATA.put("apple", "google");
        LoginUtility.EInitialize();
        //it's the repalcement of this ---->
        //        LoginData LOG_OBJ_FOR_EVENTS = new LoginData();
        //        IIAForLogEvent.addListener(LOG_OBJ_FOR_EVENTS);Ï
    }
    
    
    public static void mainServerUtilCalls(){
         while (true) 
        {
            Initialize.DuringServer();
            NetworkObjects NO = new NetworkObjects();
             try {
                 NO.NETWORK_SOCKET = incoming_REQUEST.accept();
             } catch (IOException ex) {
                 Log.Put(ex + "Error Accepting Connection" + " " + Label.getLabel());
             }
            Log.Put("Server says Connection Established");
            TI.PreCoversation();
            ThreadUtility.DoConV(NO,TI);  //it's the repalcement of this ---->
//            Reader R = ReaderThreadFactory.getReaderThread(NO);
//            Thread th = new Thread(R);
//            th.start();
        }
    }

}
