import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRemoteListener extends Remote {

    public void register(String content) throws RemoteException;

}