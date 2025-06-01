package servidor;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor {
    public static void main(String[] args) {
        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream in;
        DataOutputStream out;
        final int PUERTO = 9393;

        try {
            // Se crea el socket del servidor
            servidor = new ServerSocket(PUERTO);
            System.out.println("Servidor Hola Mundo preparado.");

            while (true) {
                // Espera a que un cliente se conecte
                sc = servidor.accept();
                System.out.println("Cliente conectado");

                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());

                // Se lee el mensaje que envía el cliente
                String mensaje = in.readUTF();
                System.out.println("Cliente dice: " + mensaje);

                // Se envía una respuesta al cliente
                out.writeUTF("HolaMundoServidor");

                // Cerrar la conexión
                sc.close();
                System.out.println("Cliente desconectado");
            }

        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
