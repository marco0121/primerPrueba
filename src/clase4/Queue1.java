package clase4;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {
    public static void main (String[] args) {
        Queue<String> cadenas = new LinkedList<> ();// EN ENTRAR ES EL PRIMERO EN SALIR
        cadenas.add ("Mariposa");
        cadenas.offer ("Oruga");//offer añadir elementos
        cadenas.add ("Elefante");
        cadenas.add ("araña");//add agregar elemento
        System.out.println (cadenas);
        cadenas.poll ();//Mariposa
        cadenas.poll ();//Oruga
        System.out.println ("El siguiente elemento es:" + cadenas.element ());
        cadenas.poll ();//Elefante
        cadenas.poll ();//poll quitar elementos
        cadenas.poll ();//Araña
        System.out.println (cadenas.poll ());//regresa un null
        //al inicio se puede añadir
        System.out.println (cadenas.peek ());
        cadenas.offer ("Marinela");
        System.out.println (cadenas);

    }
}
