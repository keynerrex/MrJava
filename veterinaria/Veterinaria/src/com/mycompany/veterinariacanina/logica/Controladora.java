package com.mycompany.veterinariacanina.logica;

import com.mycompany.veterinariacanina.persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color,
            String observaciones, String alergico, String atenEsp,
            String nombreDueno, String celDueno) {

        //Creamos al dueño y asignamos sus valores
        Dueno dueno = new Dueno();
        dueno.setNombre(nombreDueno);
        dueno.setCelDueno(celDueno);

        //Creamos la mascota y asignamos sus valores
        Mascota mascota = new Mascota();
        mascota.setNombre(nombreMasco);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencion_especial(atenEsp);
        mascota.setObservaciones(observaciones);
        //uno a uno 
        mascota.setUnDueno(dueno);

        controlPersis.guardar(dueno, mascota);
    }
//Para guardar en la base de datos -> Le toca a la persistencia
}
