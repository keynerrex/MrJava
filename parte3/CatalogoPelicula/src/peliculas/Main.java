package peliculas;

import java.util.ArrayList;
import peliculas.ui.UIPeliculas;
import saludo.Saludo;

public class Main {

    public static void main(String[] args) {
        UIPeliculas.interfazUsuario();

        //arraylist solo almacena objetos
        ArrayList<String> meses = new ArrayList<>();
        Saludo hl = new Saludo();
        hl.saludar("Hola");
        hl.toString();
        for (String r : meses) {
            System.out.println(r);
        }
    }

}
