package Modulo3estructurasdeControl;

import java.util.Scanner;

public class bucleFor {

    public static void main(String[] args) {
        //Explicacion
        Scanner in = new Scanner(System.in);

        System.out.print("Tabla a imprimir?:");
        int t = in.nextInt(); //Valor inicial
        for (int i = 1; i <= 10; i++) { //i como contador ya definido empezara desde 1
            System.out.printf("%d x %d = %d \n", i, t, (i * t));

        }

    }

}
