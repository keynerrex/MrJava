package Modulo4funcionesconJava;

import java.util.Scanner;

public class funcionesRecursivas {
    //EXPLICACION FUNCIONES RECURSIVAS

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Numero: ");
        int numero = in.nextInt();

        conteoRegresivo(numero);//le pasa nuestro numero y va descontando hasta 0
        System.out.println(factorizar(numero));//factoriza nuestro numero 
    }

    static void conteoRegresivo(int conteo) { //funcion que retorna de nuevo en si misma

        conteo--;
        if (conteo > 0) {
            System.out.println(conteo);
            conteoRegresivo(conteo);

        } else {
            System.out.println("Se ha acabado");
        }

    }

    static int factorizar(int numero) {//funcion que retorna de nuevo en si misma

        if (numero > 1) { //solo si es mayor que 1
            numero = numero * factorizar(numero - 1);//esto lo factoriza

        }
        return numero; //retorna el valor de numero

    }
}
