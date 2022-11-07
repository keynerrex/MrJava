package Modulo5practicas;

public class generadordeContraseña {

    //GENERADOR DE CONTRASEÑAS
    public static void main(String[] args) {
        System.out.println(generador());

    }

    //Mas o menos entendi
    static String generador() {

        char[] mayuscula = {'A', 'B', 'C', 'D'};
        char[] minuscula = {'a', 'b', 'c', 'D'};
        char[] numeros = {'1', '2', '3', '4'};

        StringBuilder caracteres = new StringBuilder();//pasamos a objeto vacio
        caracteres.append(mayuscula);
        caracteres.append(minuscula);
        caracteres.append(numeros);
        StringBuilder contraseña = new StringBuilder();//pasamos vacio

        for (int i = 0; i <= 15; i++) {//Google recomienda tener 15 caracteres
            int cantidadCaracteres = caracteres.length(); //Es la cantidad del array al hacer append
            int contraRandom = (int) (Math.random() * cantidadCaracteres);//pasa un cast y se multiplica por el length

            contraseña.append(caracteres.toString().charAt(contraRandom));//se hace append y se pasa 
            //los caracteres del tostring y el char que viene ya de la contrarandom hecho
        }
        return contraseña.toString(); //returna hasta comtraseña

    }
}
