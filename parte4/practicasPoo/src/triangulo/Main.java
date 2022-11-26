package triangulo;

import java.util.Scanner;

public class Main {

    public static double MayorArea(TrianguloIsosceles triangulos[]) {
        double area;

        area = triangulos[0].obtenerArea();

        for (int i = 1; i < triangulos.length; i++) {

            if (triangulos[i].obtenerArea() > area) {
                area = triangulos[i].obtenerArea();
            }
        }
        return area;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double base, lado;
        int nTriangulos;

        System.out.println("Numero de Triangulos:");
        nTriangulos = in.nextInt();

        //cuantos quiere
        TrianguloIsosceles triangulos[] = new TrianguloIsosceles[nTriangulos];

        for (int i = 0; i < triangulos.length; i++) {

            System.out.println("\nEscriba los valores del triangulo " + (i + 1) + ":");

            System.out.print("Escriba la base: ");
            base = in.nextDouble();

            System.out.print("Escriba el lado: ");
            lado = in.nextDouble();

            triangulos[i] = new TrianguloIsosceles(base, lado);

            System.err.println("\nEl perimetro del triangulo es: " + triangulos[i].obtenerPerimetro());
            System.err.println("El area del triangulo es: " + triangulos[i].obtenerArea());

        }

        System.err.println("El area del triangulo de mayor superficie es: " + MayorArea(triangulos));

    }

}
