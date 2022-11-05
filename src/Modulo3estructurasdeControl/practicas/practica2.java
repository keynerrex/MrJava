/*Lee un número por teclado y comprueba que este numero es mayor o igual que cero, 
si no lo es lo volverá a pedir (do while), después muestra ese número por consola.*/
package Modulo3estructurasdeControl.practicas;

import java.util.Scanner;

public class practica2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Introduce un numer mayor 0");
            numero = in.nextInt();

        } while (numero <= 0);
        System.out.println("El numero es: " + numero);

    }

}
