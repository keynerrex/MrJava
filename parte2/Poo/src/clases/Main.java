package clases;

public class Main {

    public static void main(String[] args) {
        //Creando un objeto de la clase Persona 

        //como scanner pero no se importa
        Persona persona1 = new Persona();

        //Clase.objeto.valor
        persona1.nombre = "Keyner Oliveros";
        persona1.edad = 19;

        persona1.mostrarDatos();
    }

}
