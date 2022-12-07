package persistenciadatos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EscribirArchivo {

    public static void escribirArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);

        try {
            //Escribir
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));

            salida.println(contenido);

            salida.close();
            System.out.println("Se escribio en el archivo");

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void main(String[] args) {
        escribirArchivo("archivo\\Hola.txt", "Hola Keyner");
        escribirArchivo("archivo\\Hola.txt", "Hola Oliveros");

    }
}
