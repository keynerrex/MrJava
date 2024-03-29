package com.mycompany.veterinariacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
//Agregamos la libreria de entity

@Entity
public class Mascota implements Serializable {
//Atributos
    //Agregamos anotaciones
//por encima de los campos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int num_cliente;
    private String nombre;
    private String raza;
    private String color;
    private String calergico;
    private String atencion_especial;
    private String observaciones;
    @OneToOne //uno a uno
    private Dueno unDueno;

    public Mascota() {
    }

    public Mascota(int num_cliente, String nombre, String raza, String color, String calergico, String atencion_especial, String observaciones, Dueno unDuenio) {
        this.num_cliente = num_cliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.calergico = calergico;
        this.atencion_especial = atencion_especial;
        this.observaciones = observaciones;
        this.unDueno = unDuenio;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return calergico;
    }

    public void setAlergico(String alergico) {
        this.calergico = alergico;
    }

    public String getAtencion_especial() {
        return atencion_especial;
    }

    public void setAtencion_especial(String atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Dueno getUnDueno() {
        return unDueno;
    }

    public void setUnDueno(Dueno unDueno) {
        this.unDueno = unDueno;
    }

}
