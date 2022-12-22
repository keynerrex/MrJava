package abstractas;

public abstract class FiguraGeometrica {//NO SE PUEDEN CREAR OBJETOS Y PUEDE 
    //SER HEREDADO DE OTRAS
    //CLASES

    protected String tipoFigura;

    protected FiguraGeometrica(String TipoFigura) {
        this.tipoFigura = TipoFigura;
    }

    //va ser heredado de una subclase
    public abstract void dibujar();//ASI SE DEFINE METODO ABSTRATO Y INICIALIZA

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FiguraGeometrica{");
        sb.append("tipoFigura=").append(tipoFigura);
        sb.append('}');
        return sb.toString();
    }

}
