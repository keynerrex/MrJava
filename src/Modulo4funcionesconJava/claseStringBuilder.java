package Modulo4funcionesconJava;

public class claseStringBuilder {

    public static void main(String[] args) {

        //Clase StringBuilder();
        StringBuilder nom = new StringBuilder(); //Objebto vacio

        System.out.println(nom);
        nom.append("Keyner");//le añadimos con append
        System.out.println(nom);

        nom = nom.append(" Oliveros"); //al antiguo nom le añadimos otro append
        System.out.println(nom);

        System.out.println(nom.toString()); //Manda todo lo que hay, util pa evitar errores
    }

}
