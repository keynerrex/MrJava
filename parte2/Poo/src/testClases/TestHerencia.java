package testClases;

import herenciaPOO.Clientes;
import herenciaPOO.Empleado;
import herenciaPOO.Persona;
import java.util.Date;

public class TestHerencia {
//PRUEBA CLASE PADRE PERSONA

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(5000, "Keyner");
        System.out.println(empleado1.obtenerDetalle());
        imprimir(empleado1);
        var fecha = new Date();
        Clientes cliente1 = new Clientes(fecha, true, "KEYNER OLIVEROS", 'M', 19, "Villa del Rey");
        System.out.println(cliente1.obtenerDetalle());
        imprimir(cliente1);
        //Polimorfismo
        Persona persona1 = new Persona("Keyner", 'M', 19, "Vila rey");
        System.out.println(persona1.obtenerDetalle());
        imprimir(persona1);

    }

    public static void imprimir(Persona persona) {

        System.out.println(persona.obtenerDetalle());
    }
}
