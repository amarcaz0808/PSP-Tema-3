/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorsockettcp;

/**
 *
 * @author ramon
 */
import java.net.*; // para manejar los sockets
import java.io.*; // para menejar los streams

public class Servidor {

    int puerto;

    // constructor
    public Servidor(int num_puerto) {
        puerto = num_puerto;
    } // fin constructor

    public void iniciar() {

        ServerSocket skServidor = null; //Socket para aceptar conexiones

        try {
            // Inicio la escucha del servidor en un determinado puerto
            skServidor = new ServerSocket(puerto);
            System.out.println("Escucho por el puerto " + puerto);

            // Espero a que se conecten 3 clientes y creo un nuevo socket para cada cliente
            for (int nCli = 1; nCli <= 3; nCli++) {
                // esperar a que se conecte un cliente
                Socket sCliente = skServidor.accept();

                System.out.println("Sirvo al cliente " + nCli);

                // establecer un flujo de salida llamado flujo_salida.
                OutputStream aux = sCliente.getOutputStream();
                DataOutputStream flujo_salida = new DataOutputStream(aux);
                
                // Enviar información al cliente
                flujo_salida.writeUTF("Hola cliente " + nCli);
                
                // establecer el flujo de entrada denominado flujo entrada
                InputStream aux2 = sCliente.getInputStream();
                DataInputStream flujo_entrada = new DataInputStream(aux2);

                // Leer la información mandada por el cliente y mostrarla por pantalla
                System.out.println(flujo_entrada.readUTF());

                // cerrar el socket => cerrar la conexión con el cliente
                // no hace falta el try..catch ya que está puesto
                sCliente.close();

            } // fin for

            System.out.println("Ya se han atendido los 3 clientes");

        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Error de E/S en el Servidor del socket");

        } finally {
            // Cerrar el socket servidor               
            if (skServidor != null) //ServerSocket
            {
                try {
                    skServidor.close();
                } catch (IOException ex) {
                    System.err.println("Error al cerrar ServerSocket.");
                    System.err.print(ex.toString());
                }
            }
        }

    } // fin iniciar

} // fin clase Servidor
