package poo;

import clases.Persona;//importamos

public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.nombre = "Keyner Oliveros";
        persona1.edad = 19;
        Persona persona2 = new Persona();
        persona2.nombre = "Santiago Florez";
        persona2.edad = 20;

        persona1.mostrarDatos();

        persona2.mostrarDatos();
    }

}
