package SobrecargadeMetodos;

public class Main {
    
    public static void main(String[] args) {
        Persona p1 = new Persona("Keyner", 19);
        p1.correr();
        Persona p2 = new Persona(1005221273);
        p2.correr(1000);
    }
    
}
