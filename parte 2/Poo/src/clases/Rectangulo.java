package clases;

public class Rectangulo {

    //variables de la clase
    public int base;
    public int altura;

    public Rectangulo() {
        System.out.println(base);
        System.out.println(altura);
    }

    //variables locales, dentro de este metodo
    public int area(int base, int altura) {
        //asignando sus atributos
        this.base = base;
        this.altura = altura;
        return this.base * this.altura;
    }

    public int perimetro(int base, int altura) {
        base = this.base;
        altura = this.altura;
        return 2 * (this.base * this.altura);
    }
}
