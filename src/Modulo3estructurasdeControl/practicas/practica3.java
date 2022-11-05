/*Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no.
Usa un switch para ello.*/
package Modulo3estructurasdeControl.practicas;

import java.util.Scanner;

public class practica3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escriba el dia de la semana: ");
        String diaL = in.next();

        switch (diaL) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un dia laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Es un dia festivo");
            default:
                System.out.println("Introduce un dia de la semana");

        }

    }

}
