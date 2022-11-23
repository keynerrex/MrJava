package peliculas;

import java.util.ArrayList;
import peliculas.ui.UIPeliculas;

public class Main {

    public static void main(String[] args) {
        UIPeliculas.interfazUsuario();

        //arraylist solo almacena objetos
        ArrayList<String> meses = new ArrayList<>();

        //añadir objetos
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");

        System.out.println(meses);

        //iterar array
        meses.forEach(dato -> {
            System.out.println(dato);
        });
    }

}
