package clases;

public class Main {

    //Clase Main para usar del mismo paquete funciones,clases etc
    public static void main(String[] args) {
        //Creando un objeto de la clase Persona 

        //como scanner pero no se importa
        Persona persona1 = new Persona();

        //Clase.objeto.valor
        persona1.nombre = "Keyner Oliveros";
        persona1.edad = 19;

        persona1.mostrarDatos();
        System.out.println(persona1.nombre.length());//funciona como una clase Math,string etc

        String nombre1 = persona1.nombre.toUpperCase();
        System.out.println(nombre1);

    }

}
