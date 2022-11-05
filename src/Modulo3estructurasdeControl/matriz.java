package Modulo3estructurasdeControl;

public class matriz {

    public static void main(String[] args) {

        //MATRIZ BIDIMENSIONAL
        int[][] n = new int[2][3];
        //Fila 1 indice 0

        //columas
        n[0][0] = 1;
        n[0][1] = 2;
        n[0][2] = 3;
        //Fila 2 indice 1

        //columas
        n[1][0] = 4;
        n[1][1] = 5;
        n[1][2] = 6;
        for (int[] matrizInterna : n) {//trae lo del array 
            for (int dato : matrizInterna) {//ya dentro trae los datos
                System.out.println(dato);
            }

        }
        //salto de linea
        System.out.println();
        //

        //Segunda forma array bidimensional 
        int[][] x = {//comienzo array general
            //columas//
            //0,1,2 indices//
            {1, 2, 3},/*Fila 1 indice 0*/
            {4, 5, 6}, /*Fila 2 indice 1*/
            {7, 8, 9} /*Fila 3 indice 2*/ //
        };//fin array general
        for (int[] matrizInterna : x) {
            for (int dato : matrizInterna) {
                System.out.println(dato);

            }
        }
        //
        System.out.println();
        //

        //ARRAY TRIDIMENSIONAL
        int[][][] y = {//Comienzo primer 
            //contiene 2 filas
            { /*fila 1 indice0*/
                //columnas
                {-1, -2, -3},//subfila 1 
                {-4, -5, -6}//subfila 2

            },
            {/*fila 1 indice0*/
                //columnas
                {1, 2, 3},//subfila 1 
                {4, 5, 6}//subfila 2
            }
        };//fin array general
        for (int[][] matriz2D : y) {
            for (int[] matriz1D : matriz2D) {
                for (int dato : matriz1D) {
                    System.out.println(dato);
                }

            }
        }
    }

}
