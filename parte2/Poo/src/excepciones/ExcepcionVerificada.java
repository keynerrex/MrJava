package excepciones;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExcepcionVerificada {

    public static void main(String[] args) {
        file1();
    }

    public static void file1() {
        File file = new File("C://file.txt");
        try
        {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException ex)
        {
            System.err.println("No se encontro el archivo");
            ex.printStackTrace(System.out);
        }
    }
}
