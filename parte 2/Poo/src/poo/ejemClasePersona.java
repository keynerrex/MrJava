package poo;

import clases.Persona;

public class ejemClasePersona {

    public static void main(String[] args) {

        //Ejecuta el primer constructor
        Persona persona1 = new Persona();
        // //                          //Le pasamos argumento
        //Ejecuta el constructor de ese parametro
        Persona persona2 = new Persona("Keyner");

        //
        persona1.nombre = "Keyner Oliv";
        persona1.edad = 19;
        persona1.mostrarDatos();

    }

}
