package Modulo5practicas;

import java.util.Scanner;

public class conversordeMoneda {

    public static void main(String[] args) {
        EXTERNA:
        while (true) {
            System.out.println("CONVERSOR DE MONEDA");
            System.out.println("""
                               1 - Pesos Colombianos a dolares
                               2 - Pesos Mexicanos a dolares
                               3 - Soles Peruanos a dolares
                               4 - Salir""");//Esta chido esto
            System.out.print("INGRESE UNA OPCION: ");
            Scanner in = new Scanner(System.in);
            char opcion = in.next().charAt(0);
            switch (opcion) {
                case '1' ->
                    conversor(5000.00, "Pesos Colombianos");
                case '2' ->
                    conversor(19.48, "Pesos Mexicanos");
                case '3' ->
                    conversor(3.92, "Soles Peruanos");
                case '4' -> {
                    System.out.println("Cerrando.......\n");

                    System.out.println("Cerrado EXITOSO");

                    break EXTERNA;
                }
                default ->
                    System.out.println("Opcion Incorrecta");
            }

        }

    }

    static void conversor(double vlrDolar, String pais) {

        Scanner in = new Scanner(System.in);
        System.out.printf("Digite la cantidad de %s :", pais);

        double cantidadMonedad = in.nextDouble();

        double dolares = cantidadMonedad / vlrDolar;
        dolares = (double) Math.round(dolares * 100) / 100;
        System.out.println("----------------------------");
        System.out.println("Tiene $" + dolares + " Dolares");
        System.out.println("----------------------------");

    }

}
