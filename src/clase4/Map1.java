package clase4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map1 {
    public static void main (String[] args) {
        Map<String,String> diccionarioenes = new HashMap<> ();
        diccionarioenes.put ("cat","gato");//PUT PARA AGREGAR DATOS
        diccionarioenes.put ("dog","perro");
        diccionarioenes.put ("bird","ave");
        System.out.println (diccionarioenes);
        diccionarioenes.replace ("bird","pajaro");
        System.out.println (diccionarioenes);
        System.out.println ("Los valores del map son: " );
        for (String traduccion: diccionarioenes.values ()){
            System.out.println ("* " + traduccion);
        }
        for (String clave: diccionarioenes.keySet ()){
            System.out.println (clave+ " -> "+diccionarioenes.get (clave));
        }

    }
}
