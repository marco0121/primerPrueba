package clase3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Jugadores {
    public static void main (String[] args) {
        Set<String> jugadores = new HashSet<> ();
        jugadores.add ("Neymar");
        jugadores.add ("Ronaldo");
        jugadores.add ("Roberto Carlos");
        jugadores.add ("Chicharito");
        jugadores.add ("Embape");

        System.out.println ("Jugadores del FC Barcelona");
        for (String jugador : jugadores){
            System.out.println (jugador);
        }
        String jugadorBuscado = "Neymar";
        if (jugadores.contains (jugadorBuscado)){
            System.out.println (jugadorBuscado+ " Esta en el equipo");
        }else {
            System.out.println (jugadorBuscado + " No esta en el equipo");
        }


    }
}
