/*
Ejercicio 1: Construir un programa que calcule el area y el perimetro de un 
cuadrilatero dada la longitud de sus lados. Los valores de la longitud de sus 2 lados.
Los valores de la longitud deberan introducirse por linea de ordenes. Si es un cuadrado,
solo se proporcionara la longitud de uno de los lados al constructor.
 */
package cuadrilatero;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Cuadrilatero c1;
        float lado1, lado2;

        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 1: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 2: "));

        if (lado1 == lado2) {//Es un cuadrado

            c1 = new Cuadrilatero(lado1);
        } else {

            c1 = new Cuadrilatero(lado1, lado2);
        }

        JOptionPane.showMessageDialog(null, "El perimetro es: " + c1.getPerimetro());
        JOptionPane.showMessageDialog(null, "El Area es: " + c1.getArea());
    }
}
