package testClases;

import herenciaPOO.Clientes;
import herenciaPOO.Empleado;
import herenciaPOO.Persona;
import java.util.Date; //fecha

public class TestHerencia {
//PRUEBA CLASE PADRE PERSONA

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(5000, "Keyner");
        System.out.println(empleado1.obtenerDetalle());
        imprimir(empleado1);
        var fecha = new Date(); //se obtiene la fecha de hoy
        Clientes cliente1 = new Clientes(fecha, true, "KEYNER OLIVEROS", 'M', 19, "Villa del Rey");
        System.out.println(cliente1.obtenerDetalle());
        imprimir(cliente1);
        //Polimorfismo
        Persona persona1 = new Persona("Keyner", 'M', 19, "Villa rey");
        System.out.println(persona1.obtenerDetalle());
        imprimir(persona1);

        //Instanceof
        determinarTipo(cliente1);
        determinarTipo(empleado1);
        determinarTipo(persona1);
        var nombre = "Keyner";
        determinarTipo(nombre);

        //CONVERSION DE OBJETO
        //CONVERSION DOWNCASTING CLASE PADRE A CLASE HIJA
        Persona persona3 = new Empleado(5000, "Keyner");
        Empleado empleado = (Empleado) persona3;
        System.out.println(empleado.obtenerDetalle());

        //UPCASTING
        Persona persona4 = new Empleado(3, "YO");
        Empleado empleado4 = (Empleado) persona4;

        //Persona persona5 = new persona4;
        //EQUALS &&
        Persona p1 = new Persona("KEYNER", 'M', 19, "VILLA");
        Persona p2 = new Persona("KEYNER", 'M', 19, "VILLA");
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        if (p1.hashCode() == p2.hashCode())
        {
            System.out.println("Los objetos son iguales");
        } else
        {
            System.out.println("Los objetos no son iguales");
        }
    }

    //Instanceof
    public static void imprimir(Persona persona) {

        System.out.println(persona.obtenerDetalle());

    }
    //Instanceof

    public static void determinarTipo(Object objeto) {
        if (objeto instanceof Empleado)
        {
            System.out.println("Es de tipo Empleado");

        } else if (objeto instanceof Clientes)
        {
            System.out.println("Es de tipo Cliente");
        } else if (objeto instanceof Persona)
        {
            System.out.println("Es de tipo Persona");
        } else if (objeto instanceof Object)
        {
            System.out.println("Es de tipo Objeto");
        }
        //Instanceof

    }
}
