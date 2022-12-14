/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientesockettcp;

/**
 *
 * @author ramon
 */
import java.net.*; // para manejar los sockets
import java.io.*; // para menejar los streams

public class Cliente
{
    /**
     * ATTRIBUTES
     */
    // puede usar cualquier host para acceder a otras máquinas de la red
    // public static final String HOST = "192.168.1.4";
    public static final String HOST="localhost";

    int puerto;

    /**
     * CONSTRUCTORS
     * @param num_puerto
     */
    public Cliente(int num_puerto)
    {
        puerto=num_puerto;
    }//End of Constructor

    /**
     * METHODS
     */
    // para iniciar el cliente
    public void iniciar()
    {
        try
        {
            // Me conecto al servidor en un determinado puerto
            Socket sCliente=new Socket(HOST, puerto);

            // TAREAS QUE REALIZA EL  CLIENTE
            
            // establecer el flujo de entrada denominado flujo entrada
            InputStream aux=sCliente.getInputStream();
            DataInputStream flujo_entrada=new DataInputStream(aux);

            // Leer la información mandada por el servidor y mostrarla por pantalla
            System.out.println(flujo_entrada.readUTF());

            // establecer un flujo de salida llamado flujo_salida.
            OutputStream aux2=sCliente.getOutputStream();
            DataOutputStream flujo_salida=new DataOutputStream(aux2);

            // Enviar información al servidor
            flujo_salida.writeUTF("Hola servidor");

            // Cerrar la conexión con el servidor
            sCliente.close();
        }catch(UnknownHostException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Error, host desconocido o inaccesible: "+HOST);

        }catch(IOException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Error de E/S, en el Cliente del socket.");
        }//End of TRY/CATCH/FINALLY
    }//End of Method iniciar
}//End of class Cliente
