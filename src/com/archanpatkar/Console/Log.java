package com.archanpatkar.Console;

public class Log 
{
    public static void Put(Object Message)
    {
        Logic(Message);
    }

    private static void Logic(Object o) {
        System.out.println(o);
    }
    
}
