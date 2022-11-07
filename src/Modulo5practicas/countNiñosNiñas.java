//1 - En un hospital nacen bebés niños y niñas se desea hacer un programa para saber cuántos son niños 
//y cuántas son niñas. 
//El programa finaliza cuando se terminen los nacimientos.
package Modulo5practicas;

import java.util.Scanner;

public class countNiñosNiñas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int contNiño = 0, contNiña = 0, genero;
        do {
            System.out.println("Ingrese el genero 1.Niño - 2.Niña");
            genero = in.nextInt();

            switch (genero) {
                case 1 ->
                    contNiño++;
                case 2 ->
                    contNiña++;
            }

        } while (genero != 0);
        System.out.println("Los ninos son: " + contNiño);
        System.out.println("Los ninos son: " + contNiña);

    }

}
