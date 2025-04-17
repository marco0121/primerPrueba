import java.util.Scanner;

public class Comparacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresa el primer numero : ");
        int num1= entrada.nextInt();

        System.out.println("ingresa el segundo numero : ");
        int num2= entrada.nextInt();

        System.out.println("ingresa el tercer numero : ");
        int num3= entrada.nextInt();

        System.out.println("ingresa el cuarto numero : ");
        int num4= entrada.nextInt();

        int mayor =num1;
        if (num2 >= mayor){
            mayor =num2;
        }
        if (num3 >= mayor){
            mayor =num3;
        }
        if (num4 >= mayor){
            mayor =num4;
        }
        System.out.println("El numero mayor es: "+ mayor);
    }
}
