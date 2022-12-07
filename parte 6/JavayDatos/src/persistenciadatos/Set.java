package persistenciadatos;

import java.util.*;

public class Set {

    public static void main(String[] args) {

        //No se respeta el orden
        HashSet dias = new HashSet();
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miercoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Sabado");
        dias.add("Domingo");
        //No se puede almacenar 2 veces
        dias.add("Domingo");

        for (Object dia : dias) {
            System.out.println(dia);

        }
        //No hace falta poner el indice
        dias.remove("Domingo");
        System.out.println(dias);

        //Eliminas todos los elementos
        dias.clear();
        System.out.println(dias);
    }

}
