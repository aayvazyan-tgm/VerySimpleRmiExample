import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteListener extends UnicastRemoteObject implements IRemoteListener {

    public RemoteListener() throws RemoteException {

    }

    public void register(String content) throws RemoteException {
        System.out.println("Received: "+content);
    }

}