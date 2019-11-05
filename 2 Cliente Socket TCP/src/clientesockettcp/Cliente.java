/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesockettcp;

/**
 *
 * @author ramon
 */
import java.io.IOException;
import java.net.*;

public class Cliente {
    // puedo poner cualquier host, por ejemplo de otra máquina con la dirección IP
    // static final String HOST = "192.168.1.200";
    public static final String HOST = "localhost";
    
    int puerto;

    public Cliente (int num_puerto) {
        puerto = num_puerto;
    }

    // para iniciar el cliente
    public void iniciar ( ) {
        try{
            // Me conecto al servidor en un determinado puerto
            Socket sCliente = new Socket( HOST, puerto );

            // TAREAS QUE REALIZA EL  CLIENTE
            System.out.println ("\nCliente conectado al servidor " + HOST + "por el puerto " + puerto);

           // Cierro el socket
            sCliente.close();
        } catch( UnknownHostException e ) {
            System.out.println( e.getMessage() );
            System.out.println( "Error, host desconocido o inaccesible" );
            
        } catch( IOException e ) {
            System.out.println( e.getMessage() );
            System.out.println( "Error de E/S en el cliente del socket" );
        }
    } // fin iniciar
    
} // fin clase Cliente
