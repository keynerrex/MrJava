package automovil.logica;

import automovil.persistencia.ControladoraPersistencia;

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

}
