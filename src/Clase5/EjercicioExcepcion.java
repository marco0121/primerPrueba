package Clase5;

import java.util.Scanner;

public class EjercicioExcepcion {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println ("Por favor ingresa un numero");


        try{
            int numero = scanner.nextInt ();

            System.out.println ("ingresaste un numero correcto felicidades:" + numero);

        }catch (Exception e) {

            System.out.println ("Error: solo se permiten numeros, por favor ingresa un numero:");

        }
    }
}
