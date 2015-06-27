package Events;

import Server.LoginData;

public class LoggedOUTEventListener extends LoginData{

    @Override
    public void LogOUThook(String str , boolean b) {

            LoginData.RE_CHECKER.remove(str);
       
    }    
}
