package SobrecargadeMetodos;

public class Persona {
    //Atributos

    String nombre;
    int edad;
    int cedula;

    //Metodos
    //Sobrecarga de constructores si los parametross son diferentes y/o tipo
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(int cedula) {
        this.cedula = cedula;
    }

    public void correr() {
        System.out.println("Soy " + nombre + " y tengo " + edad + " años" + " y he estoy corriendo");

    }

    //diferente
    public void correr(int km) {
        System.out.println("He corrido " + km + " km");
    }
}
