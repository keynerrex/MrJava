package ClasesYObjetos;

public class Main {

    public static void main(String[] args) {
        Operacion op = new Operacion();

        op.leerNumeros();
        op.suma();
        op.resta();
        op.multiplicacion();
        op.division();

        op.mostrarResultados();
    }

}
