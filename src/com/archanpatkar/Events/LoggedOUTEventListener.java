package com.archanpatkar.Events;

import com.archanpatkar.Login.LoginAffil;

public class LoggedOUTEventListener extends LoginAffil{

    @Override
    public void LogOUThook(String str , boolean b) {

            LoginAffil.RE_CHECKER.remove(str);
       
    }    
}
