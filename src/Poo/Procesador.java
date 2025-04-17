package Poo;

public class Procesador {
    private String marca;
    private Integer velocidad;

    public Procesador (String marca, Integer velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public String getMarca () {
        return marca;
    }

    public void setMarca (String marca) {
        this.marca = marca;
    }

    public Integer getVelocidad () {
        return velocidad;
    }

    public void setVelocidad (Integer velocidad) {
        this.velocidad = velocidad;
    }
}
