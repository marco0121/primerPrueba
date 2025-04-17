import java.util.Scanner;

public class Vocales {

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        // Solicitar la palabra al usuario
        System.out.print ("Ingresa una palabra: ");
        String palabra = scanner.nextLine ();

        // Mostrar las vocales
        System.out.print ("Las vocales en el arreglo son: ");
        for (int i = 0; i < palabra.length (); i++) {
            char letra = Character.toLowerCase (palabra.charAt (i));
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.print (letra + " ");
            }
        }
    }
}
