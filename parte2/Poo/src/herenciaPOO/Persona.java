package herenciaPOO;

public class Persona {

    //CLASE PADRE USE PROTECTED 
    //y
    //SUBCLASES Y USO DE PODER
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    //CONSTRUCTOR VACIO
    public Persona() {
    }

    //CONSTRUCTOR CON 1 PARAMETRO
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    //CONSTRUCTOR VARIOS PARAMETROS
    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    //GET Y SET DE MODIFICACION Y MUESTREO DE DATOS
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //METODO TOSTRING PARA MOSTRAR TODO LOS PARAMETROS
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(this.nombre);
        sb.append(", genero=").append(this.genero);
        sb.append(", edad=").append(this.direccion);
        sb.append('}');
        return sb.toString();
    }

    public String obtenerDetalle() {
        return "Nombre: %s Edad: %d ".formatted(this.nombre, this.edad);
    }

}
