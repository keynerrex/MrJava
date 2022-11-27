package ParametrosYArgumentos;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

        OperacionesP op = new OperacionesP();

        op.suma(n1, n2);
        op.resta(n1, n2);
        op.multiplicacion(n1, n2);
        op.division(n1, n2);

        op.mostrarResultados();

    }

}
