

package Events;

import Server.LoginData;


public class LoggedINEventListener extends LoginData{

    @Override
    public void LogINhook(String str , boolean b) {
        if(b == true)
        {
             LoginData.RE_CHECKER.put(str, "true");
        }
    }
    
}