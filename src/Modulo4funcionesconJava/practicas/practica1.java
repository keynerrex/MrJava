//crear funcion para que sume 2 numeros ingresados por el usuario(static void)
package Modulo4funcionesconJava.practicas;

import java.util.Scanner;

public class practica1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Escriba un numero: ");
        int num1 = in.nextInt();

        System.out.print("Escriba otro numero: ");
        int num2 = in.nextInt();

        suma(num1, num2);

    }

    static void suma(int a, int b) {
        int suma = a + b;
        System.out.println("La suma es: " + suma);

    }
}
