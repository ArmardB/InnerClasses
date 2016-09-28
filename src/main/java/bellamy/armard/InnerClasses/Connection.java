package bellamy.armard.InnerClasses;

/**
 * Created by armardbellamy on 9/27/16.
 */
public interface Connection {

    String getIP();
    void setIP(String IP);
    int getPort();
    void setPort(int port);
    Protocol getProtocol();
    void setProtocol(Protocol protocol);
    String connect();
    String close();



}
