package clase3;

public class Circulo {
    //Atributos
    int x, y , radio;

    public Circulo (int x, int y, int radio) {
        this.x = x;
        this.y=y;
        this.radio=radio;
    }

    public static void main (String[] args) {
        //instanciar una clase
        Circulo circulo = new Circulo (2,4,8);
        System.out.println ("el radio del circulo es: " +circulo.radio);
    }
}

