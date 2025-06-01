package servidor;

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.net.*;
import java.io.*;

public class Servidor {
    public static void main(String args[]) {
        InputStreamReader ent = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(ent);
        String numPuerto, URLRegistro = "";

        try {
            System.out.println("Introduce el numero del puerto del registro RMI:");
            numPuerto = buf.readLine().trim();
            int numPuertoRMI = Integer.parseInt(numPuerto);

            arrancarRegistro(numPuertoRMI);

            Implementa objExportado = new Implementa();

            URLRegistro = "rmi://localhost:" + numPuerto + "/holaMundo";
            Naming.rebind(URLRegistro, objExportado);

            System.out.println("Servidor registrado. El registro contiene actualmente:");
            listaRegistro("rmi://localhost:" + numPuerto);
            System.out.println("Servidor Hola Mundo preparado.");

        } catch (Exception excr) {
            System.out.println("Excepción en Servidor.main: " + excr);
        }
    }

    private static void arrancarRegistro(int numPuertoRMI) throws RemoteException {
        try {
            Registry registro = LocateRegistry.getRegistry(numPuertoRMI);
            registro.list();
        } catch (RemoteException e) {
            System.out.println("El registro RMI no se puede localizar en el puerto " + numPuertoRMI);
            Registry registro = LocateRegistry.createRegistry(numPuertoRMI);
            System.out.println("Registro RMI creado en el puerto " + numPuertoRMI);
        }
    }

    private static void listaRegistro(String URLRegistro) throws RemoteException, MalformedURLException {
        System.out.println("El registro " + URLRegistro + " contiene:");
        String[] nombres = Naming.list(URLRegistro);
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
}
