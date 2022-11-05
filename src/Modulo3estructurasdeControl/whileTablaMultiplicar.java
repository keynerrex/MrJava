package Modulo3estructurasdeControl;

import java.util.Scanner;

public class whileTablaMultiplicar {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese que tabla quiere saber: ");
        int tabla = in.nextInt(); //Tabla que se quiere saber

        int cont = 1; //Se realiza desde que numero comenzara la multiplicacion 1 x tabla etc

        while (cont <= 10) { //El contador es hasta 10, es decir maximo 10 veces multiplicado
            System.out.printf("%d x %d = %d\n", tabla, cont, (cont * tabla));
            cont++; //va aumentando el valor del multiplo
        }
    }
}
