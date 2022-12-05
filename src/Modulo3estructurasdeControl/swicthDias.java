package Modulo3estructurasdeControl;

import java.util.Scanner;

public class swicthDias {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //Caso para swicth

        System.out.println("Escriba un dia de la semana: ");
        int dia = in.nextInt(); //Se pide el dato
        String diaSemana = null; //La referencia a mostrar en null
        switch (dia) { //valor que recibe la condicion
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miercoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sabado";
                break;
            case 7:
                diaSemana = "Domingo";
            default:
                System.out.println("Error al digitar");
        }
        System.out.println("El dia de la semana es: " + diaSemana);

        //otro metodo con regla
        System.out.println("Nuevo dia: ");
        int nuevoDia = in.nextInt();
        String semDia = null;
        switch (nuevoDia) {
            case 1 -> {
                semDia = "Lunes";
            }
            case 2 -> {
                semDia = "Martes";
            }
            case 3 -> {
                semDia = "Miercoles";
            }
            case 4 -> {
                semDia = "Jueves";
            }
            case 5 -> {
                semDia = "Viernes";
            }
            case 6 -> {
                semDia = "Sabado";
            }
            case 7 -> {
                semDia = "Domingo";
            }
            default ->
                System.out.println("Error al digitar");
        }
        System.out.println("El dia es: " + semDia);
        System.out.println("Este es otro xd");

    }
}
