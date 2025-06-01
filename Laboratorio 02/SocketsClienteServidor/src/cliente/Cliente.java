package cliente;

import java.io.*;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {
    public static void main(String[] args) {
        final String HOST = "localhost";
        final int PUERTO = 9393;
        DataInputStream in;
        DataOutputStream out;

        try {
            // Socket para conectar con el servidor
            Socket sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            // Mensaje enviado al servidor
            out.writeUTF("HolaMundoCliente");

            // Mensaje recibido del servidor
            String mensaje = in.readUTF();
            System.out.println("Servidor dice: " + mensaje);

            sc.close();
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
