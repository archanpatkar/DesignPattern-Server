package com.archanpatkar.Factories;

import com.archanpatkar.Console.Log;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NetworkingObjectsFactory {
   public static PrintWriter getNetworkObjectWriters(Socket soc) 
   {
       try {
           return new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc.getOutputStream())), true);
       } catch (IOException ex) {
          Log.Put(ex + "Some Error with outgoing connections");
       }
       return null;
   }
   
   public static BufferedReader getNetworkObjectReaders(Socket soc) 
   {
       try {
           return new BufferedReader(new InputStreamReader(soc.getInputStream()));
          } catch (IOException ex) {
          Log.Put(ex + "Some Error with incoming connections");
       }
       return null;
   }
   
   public static ServerSocket getNetworkObjectServerSocket(int port)
   {
       try {
           return new ServerSocket(port);
    } catch (IOException ex) {
          Log.Put(ex + "Some Error with outgoing connections");
       }
       return null;
   }
}
