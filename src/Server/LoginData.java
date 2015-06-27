package Server;

import Events.ILogListener;
import Events.LogEvent;
import java.util.HashMap;

public class LoginData implements ILogListener{
    public final static HashMap<String, String> UP_LOGIN_DATA = new HashMap<>();
    public final static HashMap<String, String> RE_CHECKER = new HashMap<>();
    @Override
    final public void LoggedOutNotify(LogEvent e){
        
       e.OL.LogOUThook(e.CLIENT_NAME_FOR_EVENT,e.CLIENT_LOGGED_IN);
    }

    @Override
    final public void LoggedInNotify(LogEvent e) {
       e.IL.LogINhook(e.CLIENT_NAME_FOR_EVENT,e.CLIENT_LOGGED_IN);
    }
    
    public void LogINhook(String str , boolean b)
    {
        System.out.println("Log IN hook of Login Data");
    }
    
    public void LogOUThook(String str , boolean b)
    {
        System.out.println("Log OUT hook of Login Data");
    }
    
}
