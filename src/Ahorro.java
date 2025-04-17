import java.util.Scanner;

public class Ahorro {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("ingresa tu ahorro ");
        int ahorro= scanner.nextInt();


        //variables
        int mes= 30;
        int ano = 360;
        int ano10= ano * 10;
        double rendimiento=0.20;

        //operaciones
       double ahorroMes =ahorro * mes;
        double ahorroAno =ahorro * ano;
        double ahorroAno10 =ahorro * ano10;

        double ahorroMesNeto = ahorroMes * (1 + rendimiento);
        double ahorroAnoNeto = ahorroAno * (1+ rendimiento);
        double ahorroAno10Neto = ahorroAno10 * (1+ rendimiento);

        System.out.println("mi ahorro mensual es:  " +ahorroMesNeto);
        System.out.println("mi ahorro anual es: "+ ahorroAnoNeto);
        System.out.println("mi ahorro en 10 anos es: "+ahorroAno10Neto);


    }
}
