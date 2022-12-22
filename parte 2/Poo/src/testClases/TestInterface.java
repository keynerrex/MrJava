package testClases;

import interfaces.*;

public class TestInterface {

    public static void main(String[] args) {
        BaseDatos datos = new ImplementarMySQL();

        datos.insertar();

        datos.actualizar();

        datos.listar();

        datos.eliminar();

    }

}
