package testClases;

import abstractas.*;

public class TestAbstracta {

    public static void main(String[] args) {
        FiguraGeometrica figura = new Rectangulo("Rectangulo1");
        System.out.println(figura);
        figura.dibujar();//IMPORTANCIA A LAS CLASES HIJAS 
        //pasa en momento de ejecucion - polimorfismo

        ///
        figura = new Cuadrado("Cuadrado1");
        figura.dibujar();
    }

}
