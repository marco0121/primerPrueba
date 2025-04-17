import java.util.Scanner;

public class Sueldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa tu sueldo diario: ");
        double sueldoPorHora= scanner.nextDouble();

        //variables
        int horasPorDia = 8;
        int diasPorSemana = 5;
        int diasPorQuincena = 10;
        int diasPorMes = 20;
        double impuesto = 0.18;

        //calcular sueldo

        double sueldoDiario = sueldoPorHora * horasPorDia;
        double sueldoSemanal = sueldoDiario * diasPorSemana;
        double sueldoQuincenal = sueldoDiario * diasPorQuincena;
        double sueldoMensual = sueldoQuincenal * diasPorMes;

        //calcular impuesto.

        double sueldoDiarioNeto = sueldoDiario * (1-impuesto);
        double sueldoSemanalNeto = sueldoSemanal * (1-impuesto);
        double sueldoQuincenalNeto = sueldoQuincenal * (1-impuesto);
        double sueldoMensualNeto = sueldoMensual * (1-impuesto);


        //mostrar resultado

        System.out.println("sueldo neto diario: "+sueldoDiarioNeto);
        System.out.println("sueldo neto semanal: "+sueldoSemanalNeto);
        System.out.println("sueldo neto quincenal: "+sueldoQuincenalNeto);
        System.out.println("sueldo neto mensual: "+sueldoMensualNeto);


    }
}
