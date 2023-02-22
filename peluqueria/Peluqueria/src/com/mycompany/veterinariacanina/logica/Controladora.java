package com.mycompany.veterinariacanina.logica;

import com.mycompany.veterinariacanina.persistencia.ControladoraPersistencia;
import java.util.List;

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

    public List<Mascota> traerMascotas() {
        //se crea metodo traer mascota
        return controlPersis.traerMascota();
    }

    public void borrarMascota(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);

    }

    public Mascota buscarMascota(int num_cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Mascota traerMascota(int num_cliente) {
        return controlPersis.traerMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco, String nombreMasco, String raza,
            String color, String observaciones, String alergico, String atenEsp,
            String nombreDueno, String celDueno) {
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);

        //modifico mascota
        controlPersis.modificarMascota(masco);
        Dueno dueno = this.buscarDueno(masco.getUnDueno().getId_dueno());
        dueno.setNombre(nombreDueno);
        dueno.setCelDueno(celDueno);

        //llamar a modificar Dueño
        this.modificarDueno(dueno);
    }

    private Dueno buscarDueno(int id_dueno) {
        return controlPersis.traerDueno(id_dueno);
    }

    private void modificarDueno(Dueno dueno) {
        controlPersis.modificarDueno(dueno);
    }

}

//Para guardar en la base de datos -> Le toca a la persistencia
