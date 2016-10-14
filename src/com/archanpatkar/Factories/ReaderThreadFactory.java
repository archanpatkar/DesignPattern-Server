

package com.archanpatkar.Factories;

import com.archanpatkar.Initializer.MainThread;
import com.archanpatkar.Network.NetworkObjects;
import com.archanpatkar.Thread.Conversation;
import com.archanpatkar.Thread.Reader;

public class ReaderThreadFactory {
    public static Reader getReaderThread(NetworkObjects NO,MainThread TI)
    {
        return new Conversation(NO,TI);
    }
}
