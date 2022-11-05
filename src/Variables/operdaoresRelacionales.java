package Variables;

public class operdaoresRelacionales {

    public static void main(String[] args) {
        /*== igualdad
        != diferente
        > mayor que
        < menor que
        >= mayor o igual
        <= menor o igual
         */

        //falso o verdad
        int a = 3, b = 2;
        b += 1;

        System.out.println(a == b);

        //NOT (!) (! true) -> Devuelve falso
        System.out.println(!false);

        //AND Ambos verdaderos
        //true && true -> verdadadero || true && false -> falso
        System.out.println(true && false);

        // OR || cuando uno es verda -> true || cuando ambos son falso -> false
        System.out.println(false || false);

        //Combinacion operadores logicos - relacionales
        System.out.println(a == b || a < b);

    }

}
