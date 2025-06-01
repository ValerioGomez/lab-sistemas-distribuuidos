package cliente;

import java.io.*;
import java.rmi.*;
import servidor.Interfaz;

public class Cliente {
    public static void main(String[] args) {
        try {
            int numPuertoRMI;
            String nombreNodo;

            InputStreamReader ent = new InputStreamReader(System.in);
            BufferedReader buf = new BufferedReader(ent);

            System.out.println("Introduce el nombre del nodo del registro RMI:");
            nombreNodo = buf.readLine();

            System.out.println("Introduce el numero de puerto del registro RMI:");
            String numPuerto = buf.readLine();
            numPuertoRMI = Integer.parseInt(numPuerto);

            String URLRegistro = "rmi://" + nombreNodo + ":" + numPuertoRMI + "/holaMundo";

            Interfaz h = (Interfaz) Naming.lookup(URLRegistro);
            System.out.println("Busqueda completa");

            String mensaje = h.decirHola("Valerio Gomez");
            System.out.println("HolaMundoCliente: " + mensaje);

        } catch (IOException | NumberFormatException | NotBoundException e) {
            System.out.println("Excepción en HolaMundoCliente: " + e);
        }
    }
}
