package persistenciadatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EliminarArchivo {

    public static void eliminarArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        System.out.println(archivo.exists());
        archivo.delete();
        System.out.println("Se elimino el archivo");
    }

    public static void main(String[] args) {
        eliminarArchivo("archivo\\Hola.txt");
    }
}
