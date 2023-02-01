package NOTAS;

public class Persona {

    public String nombre;
    private int edad;

    public Persona() {
    }

    public static int comienzo(int numero) {

        return numero;
    }

    public String getNombre() {
        System.out.println(nombre);
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }

    public static void main(String[] args) {
        int num1 = 5;
        int suma = comienzo(5) + num1;
        System.out.println(suma);
        Persona persona = new Persona();
        persona.setNombre("Keyner Oliveros");
        persona.getNombre();
        System.out.println(persona.toString());
    }
}
