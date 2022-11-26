package vehiculo;

public class Vehiculo {

    //Atributos
    private String marca;
    private String modelo;
    private float precio;

    //xontrsuctor
    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public String mostrarDatos() {
        return "Marca: " + this.marca
                + "\nModelo: " + this.modelo
                + "\nPrecio: $" + this.precio;
    }
}
