package Clase5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenarNombre {
    public static void main (String[] args) {
        List<String> nombre = new ArrayList<> ();

        nombre.add ("Marco");
        nombre.add ("Roberto");
        nombre.add ("Adrian");
        nombre.add ("Ariana");
        nombre.add ("Delfina");
        nombre.add ("Alejandra");
        System.out.println ("nombres");
        List<String> nomMay = nombre.stream().map(nm->nm.toUpperCase()).toList();
        System.out.println (nomMay);

        String letraFil = "A";
        List<String> nombreFiltro = nomMay.stream().filter (filtro -> filtro.startsWith(letraFil)).toList();
        System.out.println ("Los nombres empiezan con " +letraFil + "son" +nombreFiltro);

    }

}
