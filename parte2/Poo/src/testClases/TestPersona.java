package testClases;

import encapsulamientoPOO.Persona;

class TestPersona {

    //Encapsulamiento
    public static void main(String[] args) {
        //construir del constructor
        Persona persona1 = new Persona("Keyner", 19, false);
        System.out.println(persona1.getNombre());

        //modificar
        persona1.setNombre("Santiago");
        persona1.setEdad(19);
        /*No deja asi
        System.out.println(persona1.setNombre("Santiago"));
         */

        //Muestreo de datos
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getEdad());

    }

}
