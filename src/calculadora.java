import java.util.Scanner;

public class calculadora {
    public class Calculadora {    public void main (String[] args) {
        //esta parte es en donde voy a invocar a mis metodos y a mis funciones
         Scanner entrada= new Scanner(System.in);
         double n1, n2;
         System.out.println("Ingresa un numero 1");
         n1= entrada.nextDouble();
        System.out.println("Ingresa un número 2");
         n2= entrada.nextDouble();
        //invocar a la funcion
         suma(n1,n2);
        // Crear un objeto de Calculadora o instanciar la clase Calculadora
         Calculadora calc= new Calculadora();
        calc.resta(n1,n2);
         }
        // declaracion de una función
        static double suma(double num1, double num2){
         return num1+ num2;
        }    //Creando un metodo
        public double resta(double num1, double num2){
        return num1- num2;    }}


    }
