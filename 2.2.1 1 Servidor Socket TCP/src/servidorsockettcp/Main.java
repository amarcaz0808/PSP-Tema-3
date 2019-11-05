/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servidorsockettcp;

/**
 *
 * @author ramon
 */
public class Main {

    public static void main (String args []) {

        // crear un objeto de la clase servidor
        Servidor servidor1 = new Servidor(2200);

        // iniciar al servidor para que esté a la escucha en el puerto 2200
        servidor1.iniciar();
    }

}
