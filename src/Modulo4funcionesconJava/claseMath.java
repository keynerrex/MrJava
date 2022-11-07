package Modulo4funcionesconJava;

public class claseMath {

    public static void main(String[] args) {
        //CLASE MATH
        System.err.println(Math.PI); //Pi
        System.err.println(Math.E); //No se XD
        System.err.println(Math.pow(4, 2)); //Potencia 4 a la 2
        //Numeros random
        System.err.println(Math.random());//solo de 0 a 1 ->float
        System.out.println(Math.random() * 101); //->Directo por maximo rango 101 float

        var nRamdon1 = (Math.random() * 101); //Declarandolo como variable float
        System.out.println(nRamdon1);

        int nRamdon2 = (int) (Math.random() * 101); //convertido a int
        System.out.println(nRamdon2);

        //
        var raiz = Math.sqrt(64);//Raiz cuadrada
        System.out.println(raiz);

        System.out.println(Math.max(4, 5));//numero mayor

        System.out.println(Math.min(4, 5));//numero menor

        System.out.println(Math.round(4.867787));//numero redondeado

        double moneda = (double) Math.round(67.8776758 * 1000d) / 1000;//d son las decimales de 0
        System.out.println(moneda);

    }

}
