package RetornodeValores;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

        OperacionRetorno op = new OperacionRetorno();

        System.out.println("La suma es: " + op.suma(n1, n2));
        System.out.println("La resta es: " + op.resta(n1, n2));
        System.out.println("La multiplicacion es: " + op.multiplicacion(n1, n2));
        System.out.println("La division es: " + op.division(n1, n2));

    }

}
