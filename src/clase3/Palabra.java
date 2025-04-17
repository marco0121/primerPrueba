package clase3;

import java.util.ArrayList;
import java.util.List;

public class Palabra {
    public static void main (String[] args) {
        //lista vacia
        List<Integer> lista1= new ArrayList<> ();
        lista1.add (5);
        lista1.add (10);
        lista1.add (1,8);
        System.out.println ("el segundo elemento de la lista es: "+lista1.get (1));
        lista1.remove (1);
        System.out.println (lista1);

    }
}
