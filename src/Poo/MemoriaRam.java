package Poo;

public class MemoriaRam {
    private Integer capacidad;
    private String marca;

    public MemoriaRam (Integer capacidad, String marca) {
        this.capacidad = capacidad;
        this.marca = marca;
    }

    public Integer getCapacidad () {
        return capacidad;
    }

    public void setCapacidad (Integer capacidad) {
        this.capacidad = capacidad;
    }

    public String getMarca () {
        return marca;
    }

    public void setMarca (String marca) {
        this.marca = marca;
    }
}
