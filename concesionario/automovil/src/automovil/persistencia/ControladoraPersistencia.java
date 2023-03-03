package automovil.persistencia;

import automovil.logica.Automovil;

public class ControladoraPersistencia {
    
    AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    public void agregarAuto(Automovil auto) {
        autoJpa.create(auto);
    }
    
}
