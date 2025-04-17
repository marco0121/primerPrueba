import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingresa un número (o 0 para salir): ");
            numero = scanner.nextInt();

            if (numero != 0) {
                System.out.println("El número " + numero + " es " + (numero % 2 == 0 ? "par." : "impar."));
            }
        } while (numero != 0);

        System.out.println("hasta pronto!!!!!!");
    }
}
