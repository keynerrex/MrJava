package poo;

import clases.Calculadora;//importamos del package clases y la clase Calculadora
import static java.lang.Math.*; //Para importar toda la clase math

public class pruebaCalculadora {

    public static void main(String[] args) {

        System.out.println(Calculadora.PI);//Accededemos a la clase y la funcion PI
////        Calculadora.PI = 3.1;//Cambiamos su valor //error porque no se puede modificar
        System.out.println(Calculadora.PI);//Nuevo valor

        System.out.println(Calculadora.sumar(1, 1));//la calse sumar static
        System.out.println(PI);//ya no haria falta poner Math sino el PI u otro
    }

    public class calculo {

        static int number = 19;
    }

}
