package Practicas;

import java.util.Scanner;

public class preciodeVenta {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Calculo de venta con impuesto al 16%
        System.out.print("Precio de Venta: ");
        double precioVenta = in.nextDouble();
        double impuesto = precioVenta * 0.16;
        double totalVenta = precioVenta + impuesto;
        System.out.println("Valor impuesto(16%): " + impuesto + "\nValor Venta: " + totalVenta);

    }

}
