package Modulo3estructurasdeControl;

import java.util.Arrays;

public class array {

    public static void main(String[] args) {
        //Explicacion
        String nombres[]; //Dar tipo array al String

        nombres = new String[3]; //forma de array y numero que tendra dentro
        nombres[0] = "Keyner";
        nombres[1] = "Santiago";
        nombres[2] = "Oliveros";

        System.out.println("nombre de posicion del array: " + nombres[2]);
        nombres[2] = "Florez";
        System.out.println("Espacio en la memoria: " + nombres); //Donde esta guardado en la memoria
        System.out.println("Longitud del array: " + nombres.length);//longitud del array(Valores dentro)
        //
        System.out.println();//Salto de linea simple
        //
        int[] numeros = {1, 2, 3, 4, 5}; //segunda forma directa
        System.out.println("Espacio en la memoria:" + numeros);
        System.out.println("numero de posicion del array: " + numeros[3]);
        System.out.println("Longitud del array: " + numeros.length);
        //
        System.out.println();//Salto de linea simple
        //
        int[] array3 = new int[2];//Tercera forma de definir un array

        array3[0] = 1;
        array3[1] = 2;
        System.out.println(array3[0] + " Y " + array3[1]);
        //
        System.out.println();//Salto de linea simple
        //

        //Metodo para traer todo el array con su valor ( Arrays.toString(array) //Se importa java.util.Arrays;
        System.out.println("Datos del array: \n" + Arrays.toString(nombres));
        //
        System.out.println("Datos del array: \n" + Arrays.toString(numeros));
        //
        System.out.println("Datos del array: \n" + Arrays.toString(array3));

    }

}
