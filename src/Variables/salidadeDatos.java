package Variables;

import java.util.Scanner;

public class salidadeDatos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Por print -> Misma linea se escribe
        //Por println -> Salto de linea
        System.out.print("Nombre: ");
        String nombre = in.nextLine();
        System.out.print("Apellido: ");
        String apellido = in.nextLine();
        System.out.println("Nombre Completo: " + nombre + " " + apellido);

    }

    //Aun no se usar las clases privadas
    private class especiales {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            /*printf
            %s -> Imprime cadena de caracteres
                %d -> imprime numeros enteros
                        %f -> imprime numeros decimales
             */
            var name = in.nextLine();
            var edad = in.nextInt();
            //Por pasar                                      //Values
            System.out.printf("Nombre: %s  Edad: %d\n", name, edad);

            //Otras especiales
            /* \n -> Espacio de linea
                    \t -> Genera espacio de un tabulador
                            /b -> borra caracter hacia la izquierda
             */
        }

    }
}
