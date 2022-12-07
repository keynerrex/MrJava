package persistenciadatos;

//api entrada y salida input y output
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejodeArchivos {

    public static void crearArchivo(String nombreArchivo) {
        //Crear tipo file - archivo
        File archivo = new File(nombreArchivo);

        try {

            //PrintWriter salida = new PrintWriter(archivo);
            //Bloque trycatch
            //Que va de salida 
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();//cerrar flujo
            System.out.println("Se creo el archivo");

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }

    }

    public static void main(String[] args) {
        //importar sus metodos estaticos
        //import static
        //Rutas relativas - al proyecto
        crearArchivo("archivo\\Hola.txt");
        crearArchivo("C:\\JavaArchivos\\Hola.txt");
    }
}
