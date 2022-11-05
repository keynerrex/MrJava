package Modulo3estructurasdeControl;

public class doWhile {

    public static void main(String[] args) {
        int n = 1; //Valor de comienzo
        //Explicacion

        //El do es la primera ejecucion no importa que, el while es lo que hace que se eecute o muestre
        do {
            System.out.println("El valor de n es :" + n);
            n++;

        } while (n <= 10); //La condicion es que si es menor que 10 imprima hasta ese numero. de ahi retorna al do
    }
}
