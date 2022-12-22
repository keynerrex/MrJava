package abstractas;

public class Cuadrado extends FiguraGeometrica {

    public Cuadrado(String TipoFigura) {
        super(TipoFigura);
    }

    @Override
    public void dibujar() {
        System.out.println("Se dibuja un: " + this.getClass().getSimpleName());
    }

}
