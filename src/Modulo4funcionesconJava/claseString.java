package Modulo4funcionesconJava;

public class claseString {

    public static void main(String[] args) {

        //CharAt();
        var nom = "Keyner";
        System.out.println(nom.charAt(2));

        //length();
        System.out.println(nom.length());

        for (int i = 0; i < nom.length(); i++) {

            System.out.println(nom.charAt(i));

        }

        //substring();
        System.out.println(nom.substring(0, 3));

        //todo minuscula
        System.out.println(nom.toLowerCase());

        //todo mayuscula
        System.out.println(nom.toUpperCase());

        //remplazar caracter
        nom = "K e y n e r";
        System.out.println(nom.replace(" ", "-"));

        //equals
        //                             //==
        System.out.println("Keyner".equals("Keyner")); //true
        System.out.println("Keyner".equals("keyner")); //false
        if ("Keyner".equals("Keyner")) {
            System.out.println("Son iguales");

        } else {
            System.out.println("No son iguales");
        }

    }
}
