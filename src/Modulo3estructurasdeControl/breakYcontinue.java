package Modulo3estructurasdeControl;

public class breakYcontinue {

    public static void main(String[] args) {

        //Explicacion break
        for (int i = 0; i < 10; i++) { //contara hasta 10
            System.out.println("Valor de i: " + i);
            if (i == 5) { //un if que si llega al conteo de 5 mostrara el mensaje

                System.out.println("Detener Bucle");//o tambien una condicion
                break; //Corta o detiene la condicion o programa

            }
        }
        System.out.println("");

        //Explicacion continue
        for (int i = 0; i < 10; i++) {//contara hasta 10
            System.out.println("Valor de i: " + i);
            if (i == 5) {//un if que si llega al conteo de 5 mostrara el mensaje

                System.out.println("Saltare a la siguiente ejecucion\n");//o tambien una condicion
                continue; //Lo que hace es ejecutar en numero 5 y luego saltar a la otra condicion
            }
            //Esta seria la otra condicion
            System.out.println("No me ejecutare en 5");// Al estar afuera y ser bucle se pondra en todo
            //menos en la condicion del numero 5
        }
    }
}
