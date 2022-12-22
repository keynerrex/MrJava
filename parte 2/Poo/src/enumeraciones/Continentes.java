//ENUMERACIONES CON VALORES
package enumeraciones;

public enum Continentes {
    //Elementos (VALORES)
    AFRICA(54),
    EUROPA(50),
    ASIA(48),
    AMERICA(35),
    OCEANIA(14); //fin hasta que ya no haya mas datos

    private final int paises; //son valores finales

    //Requiere constructor
    private Continentes(int paises) {
        this.paises = paises;
    }

    public int getPaises() {
        return this.paises;
    }
}
