/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Receptor;

/**
 *
 * @author ramon
 */
import java.net.*;
import java.io.*;

public class ReceptorUDP
{
    /**
     * MAIN
     * @param args
     */
    public static void main(String args[])
    {
        // Sin argumentos 
        if (args.length!=0)
        {
            System.err.println("Uso: java ReceptorUDP");
        }else
        {
            try
            {
                // Crea el  socket 
                DatagramSocket sSocket = new DatagramSocket(1500);

                // Crea el espacio para los mensajes 
                byte[] cadena = new byte[1000];
                // crear un mensaje para recibir paquetes UDP de hasta 1000 bytes
                DatagramPacket mensaje = new DatagramPacket(cadena, cadena.length);

                System.out.println("Esperando mensajes...");
                // bucle infinito para recibir mensajes permanentemente
                // mejor evitar esto
                while (true) {
                    // Recibe y muestra el mensaje 
                    sSocket.receive(mensaje);
                    
                    // Transforma el mensaje UDP en un String                 
                    String datos = new String(mensaje.getData(), 0, mensaje.getLength());
                    System.out.println("\tMensaje Recibido: " + datos);
                }
            }catch(SocketException e)
            {
                System.err.println("Error en el Socket: " + e.getMessage());
            }catch(IOException e)
            {
                System.err.println("Error E/S: " + e.getMessage());
            }//End of TRY/CATCH
        }//End of IF/ELSE
    }//End of MAIN
}//End of class ReceptorUDP
