package ClaseCompuesta;

public class Celular {
    private Pantalla pantalla;
    private Bateria bateria;

    public Celular(Pantalla pantalla, Bateria bateria){
        this.pantalla = pantalla;
        this.bateria = bateria;
    }
    public void mostrarDetalleCelular(){
        System.out.println ("Detalles del cel:");
        System.out.println (pantalla.getResolucion ());
        System.out.println (pantalla.getTipo ());
        System.out.println (bateria.getCapacidad ());
        System.out.println (bateria.getMarca ());
    }
}
