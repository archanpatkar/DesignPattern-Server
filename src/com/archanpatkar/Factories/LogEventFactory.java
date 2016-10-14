

package com.archanpatkar.Factories;

import com.archanpatkar.Events.LogEvent;
import com.archanpatkar.Events.LoggedINEventListener;
import com.archanpatkar.Events.LoggedOUTEventListener;


public class LogEventFactory {
    public static LoggedINEventListener getLogINEventHandler()
    {
        return new LoggedINEventListener();
    }
    public static LoggedOUTEventListener getLogOUTEventHandler()
    {
        return new LoggedOUTEventListener();
    }
    public static LogEvent getLogEvent()
    {
        return new LogEvent();
    }
}
