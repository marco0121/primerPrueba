package clase4;

import java.util.LinkedList;
import java.util.Queue;

public class FilaBanco {
    public static void main (String[] args) {
       Queue<String> fila = new LinkedList<> ();

        fila.offer ("Raul");
        fila.offer ("Marco");
        fila.offer ("Maricela");
        fila.offer ("Carmen");
        // iniciando la atencion de clientes

        while (!fila.isEmpty ()){
            System.out.println ("Atendiendo a:"+ fila.remove ());
        }
        System.out.println ("No hay mas clientes en la fila.");

    }
}
