package servidorsockettcp;

public class Main
{
    /**
     * MAIN
     * @param args
     */
    public static void main(String args [])
    {
        // crear un objeto de la clase servidor
        Servidor servidor1=new Servidor(2200);

        // iniciar al servidor para que esté a la escucha en el puerto 2200
        servidor1.iniciar();
    }//End of MAIN
}//End of class Main
