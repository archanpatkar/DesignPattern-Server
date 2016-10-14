package com.archanpatkar.Events;

import com.archanpatkar.Events.LogEvent;

public interface ILogListener {

    void LoggedOutNotify(LogEvent e);
    void LoggedInNotify(LogEvent e);
        
}
