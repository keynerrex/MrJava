package Modulo4funcionesconJava;

public class funcionconRetorno {
    //RETURN

    public static void main(String[] args) {
        //EXPLICACION
        var num1 = 1; //manera #1
        var num2 = 2;

        System.out.println("La suma es: " + suma(num1, num2)); //pone la funcion de una
        //
        var totalSuma = suma(num1, num2);//manera #2
        System.out.println("La suma es: " + totalSuma);

        //saludo
        var nombre = "Keyner"; //manera #1
        var edad = 19;
        System.out.println(saludo(nombre, edad));
    }

    //Devuelve un int
    static int suma(int a, int b) {

        return a + b; //resultado a devolver

    }

    //Devuelve la cadena
    static String saludo(String nombre, int edad) {

        return "Su nombre es " + nombre + " y su edad es " + edad;//resultado a devolver

    }
}
