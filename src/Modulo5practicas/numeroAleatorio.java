package Modulo5practicas;

import java.util.Scanner;

public class numeroAleatorio {

    public static void main(String[] args) {
        //ADIVINA EL NUMERO 
        //EXPLICACION -- No entendi
        OUTER:
        while (true) {
            System.out.println("ADIVINA EL NUMERO\n");
            System.out.println("1 - Nivel Facil");
            System.out.println("2 - Nivel Intermedio");
            System.out.println("3 - Nivel Dificil");
            System.out.println("4 - Salir");

            Scanner in = new Scanner(System.in);
            System.out.print("Opcion: ");
            int opcion = in.nextInt();
            switch (opcion) {
                case 1 ->
                    jugar(10);
                case 2 ->
                    jugar(7);
                case 3 ->
                    jugar(5);
                case 4 -> {
                    System.out.println("CERRANDO......");
                    break OUTER;
                }
                default ->
                    System.out.println("Opcion Incorrecta");
            }

        }

    }

    static void jugar(int vidas) {

        int numeroRandom = (int) (Math.random() * 100);
        int numeroElegido = -1;

        Scanner in = new Scanner(System.in);

        while (numeroElegido != numeroRandom) {
            System.out.print("Inrese un numero entre 1 y 100: ");
            numeroElegido = in.nextInt();

            if (numeroRandom < numeroElegido) {
                System.out.println("El numero es mas pequeño");
                vidas--;
            } else if (numeroRandom > numeroElegido) {
                System.out.println("El numero es mas grande");
                vidas--;
            }
            if (vidas == 0) {
                System.out.println("------------------");
                System.out.println("|    GAME OVER     |");
                System.out.println("------------------");
                break;

            }
            System.out.printf("Te quedan %d vidas \n", vidas);
        }
        if (numeroElegido == numeroRandom) {
            System.out.println("------------------");
            System.out.println("|    GANASTE    |");
            System.out.println("------------------");

        }
    }

}
