import java.util.Scanner;

public class Ab {
    public static void main (String[] args) {
        int[][] ventas = new int[3][5];
        Scanner entrada = new Scanner (System.in);

        for (int filas = 0; filas <= 2; filas++) {
            for (int col = 0; col <= 4; col++) {
                System.out.println ("ingresa un numero: ");
                ventas[filas][col] = entrada.nextInt ();

            }
        }
        //imprimir el arreglo
        for (int filas = 0; filas <= 2; filas++) {
            for (int col = 0; col <= 4; col++) {
                System.out.println (ventas[filas][col]);
            }
            System.out.println (" ");
        }
    }
}