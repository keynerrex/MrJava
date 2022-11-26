/*
Ejercicio 3: Construir un programa que dada una serie de vehiculos caracterizados
por su marca, modelo, precio, imprima las propiedades del vehiculo mas barato.
Para ello, se deberan leer por teclado las caracteristicas de cada vehiculo y una clase
a cada uno de ellos.
 */
package vehiculo;

import java.util.Scanner;

public class Main {

    public static int indiceCocheMBarato(Vehiculo coches[]) {
        float precio;
        int indice = 0;
        precio = coches[0].getPrecio();

        for (int i = 1; i < coches.length; i++) {

            if (coches[i].getPrecio() < precio) {
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String marca, modelo;
        Float precio;
        int numeroVehiculos, indiceBarato;

        System.out.println("Cantida de vehiculos: ");
        numeroVehiculos = in.nextInt();

        //Creamos los objetos para los coches
        Vehiculo coches[] = new Vehiculo[numeroVehiculos];

        for (int i = 0; i < coches.length; i++) {

            in.nextLine();
            System.out.println("\nEscriba las caracteristicas del coche " + (i + 1) + ":");

            System.out.print("Escriba la marca: ");
            marca = in.nextLine();

            System.out.print("Escriba el modelo: ");
            modelo = in.nextLine();

            System.out.print("Escriba el precio: ");
            precio = in.nextFloat();

            //llamar al constructor
            coches[i] = new Vehiculo(marca, modelo, precio);
        }

        indiceBarato = indiceCocheMBarato(coches);
        System.out.println("\nEl coche mas barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
    }

}
