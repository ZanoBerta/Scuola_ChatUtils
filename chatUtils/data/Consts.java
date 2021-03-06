package chatUtils.data;

import java.net.InetAddress;



/**
 *
 * @author Edoardo Zanoni
 */
public class Consts {
    
    public static final InetAddress INETADDRESS = InetAddress.getLoopbackAddress();
    public static final int PORT = 1337;
    public static final int BUFFER_DIMENSION = 10000;
    public static final String dateFormat = "E dd/MM/yy-kk.mm";
    
    public static final int CLIENT_THREADS = 10;
    public static final int TALKER_THREADS = 2;
}
