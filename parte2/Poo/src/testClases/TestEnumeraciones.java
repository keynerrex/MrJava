package testClases;

import enumeraciones.Continentes;
import enumeraciones.Dias;

public class TestEnumeraciones {

    public static void main(String[] args) {
        //ENNUMERACIONES PRUEBA
        System.out.println(Dias.LUNES);
        System.out.println(Dias.MARTES);

        //ENUMERACIONES CON VALORES
        System.out.println(Continentes.AMERICA.getPaises()); //Cantidad paises
        Continentes continente = Continentes.AMERICA;
        System.out.println(continente.getPaises()); //OTRA MANERA
    }

}
