package com.archanpatkar.Utilities;

import com.archanpatkar.Network.NetworkObjects;
import com.archanpatkar.Thread.Reader;
import com.archanpatkar.Factories.ReaderThreadFactory;
import com.archanpatkar.Initializer.MainThread;


public class ThreadUtility 
{
    public static void DoConV(NetworkObjects NO,MainThread TI)
    {
        Reader R = ReaderThreadFactory.getReaderThread(NO,TI);
        Thread th = new Thread(R);
        th.start();
    }
    
}
