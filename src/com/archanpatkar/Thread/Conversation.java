package com.archanpatkar.Thread;

import com.archanpatkar.Console.Encrypt;
import com.archanpatkar.Console.Log;
//import com.archanpatkar.Events.ILogListener;
//import com.archanpatkar.Events.LogEventAssembler;
//import com.archanpatkar.Events.LogEvent;
import com.archanpatkar.DAO.DAO;
import com.archanpatkar.Factories.DAOFactory;
import com.archanpatkar.DAO.InformationAboutClient;
//import com.archanpatkar.Events.IIAForLogEvent;
import com.archanpatkar.Network.NetworkObjects;
import com.archanpatkar.Factories.NetworkingObjectsFactory;
import com.archanpatkar.Initializer.MainThread;
import com.archanpatkar.errorlabel.Label;
import java.io.IOException;
//import java.util.ArrayList;

public class Conversation extends Reader {

    //ArrayList<ILogListener> a = new ArrayList<>();
    private NetworkObjects NO = new NetworkObjects();
    private String USERNAME_FROM_CLIENT = "";
    private String PASSWORD_FROM_CLIENT = "";
    private InformationAboutClient INFROMATION_FROM_DAO;
    private final static DAO dao = DAOFactory.getDAO();
    private final MainThread TI;

    public Conversation(NetworkObjects NO, MainThread TI) {
        this.NO = NO;
        this.TI = TI;
    }

    @Override
    final public void run() 
    {
        TI.DuringConversation();
        Logic();
        TI.PostConversation();
    }

    private void UPSender(NetworkObjects NO) throws IOException {
        Encrypt.Put("Entering  UPSender");
        USERNAME_FROM_CLIENT = NO.NETWORK_bufferedREADER_SERIES.readLine();
        PASSWORD_FROM_CLIENT = NO.NETWORK_bufferedREADER_SERIES.readLine();
        Encrypt.Put("inBetween UPSender");
        Encrypt.Put(USERNAME_FROM_CLIENT);
        Encrypt.Put(PASSWORD_FROM_CLIENT);
        INFROMATION_FROM_DAO = dao.Validate(USERNAME_FROM_CLIENT, PASSWORD_FROM_CLIENT);
        Encrypt.Put("Leaving UPSender");
    }

    private void Logic() 
    {
        try {
            Encrypt.Put("Entering Logic");
            NO.NETWORK_bufferedREADER_SERIES = NetworkingObjectsFactory.getNetworkObjectReaders(NO.NETWORK_SOCKET);
            NO.NETWORK_printWRITER_SERIES = NetworkingObjectsFactory.getNetworkObjectWriters(NO.NETWORK_SOCKET);
            Encrypt.Put("Checking");
            UPSender(NO);
            Encrypt.Put(INFROMATION_FROM_DAO.bool);
            if (INFROMATION_FROM_DAO.bool.equals("false")) {
//                NO.NETWORK_printWRITER_SERIES.println("repeat");
//                USERNAME_FROM_CLIENT = NO.NETWORK_bufferedREADER_SERIES.readLine();
//                PASSWORD_FROM_CLIENT = NO.NETWORK_bufferedREADER_SERIES.readLine();
//                Encrypt.Put(USERNAME_FROM_CLIENT);
//                Encrypt.Put(PASSWORD_FROM_CLIENT);
//                INFROMATION_FROM_DAO = dao.Validate(USERNAME_FROM_CLIENT, PASSWORD_FROM_CLIENT); 
                int i = 0;
                while(i < 3)
                {
                    NO.NETWORK_printWRITER_SERIES.println(INFROMATION_FROM_DAO.bool);
                    NO.NETWORK_printWRITER_SERIES.println("Nothing");
                    UPSender(NO);
                    if (INFROMATION_FROM_DAO.bool.equals("true")) 
                    {
                        break;
                    }
                }
            }
            if (INFROMATION_FROM_DAO.bool.equals("true")) {
                NO.NETWORK_printWRITER_SERIES.println(INFROMATION_FROM_DAO.bool);
                NO.NETWORK_printWRITER_SERIES.println(INFROMATION_FROM_DAO.Username);
//                LogEvent LOG_IN_EVENT = LogEventAssembler.inEventAssemble(USERNAME_FROM_CLIENT, true);
//                IIAForLogEvent.Notify(LOG_IN_EVENT);   // implict invokation architechture some mistake ERROR  lOG IN EVENT   
                Encrypt.Put(INFROMATION_FROM_DAO.bool);
                String MESSEGE_FROM_CLIENT = "";
//                try {
//                    MESSEGE_FROM_CLIENT = NO.NETWORK_bufferedREADER_SERIES.readLine();
//                } catch (Exception ex) {
//                    Log.Put("Client not Reponding Error");
//                    System.exit(105);
//                }
                while (!MESSEGE_FROM_CLIENT.equals("End")) { 
                    MESSEGE_FROM_CLIENT = NO.NETWORK_bufferedREADER_SERIES.readLine();
                    Encrypt.Put("Server Recived = " + MESSEGE_FROM_CLIENT);
                }
//                LogEvent LOG_OUT_EVENT = LogEventAssembler.outEventAssemble(USERNAME_FROM_CLIENT, false);
//                IIAForLogEvent.Notify(LOG_OUT_EVENT); implict invokation architechture some mistake ERROR  lOG OUT EVENT   
            } else {
                NO.NETWORK_printWRITER_SERIES.println(INFROMATION_FROM_DAO.bool);
                NO.NETWORK_printWRITER_SERIES.println("Nothing");
            }
            Log.Put("Client off");
        } catch (Exception MESSAGE_READER_CRASH) {
            Log.Put("Message Reader for " + INFROMATION_FROM_DAO.Username + "Thread Crash Error" + Label.getLabel());
            //System.exit(150);
        }
    }
    
    
}