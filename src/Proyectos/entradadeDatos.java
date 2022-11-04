package Proyectos;

import java.util.Scanner; //import Scanner

public class entradadeDatos {

    public static void main(String[] args) {
        //Clase Scanner -> entrada de datos por teclado
        Scanner in = new Scanner(System.in);

        var name = in.nextLine(); //Var dato para definir 
        String apellido = in.nextLine(); //Dato definido
        System.out.println("Nombre: " + name + "\nApellido: " + apellido);
        //char empieza 0 ->primera letra
        char nom;
        nom = in.next().charAt(0);
        System.out.println("Cara: " + nom);

        /*Metodos
            in.next().charAt(); -> char
            in.nextLine(); -> string
            in.nextInt(); -> Numero entero
         */
    }

}
