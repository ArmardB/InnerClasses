package bellamy.armard.InnerClasses;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class ConnectionManager {
    public ArrayList<ManageConnection> connections;

    public ManageConnection createManagedConnection(String IP, int port, Protocol protocol){

        return new ManageConnection(IP, port, protocol);
    }


    private class ManageConnection implements Connection{
        private Boolean status;
        private String IP;
        private int port;
        private Protocol protocolType;
        private int maxConnectionNumber = 3;


        public ManageConnection(String IP, int port, Protocol protocolType){
            this.IP = IP;
            this.port = port;
            this.protocolType = protocolType;

        }

        public String getIP() {
            return IP;
        }

        public void setIP(String IP) {
            this.IP = IP;
        }

        public int getPort() {
            return port;
        }

        public void setPort(int port) {
            this.port = port;
        }

        public Protocol getProtocol() {
            return null;
        }

        public void setProtocol(Protocol protocol) {
            this.protocolType = protocol;
        }

        public String connect() {
            return null;
        }

        public String close(){
            return "";
        }

        public ArrayList<ManageConnection> getConnects(){
            return connections;
        }

        public String connection(){
            return "";
        }

        public ManageConnection makeConnection(ManageConnection connection){

        }

        public int getMaxConnectionNumber(){
            return this.maxConnectionNumber;
        }

        public void setConnection(ArrayList<Collection> connection){
            this.con = connection;
        }



        public ManageConnection getConnection(int port, String IP){
            ManageConnection connectIt = null;
            for (ManageConnection mc : connections){
                if ((mc.getPort() == port) && (mc.getIP() == IP)){
                    connectIt = mc;
                }
            }
            return connectIt;
        }

        public ManageConnection getConnection(Protocol protocol, String ip){
            ManageConnection connectIt = null;
            for (ManageConnection mc: connections){
                if ((mc.getProtocol() == protocol) && (mc.getIP() == ip)){
                    connectIt = mc;
                }
            }
            return connectIt;
        }


    }


}
