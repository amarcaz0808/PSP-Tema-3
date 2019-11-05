/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesockettcp;

/**
 *
 * @author ramon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crear un objeto de la clase cliente
        Cliente cliente1 = new Cliente(2200);

        // iniciar al cliente para que esté a la escucha en el puerto 2200
        cliente1.iniciar();
    }

}
