import java.util.Scanner;

public class MasaCorporal {

        public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);

            System.out.println("Ingrese su peso en kilogramos:");
            double peso = scanner.nextDouble();

            System.out.println("Ingrese su altura en metros:");
            double altura = scanner.nextDouble();

            double imc = peso / (altura * altura);

            System.out.printf("Su IMC es: %.2f%n", imc);

            System.out.println("Ingrese su correo:");
            String correo = scanner.toString ();
            System.out.println ("Se ha enviado el resultado al correo: "+correo);
            System.out.println("Ingrese su pago en pesos: ");
            double pago = scanner.nextDouble();
            System.out.println (" ");


        }
    }

