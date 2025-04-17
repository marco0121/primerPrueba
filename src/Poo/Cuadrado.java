package Poo;

public class Cuadrado extends Figura{
    private Double lado;

    public Cuadrado (String nombre, int i) {
        super (nombre);
    }

    @Override
    public Double calcularArea () {
        return lado * lado;
    }

    public Double getLado () {
        return lado;
    }

    public void setLado (Double lado) {
        this.lado = lado;
    }
}
