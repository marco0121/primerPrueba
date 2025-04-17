package Clase5;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Lambda {
    public static void main (String[] args) {
        List<Integer> numeros = new ArrayList<> ();
        numeros.add (50);
        numeros.add (35);
        numeros.add (22);
        numeros.add (9);
        System.out.println ("numeros");
        List<Integer>filtrado = numeros.stream ().filter ( num->num>20).toList ();
        System.out.println (filtrado);
        List<Integer>doble= numeros.stream ().map (mult -> mult*2).toList ();
        System.out.println (doble);
        int suma = numeros.stream ().reduce (0,(acumulador,num)->
                acumulador + num);

    }
}
