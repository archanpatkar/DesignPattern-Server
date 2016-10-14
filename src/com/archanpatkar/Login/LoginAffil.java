package com.archanpatkar.Login;

import com.archanpatkar.Events.ILogListener;
import com.archanpatkar.Events.LogEvent;
import java.util.HashMap;


//Login related work is done through this class
public class LoginAffil implements ILogListener{
    public final static HashMap<String, String> CURRENT_SESSION_LOGIN_CACHE = new HashMap<>();
    protected final static HashMap<String, String> RE_CHECKER = new HashMap<>();
    @Override
    final public void LoggedOutNotify(LogEvent e)
    {   
       e.OL.LogOUThook(e.CLIENT_NAME_FOR_EVENT,e.CLIENT_LOGGED_IN);
    }

    @Override
    final public void LoggedInNotify(LogEvent e)
    {
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
