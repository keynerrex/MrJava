package persistenciadatos;

import java.util.*;

public class Map {

    public static void main(String[] args) {
        //Ya no es parte de las colecciones
        //manera 1
        Map numeros = new Map(); //No sirve pal put
        //maera 2

        HashMap numeros2 = new HashMap();
        //Clave - Valor
        numeros2.put(1, "Uno");
        numeros2.put(2, "Dos");
        numeros2.put(3, "Tres");
        numeros2.put(4, "Cuatro");
        numeros2.put(5, "Cinco");

        System.out.println(numeros2);

        //Acceder a sus valores con sus claves, como indices
        System.out.println(numeros2.get(3));
        //recuperar claves
        for (Object claves : numeros2.keySet()) {
            System.out.println(claves);
        }
        //Recuperar valores
        for (Object valores : numeros2.values()) {
            System.out.println(valores);
        }
        //Recuperar Clave y valor
        for (Object clave : numeros2.keySet()) {
            System.out.println(clave + " " + numeros2.get(clave));
        }

        //Remover con clave
        numeros2.remove(5);
        System.out.println(numeros2);

        //Eliminar todos los elementos
        numeros2.clear();
        System.out.println(numeros2);

        //Podemos utilizar las mapas para elementos con clave y valor
    }

}
