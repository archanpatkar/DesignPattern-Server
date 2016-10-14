package com.archanpatkar.Factories;

import com.archanpatkar.Initializer.Initializer;
import com.archanpatkar.Initializer.MainServer;
import com.archanpatkar.Initializer.MainThread;
import com.archanpatkar.Initializer.ThreadInitializer;


public abstract class InitializerFactory {
    
    public static MainServer getServerInitializer()
    {
        return new Initializer();
    }
    
    public static MainThread getMainThread()
    {
       return new ThreadInitializer();
    }
     
}
