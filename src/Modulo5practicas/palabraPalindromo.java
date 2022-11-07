package Modulo5practicas;

import java.util.Scanner;

public class palabraPalindromo {

    //PALABRA PALINDROMA
    //Mano la verdad que menos entendi esta XD
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = in.nextLine();

        if (esPalindromo(palabra)) {//se pide nuestro dato
            System.out.println("=============");
            System.out.println("Es palindromo");
            System.out.println("=============");

        } else {
            System.out.println("=============");
            System.out.println("No es palindromo");
            System.out.println("=============");

        }
    }

    static boolean esPalindromo(String palabra) {

        palabra = palabra.replace(" ", "");//remplacamos si hay para 2 palabras o si hay espacio
        palabra = palabra.toLowerCase();//Todo a minuscula

        StringBuilder palabraInvertida = new StringBuilder();//Lo pasamos a objeto vacio

        for (int i = palabra.length() - 1; i >= 0; i--) {//no se

            palabraInvertida.append(palabra.charAt(i));//no se

        }

        return palabra.equals(palabraInvertida.toString());//no se
    }

}
