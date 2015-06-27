package Events;

import Events.LogEvent;

public interface ILogListener {

    void LoggedOutNotify(LogEvent e);
    void LoggedInNotify(LogEvent e);
        
}
