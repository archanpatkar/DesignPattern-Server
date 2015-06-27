package Events;

import java.util.ArrayList;


public class IIAForLogEvent{
    static public ArrayList<ILogListener> al = new  ArrayList<>();
     
    static public void addListener(ILogListener IL)
    {
        al.add(IL);
    }
    
    static public void removeListener(ILogListener IL)
    {
        al.remove(IL);
    }
    
    static public void Notify(LogEvent e)
    {
       if(e.OL == null )
       {
           for(ILogListener IL : al)
           {
               IL.LoggedInNotify(e);
           }
       }
       else 
       {
           for(ILogListener IL : al)
           {
               IL.LoggedOutNotify(e);   
           }
       }
    }
}
