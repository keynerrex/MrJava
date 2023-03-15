package automovil.logica;

import automovil.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersi = new ControladoraPersistencia();

    public void agregarAuto(String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);

        controlPersi.agregarAuto(auto);
    }

    public List<Automovil> traerAutos() {
        return controlPersi.traerAutos();
    }

    public void borrarCarro(int idAuto) {
        controlPersi.borrarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {

        return controlPersi.traerAuto(idAuto);

    }

    public void modificarCarro(Automovil auto, String modelo, String marca,
            String motor, String color, String patente, int cantPuertas) {
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);

        //le pido a persistencia
        controlPersi.modificarCarro(auto);
    }

}
