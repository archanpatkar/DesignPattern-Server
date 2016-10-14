package com.archanpatkar.Events;

import com.archanpatkar.Events.LogEvent;
import com.archanpatkar.Factories.LogEventFactory;


public class LogEventAssembler {
    static public LogEvent inEventAssemble(String str,boolean b)
    {
        LogEvent e = LogEventFactory.getLogEvent();
        e.CLIENT_NAME_FOR_EVENT = str;
        e.CLIENT_LOGGED_IN = b;
        e.IL = LogEventFactory.getLogINEventHandler();
        return e;
    }
    static public LogEvent outEventAssemble(String str,boolean b)
    {
        LogEvent e = LogEventFactory.getLogEvent();
        e.CLIENT_NAME_FOR_EVENT = str;
        e.CLIENT_LOGGED_IN = b;
        e.OL = LogEventFactory.getLogOUTEventHandler();
        return e;
    }
}
