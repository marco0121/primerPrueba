package Clase5;

public class Excepcion {
    public static void main (String[] args) {
        int x=5, z=0;
        double resultado = 0.0;
        try{

            resultado=x/z;
        }catch (Exception e){
            System.out.println ("Nose puede dividir entre cero");

        }finally {
            System.out.println ("Fin del programa");
        }
        System.out.println (resultado);
    }
}
