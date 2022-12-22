package clases;

/**
 * <h2>Clase Persona </h2>
 * Descripcion: Clase para dar nombre y edad <br>
 * edad (type int) <br>
 * nombre (type: String) <br>
 * mostrarDatos (result: Mostramos los datos)br>
 */
//public pa acceder desde otro paquetes
//class para solo el mismo paquete
public class Persona {

    //public para acceder de otros paquetes
    //sino es un valor que se da desde aca mismo
    public String nombre;
    public int edad;

    //Constructor
    public Persona() {
        System.out.println("Construyendo Constructor");
    }

    //Sobrecarga de consructor
    public Persona(String nombre) {
        System.out.println("Hola " + nombre + " desde el constructor");
    }

    //public para acceder de otros paquetes
    //void para solo el mismo paquete
    public void mostrarDatos() {//Metodo

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

}
