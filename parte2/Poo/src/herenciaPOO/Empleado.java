package herenciaPOO;
//SUBCLASES Y USO DE PODER

public class Empleado extends Persona {

    private final int idEmpleado;
    private double salario;
    private static int contadorEmpleado;

    public Empleado(double salario, String nombre) {
        super(nombre);
        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.salario = salario;

    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(this.idEmpleado);
        sb.append(", salario=").append(this.salario);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String obtenerDetalle() {
        return super.obtenerDetalle() + "Sueldo: " + this.salario;
    }

}
