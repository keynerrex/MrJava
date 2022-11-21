package excepciones;

//import java.util.InputMismatchException;
//import java.util.Scanner;
import java.util.*;

public class TestExcepcion {

    //MANEJAR EXCEPCIONES   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Try intentar para el codigo
        //jerarquia de excepciones
        //Para continuar la ejecucucion do while
        boolean continuarExe = true;
        //mientras que while sea true
        do
        {
            try
            {
                System.out.println("Numero 1: ");
                int n1 = in.nextInt();
                System.out.println("Numero 2: ");
                int n2 = in.nextInt();
                int resultado = dividir(n1, n2);
                System.out.println("Resultado: " + resultado);
                //si se ejecuta bien sin error acaba 
                continuarExe = false;
//        int resultado = 4 / 0;
//        System.out.println(resultado);
                //Clase padre Exception
                //para el erro si no se da
            } catch (OperadorExcepcion e)
            {
                System.err.println("Error: " + e.getMessage());
                in.nextLine();
//                e.printStackTrace(System.out);
            } catch (ArithmeticException e)
            {
                System.err.println("ERROR: No se puede dividir entre cero");
            } catch (Exception e)
            {
                e.printStackTrace(System.out);
            } finally
            {
                System.out.println("Se reviso la division");
            }
        } while (continuarExe);

    }

    static int dividir(int n, int d) {
        if (d == 0)
        {
            throw new OperadorExcepcion("Division entre 0");
        }
        return n / d;
    }
}
