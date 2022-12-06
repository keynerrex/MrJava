package Encapsulamiento;

public class Clase1 {

    private int edad;

    //get y set
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        System.out.println("La edad es: " + edad);
        return edad;
    }

}
