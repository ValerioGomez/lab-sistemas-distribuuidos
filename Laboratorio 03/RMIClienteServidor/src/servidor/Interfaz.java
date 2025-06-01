package servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interfaz extends Remote {
    String decirHola(String nombre) throws RemoteException;
}
