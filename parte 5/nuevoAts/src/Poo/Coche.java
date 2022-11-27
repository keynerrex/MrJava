package Poo;

public class Coche {

    //Atributos
    String color;
    String marca;
    int km;

    public static void main(String[] args) {
        Coche coche1 = new Coche();

        coche1.color = "Verde";
        coche1.marca = "BMW";
        coche1.km = 200;
        System.out.println("El color del coche 1 es: " + coche1.color);
        System.out.println("La marca del coche 1 es: " + coche1.marca);
        System.out.println("El kilometraje del coche 1 es: " + coche1.km + "km");

        Coche coche2 = new Coche();
        coche2.color = "Azul";
        coche2.marca = "KEY";
        coche2.km = 185;
        System.out.println("\nEl color del coche 2 es: " + coche2.color);
        System.out.println("La marca del coche 2 es: " + coche2.marca);
        System.out.println("El kilometraje  del coche 2 es: " + coche2.km + "km");

    }
}
