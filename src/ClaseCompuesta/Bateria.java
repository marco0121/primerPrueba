package ClaseCompuesta;

public class Bateria {
    private int capacidad;
    private String marca;

    public Bateria (int capacidad, String marca) {
        this.capacidad = capacidad;
        this.marca = marca;
    }

    public int getCapacidad () {
        return capacidad;
    }

    public void setCapacidad (int capacidad) {
        this.capacidad = capacidad;
    }

    public String getMarca () {
        return marca;
    }

    public void setMarca (String marca) {
        this.marca = marca;
    }
}
