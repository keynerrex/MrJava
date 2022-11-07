/*Primero se lee un sonumero, que es introducido por teclado 
y se hacen comparaciones para verificar si es negativo, mayor a 100 o en el intervalo 0-100. 
Finalmente se despliega por pantalla la condición de dicho numero
 */
package Modulo5practicas;

import java.util.Scanner;

public class rangoNumero100 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite un numero:");
        int numero = in.nextInt();

        if (numero < 0) {
            System.out.println("Es negativo");
        } else if (numero == 0) {
            System.out.println("Es neutro");

        }

        if (numero > 100) {
            System.out.println("Es mayor que 100");
        } else if (numero == 100) {
            System.out.println("Es 100");

        }
        if (numero > 0 && numero < 100) {
            System.out.println("Esta dentro del rango de 100");

        }

    }
}
