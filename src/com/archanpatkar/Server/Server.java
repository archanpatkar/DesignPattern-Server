package com.archanpatkar.Server;



import com.archanpatkar.Utilities.UtilCalls;
import java.io.IOException;

/**
 *
 * @author Archan Patkar
 */
public class Server 
{
    
    public static void main(String[] args) throws IOException
    {



         UtilCalls.mainInitializationUtilCalls(9081);//It's the replacement of ->
//        ServerSocket incoming_REQUEST = NetworkingObjectsFactory.getNetworkObjectServerSocket(9081);
//        Initializer Initialize = (Initializer) InitializerFactory.getServerInitializer();
//        ThreadInitializer TI = (ThreadInitializer) InitializerFactory.getMainThread();
//        Initialize.PreServer();
//        LoginUtility.LInitialize(); 


        UtilCalls.mainServerUtilCalls();//It's the replacement of ->
//  while (true) 
//        {
//            Initialize.DuringServer();
//            NetworkObjects NO = new NetworkObjects();
//             try {
//                 NO.NETWORK_SOCKET = incoming_REQUEST.accept();
//             } catch (IOException ex) {
//                 Log.Put(ex + "Error Accepting Connection");
//             }
//            Log.Put("Server says Connection Established");
//            TI.PreCoversation();
//            ThreadUtility.DoConV(NO,TI);  //it's the repalcement of this ---->
// //            Reader R = ReaderThreadFactory.getReaderThread(NO);
// //            Thread th = new Thread(R);
// //            th.start();
//        }
       
       
        
    }

}
 