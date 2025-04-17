public class Arreglos {
    public static void main(String[] args) {
        int [] numeros =new int[4]; //arreglo vacio declaracion e inicialiazacion

        numeros[0]=8;
        numeros[1]=25;
        // definiendo for each
        for(int num:numeros){
            System.out.print(num+ " ");
        }
        char [] letras = {'a','b','c'};
        System.out.println("El tamaño de mi arreglo es: "+ letras.length);
        letras[0]='f';
        System.out.println(letras);
    }
}
