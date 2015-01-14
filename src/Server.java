import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {

    public static void main(String[] args) {
        try {
            int port = 7771;
            LocateRegistry.createRegistry(port);
            Naming.rebind("rmi://127.0.0.1:"+port+"/myRmi", new RemoteListener());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}