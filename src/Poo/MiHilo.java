package Poo;

public class MiHilo extends Thread {
    private String nombreHilo;
    public MiHilo(String nombre){
        this.nombreHilo = nombre;
    }
    public void run(){
        System.out.println ("Iniciando hilo" + nombreHilo);
    }
}
