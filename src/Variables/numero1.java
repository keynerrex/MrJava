package Variables;

public class numero1 {

    public static void main(String[] args) {
//
//        //codigo ASCII
//        char a = 45;
//        System.out.println(a);

        //Con variable general
        var nombre = "Keyner";
        var apellido = "Oliveros";
        String completo = nombre + " " + apellido;
        System.out.println(completo);

        int a = 2, b = 2, c = 2;
        System.out.println(a + b * c - a);

        int d = 10;
        d += 5; //Suma a lo que es igual
        d = +5; //Resta a lo que es igual
        System.out.println(d);

    }

}
