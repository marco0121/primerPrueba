package ClaseCompuesta;

public class Terciaria {
    public static void main (String[] args) {
        Pantalla pantalla = new Pantalla ("1080x2400","amoled");
        Bateria bateria = new Bateria (5000,"propia");


        Celular celular = new Celular (pantalla,bateria);
        celular.mostrarDetalleCelular ();
    }

}
