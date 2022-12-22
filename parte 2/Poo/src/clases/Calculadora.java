package clases;

public class Calculadora {//Clase publica para que accedan de otros paquetes

    //final -> no se puede modificar
    public static double PI = 3.20;//public static para otros fuera del paquete y static ejecutable

    public static int sumar(int a, int b) { //static que se ejecuta o algo asi

        return a + b;
    }

    public static double sumar(double a, double b) { //static que se ejecuta o algo asi

        return a + b;
    }
    //sobrecarga de metodos

    public int restar(int a, int b) {
        return a - b;
    }

    public double restar(double a, double b) {
        return a - b;
    }
}
