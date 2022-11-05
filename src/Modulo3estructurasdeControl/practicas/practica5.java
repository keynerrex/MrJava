//Pedir dos palabras por teclado, indicar si son iguales./*
package Modulo3estructurasdeControl.practicas;

import java.util.Scanner;

public class practica5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Palabra 1: ");
        String pal1 = in.next();

        System.out.println("Palabra 2: ");
        String pal2 = in.next();

        if (pal1.equals(pal2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

    }
}
