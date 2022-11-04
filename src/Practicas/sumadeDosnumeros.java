package Practicas;

import java.util.Scanner;

public class sumadeDosnumeros {

    public static void main(String[] args) {

        //Usando metodo var y printf
        Scanner in = new Scanner(System.in);
        System.out.print("Numero 1: ");
        var n1 = in.nextInt();
        System.out.print("Numero 2:");
        var n2 = in.nextInt();
        /*printf
            %s -> Imprime cadena de caracteres
                %d -> imprime numeros enteros
                        %f -> imprime numeros decimales
         */
        var result = n1 + n2;
        System.out.printf("La suma de %d + %d es %d\n", n1, n2, result);

    }

}
