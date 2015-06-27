

package Events;

import Events.LogEvent;


public class LogEventFactory {
    public static LoggedINEventListener getLogINEvent()
    {
        return new LoggedINEventListener();
    }
    public static LoggedOUTEventListener getOUTEvent()
    {
        return new LoggedOUTEventListener();
    }
    public static LogEvent getLogEvent()
    {
        return new LogEvent();
    }
}
