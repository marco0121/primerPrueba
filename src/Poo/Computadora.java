package Poo;
// clase compuesta
public class Computadora {
    private String SO;
    private MemoriaRam ram;
    private Procesador procesador;
    private DiscoDura dd;

    public Computadora (DiscoDura dd, Procesador procesador, MemoriaRam ram, String SO) {
        this.dd = dd;
        this.procesador = procesador;
        this.ram = ram;
        this.SO = SO;
    }

    public DiscoDura getDd () {
        return dd;
    }

    public void setDd (DiscoDura dd) {
        this.dd = dd;
    }

    public Procesador getProcesador () {
        return procesador;
    }

    public void setProcesador (Procesador procesador) {
        this.procesador = procesador;
    }

    public MemoriaRam getRam () {
        return ram;
    }

    public void setRam (MemoriaRam ram) {
        this.ram = ram;
    }

    public String getSO () {
        return SO;
    }

    public void setSO (String SO) {
        this.SO = SO;
    }
}
