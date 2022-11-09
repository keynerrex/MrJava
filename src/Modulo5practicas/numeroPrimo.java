package Modulo5practicas;

import java.util.Scanner;

public class numeroPrimo {

    public static void main(String[] args) {
        //NUMERO PRIMO Se divide entre 1 y si mismo
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = in.nextInt();

        if (esPrimo(numero)) {
            System.out.println("=============");
            System.out.println("Es numero primo");
            System.out.println("=============");

        } else {
            System.out.println("=============");
            System.out.println("No es numero primo");
            System.out.println("=============");
        }

    }
    //DOCUMENTACION javaDoc
    /**
     * <h2>Funcion Es Primo </h2>
     * Descripion: Detecta si un numero es primo o no
     *
     * @param numero Recibe un numero entero
     * @return Retorna un valor booleano indicando si el numero recibido es
     * primo o no
     */
    //funcion del numero primo
    static boolean esPrimo(int numero) {
        int contador = 0;

        int[] numeros = new int[numero];

        for (int i = 0;
                i < numeros.length;
                i++) {//No entendi esta parte
            numeros[i] = i + 1;

        }
        for (int i : numeros) {//Mas o menos
            if (i == 1 || i == numero) {
                continue;
            }

            if (numero % i == 0) {//si su modulo se divide y da 0
                contador++;

            }
        }
        return contador
                == 0; //vuelve al contador
    }
}
