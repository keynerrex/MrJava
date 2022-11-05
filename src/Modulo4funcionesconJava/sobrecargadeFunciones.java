package Modulo4funcionesconJava;

public class sobrecargadeFunciones {
//SOBRECARGAR

    public static void main(String[] args) {
        //EXPLICACION
        System.out.println(suma(5, 5));//usa la de int
        System.out.println(suma(4, 5.6));//usa ambas
        System.out.println(suma(15.67, 5.6));//usa la de double

    }

    //puede haber 3 funciones con el mismo nombre
    //pero no pueden ser del mismo tipo de valor
    static int suma(int a, int b) {

        return a + b;

    }

    //devuelve a double
    static double suma(double a, double b) {

        return a + b;
    }
}
