package Estatico;

public class Estatico {

    private static String primeraFrase = "Primera frase";

    public static int suma(int n1, int n2) {
        int suma;
        return suma = n1 + n2;
    }

    public static void main(String[] args) {
//        Estatico ob1 = new Estatico();
//        Estatico ob2 = new Estatico();
//
//        ob2.primeraFrase = "Segunda Frase";
//        System.out.println(ob1.primeraFrase);
//        System.out.println(ob2.primeraFrase);

        System.out.println(Estatico.primeraFrase);

        System.out.println("La suma es: " + Estatico.suma(5, 8));
        int n1 = 5, n2 = 8;
        if (Estatico.suma(n1, n2) == 13) {
            System.out.println("Agachate para que me lo beses");
        }

    }
}
/*static -> Le pertenece a las clases
ultimo cambio guarda para todos
ejemplo: cambiar precios
 */
