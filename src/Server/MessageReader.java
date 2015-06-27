package Server;

import Events.ILogListener;
import Events.LogEventAssembler;
import Events.LogEvent;
import DAO.DAO;
import DAO.DAOFactory;
import DAO.InformationAboutClient;
import Events.IIAForLogEvent;
import Network.NetworkObjects;
import Network.NetworkingObjectsFactory;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;


class MessageReader extends Reader {
    ArrayList<ILogListener> a = new ArrayList<>();
    private static NetworkObjects NO = new NetworkObjects();
    private static String USERNAME_FROM_CLIENT="";
    private static String PASSWORD_FROM_CLIENT="";
    private static InformationAboutClient INFROMATION_FROM_DAO;
    private static DAO dao = DAOFactory.getDAO();
    public MessageReader(NetworkObjects NO) {
        this.NO = NO;
    }

    @Override
    public void run() {
        try {
            NO.NETWORK_bufferedREADER_SERIES = NetworkingObjectsFactory.getNetworkObjectReaders(NO.NETWORK_SOCKET);
            NO.NETWORK_printWRITER_SERIES = NetworkingObjectsFactory.getNetworkObjectWriters(NO.NETWORK_SOCKET);
            UPSender(NO); 
            System.out.println(INFROMATION_FROM_DAO.bool);
            if (INFROMATION_FROM_DAO.bool.equals("false")) {
                NO.NETWORK_printWRITER_SERIES.println("repeat");
                USERNAME_FROM_CLIENT = NO.NETWORK_bufferedREADER_SERIES.readLine();
                PASSWORD_FROM_CLIENT = NO.NETWORK_bufferedREADER_SERIES.readLine();
                System.out.println(USERNAME_FROM_CLIENT);
                System.out.println(PASSWORD_FROM_CLIENT);
                INFROMATION_FROM_DAO = dao.Validate(USERNAME_FROM_CLIENT, PASSWORD_FROM_CLIENT);
            }
            if (INFROMATION_FROM_DAO.bool.equals("true")) {
                NO.NETWORK_printWRITER_SERIES.println(INFROMATION_FROM_DAO.bool);
                NO.NETWORK_printWRITER_SERIES.println(INFROMATION_FROM_DAO.Username);
                LogEvent LOG_IN_EVENT = LogEventAssembler.inEventAssemble(USERNAME_FROM_CLIENT, true);
                IIAForLogEvent.Notify(LOG_IN_EVENT);
                System.out.println(INFROMATION_FROM_DAO.bool);
                String MESSEGE_FROM_CLIENT = "";
                try {
                    MESSEGE_FROM_CLIENT = NO.NETWORK_bufferedREADER_SERIES.readLine();
                } catch (Exception ex) {
                    System.out.println("Client not Reponding Error ");
                    System.exit(105);
                }
                while (!MESSEGE_FROM_CLIENT.equals("End")) {
                    System.out.println("Server Recived = " + MESSEGE_FROM_CLIENT);
                    MESSEGE_FROM_CLIENT = NO.NETWORK_bufferedREADER_SERIES.readLine();
                }
                LogEvent LOG_OUT_EVENT = LogEventAssembler.outEventAssemble(USERNAME_FROM_CLIENT, false);
                IIAForLogEvent.Notify(LOG_OUT_EVENT);
            } else {
                NO.NETWORK_printWRITER_SERIES.println(INFROMATION_FROM_DAO.bool);
            }
            System.out.println("Client off");
        } catch (Exception MESSAGE_READER_CRASH) {
            System.out.println("Message Reader Thread Crash Error");
            System.exit(150);
        }
    }

    void UPSender(NetworkObjects NO) throws IOException {
        USERNAME_FROM_CLIENT = NO.NETWORK_bufferedREADER_SERIES.readLine();
        PASSWORD_FROM_CLIENT = NO.NETWORK_bufferedREADER_SERIES.readLine();
        System.out.println(USERNAME_FROM_CLIENT);
        System.out.println(PASSWORD_FROM_CLIENT);
        INFROMATION_FROM_DAO = dao.Validate(USERNAME_FROM_CLIENT, PASSWORD_FROM_CLIENT);
    }

}
