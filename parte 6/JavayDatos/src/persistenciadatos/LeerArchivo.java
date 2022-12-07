package persistenciadatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LeerArchivo {
    
    public static void leerArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            //Leer cada linea
            String lectura = entrada.readLine();
            while (lectura != null) {
                System.out.println(lectura);
                lectura = entrada.readLine();
                
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void main(String[] args) {
        leerArchivo("archivo\\Hola.txt");
    }
}
