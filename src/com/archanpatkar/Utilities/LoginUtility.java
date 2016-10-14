package com.archanpatkar.Utilities;

import com.archanpatkar.Events.IIAForLogEvent;
import com.archanpatkar.Login.LoginAffil;

public class LoginUtility 
{
    public static void LInitialize()
    {
        LoginAffil.CURRENT_SESSION_LOGIN_CACHE.put("shri", "hari");
        LoginAffil.CURRENT_SESSION_LOGIN_CACHE.put("walt", "disney");
        LoginAffil.CURRENT_SESSION_LOGIN_CACHE.put("apple", "google");
    }
    
    public static void EInitialize()
    {
        LoginAffil LOG_OBJ_FOR_EVENTS = new LoginAffil();
        IIAForLogEvent.addListener(LOG_OBJ_FOR_EVENTS);
    }
    
}
