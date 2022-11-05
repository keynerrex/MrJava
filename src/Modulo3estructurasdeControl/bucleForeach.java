package Modulo3estructurasdeControl;

public class bucleForeach {

    public static void main(String[] args) {

        String[] nombreCompleto = {"Keyner", "Santiago", "Oliveros", "Florez"};

        int c = 0;
        while (c < nombreCompleto.length) {
            System.out.println(nombreCompleto[c]);
            c++;

        }
        System.out.println();
        for (int i = 0; i < nombreCompleto.length; i++) {
            System.out.println(nombreCompleto[i]);

        }
        System.out.println();
        //Foreach ->Resume todo porque esta hecho para los array
        //    Tipo      Array     Igual  del array
        for (String nombreCompleto1 : nombreCompleto) {
            System.out.println(nombreCompleto1);
        }
    }

}
