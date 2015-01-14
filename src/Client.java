import java.rmi.Naming;

public class Client {
    public static void main(String serverSocket) {
        try {
            String[] args=serverSocket.split(":");
            String url = "rmi://"+args[0]+":"+args[1]+"/myRmi";
            IRemoteListener listener = (IRemoteListener) Naming.lookup(url);
            listener.register("RMI TEST");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}