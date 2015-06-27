
package Server;

import Events.IIAForLogEvent;
import Network.NetworkObjects;
import java.io.IOException;
import java.net.ServerSocket;

public class Server {

    public static void main(String[] args) throws IOException {
        LoginData.UP_LOGIN_DATA.put("shri", "hari");
        LoginData.UP_LOGIN_DATA.put("walt", "disney");
        LoginData.UP_LOGIN_DATA.put("apple", "google");
        LoginData LOG_OBJ_FOR_EVENTS = new LoginData();
        IIAForLogEvent.addListener(LOG_OBJ_FOR_EVENTS);
        ServerSocket ss = new ServerSocket(9081);
        while(true)
        {
           NetworkObjects NO =  new NetworkObjects();
           NO.NETWORK_SOCKET = ss.accept();
           System.out.println("Server says connection estabhilshed");
           Reader R = ReaderThreadFactory.getReaderThread(NO);
           Thread th = new Thread(R);
           th.start();
        }
    }
    
}