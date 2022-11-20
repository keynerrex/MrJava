package interfaces;

public class ImplementarMySQL implements BaseDatos {

    @Override
    public void insertar() {
        System.out.println("Se inserto un Dato");
    }

    @Override
    public void listar() {
        System.out.println("Listando Datos");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando un Dato");
    }

    @Override
    public void eliminar() {
        System.out.println("Se elimino un Dato");
    }

}
