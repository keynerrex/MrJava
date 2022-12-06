package persistenciadatos;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List lista1 = new ArrayList();

        lista1.add(1);
        lista1.add("Keyner");
        lista1.add(19);
        lista1.add(1.65);
        lista1.add(true);

        //Nuevo forEach listas array
        lista1.forEach(object -> {
            System.out.println("Datos: " + object);
        });

        System.out.println("Indice: " + lista1.get(4));

        //Eliminar elemento indice
        lista1.remove(4);
        System.out.println(lista1);

        lista1.set(1, "Keyner Oliveros");

        System.out.println(lista1);

        //Elimina todos los elementos
        lista1.clear();
        System.out.println(lista1);
    }

}
