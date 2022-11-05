package Modulo4funcionesconJava;

public class parametrosyArgumentos {

    public static void main(String[] args) {
        //    //argumentos
        sumar(2, 3);

        var nombre = "Keyner";
        var edad = 19;
        //    //argumentos
        saludo(nombre, edad);
    }

    //funcion
    //                //parametros
    static void sumar(int a, int b) {
        int suma = a + b;
        System.out.println("La suma es: " + suma);

    }

    //                     //parametros
    static void saludo(String nombre, int edad) {

        System.out.printf("Hola %s tu edad es %d\n", nombre, edad);

    }
}
