

package com.archanpatkar.Events;

import com.archanpatkar.Login.LoginAffil;


public class LoggedINEventListener extends LoginAffil{

    @Override
    public void LogINhook(String str , boolean b) {
        if(b == true)
        {
             LoginAffil.RE_CHECKER.put(str, "true");
        }
    }
    
}