package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Operacion {

    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Metodos
    public void leerNumeros() {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
    }

    public void suma() {

        suma = numero1 + numero2;
    }

    public void resta() {
        resta = numero1 - numero2;
    }

    public void multiplicacion() {
        multiplicacion = numero1 * numero2;
    }

    public void division() {
        division = numero1 / numero2;
    }

    public void mostrarResultados() {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);

    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.numero1;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Operacion other = (Operacion) obj;
        return this.numero1 == other.numero1;
    }

}
