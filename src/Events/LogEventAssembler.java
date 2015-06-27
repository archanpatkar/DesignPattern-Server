package Events;

import Events.LogEvent;


public class LogEventAssembler {
    static public LogEvent inEventAssemble(String str,boolean b)
    {
        LogEvent e = new LogEvent();
        e.CLIENT_NAME_FOR_EVENT = str;
        e.CLIENT_LOGGED_IN = b;
        e.IL = new LoggedINEventListener();
        return e;
    }
    static public LogEvent outEventAssemble(String str,boolean b)
    {
        LogEvent e = new LogEvent();
        e.CLIENT_NAME_FOR_EVENT = str;
        e.CLIENT_LOGGED_IN = b;
        e.OL = new LoggedOUTEventListener();
        return e;
    }
}
