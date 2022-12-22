package peliculas;

import javax.swing.JOptionPane;

public class CuadroDialogo {

    public static void main(String[] args) {

        //Ingresar Datos
        String dato = JOptionPane.showInputDialog(
                null,
                "Ingrese texto",
                "Entrada",
                3
        );

        //ERROR JOPtionpane
        //de salida de datos
        JOptionPane.showMessageDialog(
                null,
                dato,
                "Mensaje",
                JOptionPane.ERROR_MESSAGE);
    }

}
