package com.mycompany.veterinariacanina.persistencia;

import com.mycompany.veterinariacanina.logica.Dueno;
import com.mycompany.veterinariacanina.logica.Mascota;

public class ControladoraPersistencia {
    
    DuenoJpaController duenoJpa = new DuenoJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();
    
    public void guardar(Dueno dueno, Mascota mascota) {

        //Crear en la BD el dueño
        duenoJpa.create(dueno);
        //Crear en la BD la mascota
        mascotaJpa.create(mascota);
        
    }
    
}
