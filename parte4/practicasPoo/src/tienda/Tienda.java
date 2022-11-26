/*

 */
package tienda;

import java.util.Scanner;

public class Tienda {

    public static void main(String[] args) {

        double ventas[] = new double[30];

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese las ventas del mes");

        for (int i = 0; i < ventas.length; i++) { //menor al tamaño del arreglo

            System.out.println("Venta " + (i + 1));//i = 1 y incrementa 
            ventas[i] = in.nextDouble();

            System.out.println(ventas[i]);  //mostrar venta
            int k = 0;
            int total = 0;

            System.out.println("Ventas mayores o igual a $2000");
            //k =1
            while (k < 30) {

                if (ventas[k] >= 2000) {

                    System.out.println("$" + ventas[k]);
                    total++; //1
                }
                k++;
            }
            System.out.println("TOTAL VENTAS DEL MES: " + total);
        }

    }
}
