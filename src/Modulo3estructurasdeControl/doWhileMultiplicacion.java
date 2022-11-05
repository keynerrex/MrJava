package Modulo3estructurasdeControl;

import java.util.Scanner;

//PRACTICA PARA DO WHILE
public class doWhileMultiplicacion {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese que tabla quiere saber: ");

        int t = in.nextInt(); //Tabla a multiplicar

        var c = 0; // valor inicial 

        do {
            System.out.printf("%d x %d = %d\n", c, t, (c * t));
            c++;
        } while (c <= 10); //Valor a veces por multiplicar

    }
}
