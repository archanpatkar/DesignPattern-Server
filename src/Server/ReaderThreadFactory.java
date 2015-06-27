

package Server;

import Network.NetworkObjects;

public class ReaderThreadFactory {
    static Reader getReaderThread(NetworkObjects NO)
    {
        return new MessageReader(NO);
    }
}
