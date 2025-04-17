package clase3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vendedor {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        //solicitar cantidad
        System.out.println ("Ingresa la cantidad de numeros: ");
        int cantidad = scanner.nextInt ();

        //ingrese numeros
        List<Integer> numeros = new ArrayList<> ();
        System.out.println ("ingrese los numeros");

        //variables
        int suma = 0;
        int max;
        int min;
        //realizar operaciones
        for (int i = 0; i < cantidad; i++) {
            numeros.add (i, scanner.nextInt ());

        }
        for (Integer n : numeros) {
            suma += n;

        }
        max = numeros.get (0);
        min = numeros.get (0);
        for (Integer n:numeros){
            if (n > max){
                max = n;
            }
            if (n < min){
                min = n;
            }
        }

        int promedio = suma / cantidad;

        System.out.println ("Resultados: ");
        System.out.println ("suma de los numeros: "+ suma);
        System.out.println ("Promedio de los numeros: "+promedio);
        System.out.println ("Valor maximo "+max);
        System.out.println ("Valor minimo: "+min);

    }

}
