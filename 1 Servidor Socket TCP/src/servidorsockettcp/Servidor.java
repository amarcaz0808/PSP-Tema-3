/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servidorsockettcp;

/**
 *
 * @author ramon
 */

import java.io.IOException;
import java.net.* ;

public class Servidor {
    int puerto=2200;

    // constructor
    public Servidor(int num_puerto) {
        puerto = num_puerto; 
    } // fin constructor

    public void iniciar () {
        ServerSocket skServidor = null;
        try {
            // Inicio la escucha del servidor en un determinado puerto
            skServidor = new ServerSocket(puerto);
            System.out.println("Escucho por el puerto " + puerto );

            // Espero a que se conecte un cliente y creo un nuevo socket para el cliente
            Socket sCliente = skServidor.accept();

            // ATENDER PETICIÓN DEL CLIENTE
            System.out.println ("Cliente conectado....");

            // Cierro el socket del cliente
            sCliente.close();

            System.out.println ("Cerrada la conexión con el Cliente.");

        } catch (IOException e ) {
            System.out.println( e.getMessage() );   
            System.out.println( "Error E/S en el servidor del socket." );   
        }finally{
            // Cerrar el socket servidor               
            if (skServidor != null) //ServerSocket
                try{
                    skServidor.close();
                }catch (IOException e) {
                    System.err.println("Error al cerrar ServerSocket.");
                    System.out.println( e.getMessage() ); 
                }
        }

    } // fin iniciar



} // fin clase Servidor