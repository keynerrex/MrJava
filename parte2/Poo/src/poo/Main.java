package poo;

import clases.Calculadora;
import clases.Persona;

public class Main {

    //Clase Main para exportar de otros paquetes funciones,clases etc
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.nombre = "Keyner Oliveros";
        persona1.edad = 19;
        Persona persona2 = new Persona();
        persona2.nombre = "Santiago Florez";
        persona2.edad = 20;

        persona1.mostrarDatos();

        persona2.mostrarDatos();
        //otro ejemplo de acceder desde la misma clase
        System.out.println(pruebaCalculadora.calculo.number);
        pruebaCalculadora num = new pruebaCalculadora();
        //modificamos 
        pruebaCalculadora.calculo.number = 12;
        //nuevo valor
        System.out.println(pruebaCalculadora.calculo.number);

        //Clase Calculadora
        Calculadora calcular = new Calculadora();
        System.out.println(calcular.restar(15, 5));
        System.out.println(calcular.restar(15.5, 5));

    }

}
