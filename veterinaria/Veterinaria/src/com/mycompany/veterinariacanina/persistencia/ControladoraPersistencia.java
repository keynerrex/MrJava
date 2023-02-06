package com.mycompany.veterinariacanina.persistencia;

import com.mycompany.veterinariacanina.logica.Dueno;
import com.mycompany.veterinariacanina.logica.Mascota;
import com.mycompany.veterinariacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    DuenoJpaController duenoJpa = new DuenoJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Dueno dueno, Mascota mascota) {

        //Crear en la BD el dueño
        duenoJpa.create(dueno);
        //Crear en la BD la mascota
        mascotaJpa.create(mascota);

    }

    //Viene desde la controladora
    public List<Mascota> traerMascota() {
        return mascotaJpa.findMascotaEntities(); //busca todos los registros tabla mascotas
//        returna a la controladora de la logia

    }

    public void borrarMascota(int num_cliente) {
        try {
            mascotaJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
