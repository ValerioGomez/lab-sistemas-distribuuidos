package servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Implementa extends UnicastRemoteObject implements Interfaz {
    
    public Implementa() throws RemoteException {
        super();
    }

    @Override
    public String decirHola(String nombre) throws RemoteException {
        return "Hola " + nombre;
    }
}
