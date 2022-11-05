package Modulo3estructurasdeControl;

import java.util.Scanner;

public class esPar {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Par o inpar
        System.out.print("Su numero: ");
        var num = in.nextInt();

        if (num != 0) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.printf("El numeo %d es PAR positivo\n", num);
                } else {
                    System.out.printf("El numeo %d es INPAR positivo\n", num);
                }
                /*corte*/
            } else {
                if (num % 2 == 0) {
                    System.out.printf("El numeo %d es PAR Negativo\n", num);
                } else {
                    System.out.printf("El numeo %d es INPAR negativo\n", num);
                }
            }

        } else {
            System.out.printf("El numero %d es NEUTRO\n", num);
        }
    }
}
