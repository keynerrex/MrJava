package herenciaPOO;
//SUBCLASES Y USO DE PODER

import java.util.Date;

public class Clientes extends Persona {

    private final int idCliente;
    protected Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;

    public Clientes(Date fechaRegistro, boolean vip, String nombre,
            char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Clientes.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;

    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Clientes{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String obtenerDetalle() {
        return super.obtenerDetalle() + "Es vip: " + this.vip;
    }

}
