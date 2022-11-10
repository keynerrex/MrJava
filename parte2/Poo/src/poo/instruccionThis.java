package poo;

import clases.Rectangulo;

public class instruccionThis {

    //Ir a la clase Rectangulo
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        System.out.println(r1.area(8, 4));

        System.out.println(r1.perimetro(10, 25));

        //Referencia memoria HEAP
        System.out.println(r1);
    }

}
