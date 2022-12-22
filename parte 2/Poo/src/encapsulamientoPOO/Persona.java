package encapsulamientoPOO;

public class Persona {

    private String nombre;
    private int edad;
    private boolean eliminado;

    //insert code constructor
    public Persona(String nombre, int edad, boolean eliminado) {
        this.nombre = nombre;
        this.edad = edad;
        this.eliminado = eliminado;
    }

    //get como si fuera php XD ai no
    public String getNombre() {
        return this.nombre;
    }

    //update como php y aja
    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {

        this.edad = edad;

    }

    // es boleano
    public boolean isEliminado() {
        return this.eliminado;
    }

    //modificar boleano
    public void setEliminado(boolean eliminado) {

        this.eliminado = eliminado;

    }

    //Sobreescribir metodos predefinidos
    @Override
    public String toString() {
        return "Persona: [Nombre: %s, Edad: %d, Estado: %b] "
                .formatted(this.nombre, this.edad, this.eliminado);

    }
}
