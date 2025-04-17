package Poo;

public class DiscoDura {
    private String marca;
    private Integer capacidad;
    private String tipo;

    public DiscoDura (Integer capacidad, String marca, String tipo) {
        this.capacidad = capacidad;
        this.marca = marca;
        this.tipo = tipo;
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

    public String getTipo () {
        return tipo;
    }

    public void setTipo (String tipo) {
        this.tipo = tipo;
    }
}
