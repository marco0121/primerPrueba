import java.util.Scanner;

public class Imc {
        public static void main(String[] args) {
            //variables
            String correo = solicitarCorreo();
            double peso = solicitarPeso();
            double altura = solicitarAltura();
            double imc = calcularIMC(peso, altura);
            double montoPago= solictarPago ();
            //mostrara el resultado
            mostrarResultado(correo, imc, montoPago);
        }
        //funcion correo
        public static String solicitarCorreo() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese su correo electrónico:");
            return scanner.nextLine();
        }

          //funcion peso
        public static double solicitarPeso() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese su peso en kilogramos:");
            return scanner.nextDouble();
        }

        //funcion altura
        public static double solicitarAltura() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese su altura en metros:");
            return scanner.nextDouble();
        }
        //funcion solicitar pago
        public static double solictarPago(){
            Scanner scanner = new Scanner (System.in);
            System.out.println ("ingrese su pago: ");
            return scanner.nextDouble ();
        }
        //operacion para calcular el indice de la masa corporal
        public static double calcularIMC(double peso, double altura) {
            return peso / (altura * altura);
        }
         //mostrar resultado
        public static void mostrarResultado(String correo, double imc, double montoPago) {
            System.out.printf("Su IMC es: %.2f%n", imc);
            System.out.println("El resultado será enviado al correo: " + correo);
            System.out.println ("se registro su pago correctamente !gracias¡  $"+montoPago);

        }
}

