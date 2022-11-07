//2 - Un trabajador necesita saber cuanto gana, suponiendo que se le paga por horas,
//gana se acuerdo a las horas trabajadas.
package Modulo5practicas;

import java.util.Scanner;

class trabajo {

    public double pago(int horas, double valorHora) {
        double total = horas * valorHora;
        return total;
    }
}

public class cuantoGanaTrabajador {

    public static void main(String[] args) {
        trabajo trabajado = new trabajo();

        Scanner in = new Scanner(System.in);
        System.out.print("Horas trabajadas: ");
        int horas = in.nextInt();
        System.out.print("Valor hora: ");
        double vlrHora = in.nextDouble();

        System.out.println("El trabajador gana $" + trabajado.pago(horas, vlrHora));

    }

}
