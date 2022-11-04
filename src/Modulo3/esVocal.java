package Modulo3;

import java.util.Scanner;

public class esVocal {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese una letra: ");
        var let = in.nextLine();
        //Metodo if else varias condiciones
        if ("a".equals(let) || "A".equals(let)) {
            System.out.printf("%s es VOCAL\n", let);

        } else if ("e".equals(let) || "B".equals(let)) {

            System.out.printf("%s es VOCAL\n", let);
        } else if ("i".equals(let) || "C".equals(let)) {

            System.out.printf("%s es VOCAL\n", let);
        } else if ("o".equals(let) || "O".equals(let)) {

            System.out.printf("%s es VOCAL\n", let);
        } else if ("u".equals(let) || "U".equals(let)) {

            System.out.printf("%s es VOCAL\n", let);
        } else {
            System.out.printf("%s no es VOCAL\n", let);
        }

        //Metodo con switch y casos
        if (null == let) {
            System.out.printf("%s no es VOCAL\n", let);
        } else //Metodo if else varias condiciones
        {
            switch (let) {
                case "a":
                case "A":
                    System.out.printf("%s es VOCAL\n", let);
                    break;
                case "e":
                case "E":
                    System.out.printf("%s es VOCAL\n", let);
                    break;
                case "i":
                case "I":
                    System.out.printf("%s es VOCAL\n", let);
                    break;
                case "o":
                case "O":
                    System.out.printf("%s es VOCAL\n", let);
                    break;
                case "u":
                case "U":
                    System.out.printf("%s es VOCAL\n", let);
                    break;
                default:
                    System.out.printf("%s no es VOCAL\n", let);
                    break;
            }
        }

        //otro metodo resumido con switch(Es mejor para mi)
        if (null == let) {
            System.out.printf("%s no es VOCAL\n", let);
        } else //Metodo if else varias condiciones
        {
            switch (let) {
                case "a", "A" ->
                    System.out.printf("%s es VOCAL\n", let);
                case "e", "E" ->
                    System.out.printf("%s es VOCAL\n", let);
                case "i", "I" ->
                    System.out.printf("%s es VOCAL\n", let);
                case "o", "O" ->
                    System.out.printf("%s es VOCAL\n", let);
                case "u", "U" ->
                    System.out.printf("%s es VOCAL\n", let);
                default ->
                    System.out.printf("%s no es VOCAL\n", let);
            }
        }
    }
}
