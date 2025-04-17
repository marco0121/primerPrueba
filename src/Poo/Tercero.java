package Poo;

public class Tercero {
    public static void main (String[] args) {
        //CREANDO MIS PROCESOS
        MiHilo miHilo = new MiHilo ("Hilo-A");
        MiHilo miHilo1 = new MiHilo ("Hilo-B");
       // INICIAR HILOS PARA PASARLE LAS TAREAS
        miHilo.start();
        miHilo1.start();
    }

}

