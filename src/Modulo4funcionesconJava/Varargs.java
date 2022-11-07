package Modulo4funcionesconJava;

public class Varargs {

    public static void main(String[] args) {

        //EXPLICACION
        System.out.println(sumar("Keyner Oliveros", 4, 5, 6));//parametros 
    }

    static int sumar(String nombres, int... numeros) {//puede ser un tipo y varios de otros
        int suma = 0;
        System.out.print("La suma de " + nombres + " es ");

        for (int num : numeros) {//agarramos los datos del array de numeros

            suma += num; //agregamos la sumatoria de elementos 

        }
        return suma;

    }

}
