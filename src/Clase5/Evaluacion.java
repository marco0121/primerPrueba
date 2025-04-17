package Clase5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Evaluacion {
    public static void main (String[] args) {
                Scanner scanner = new Scanner(System.in);
                try {
                    // Solicitar números al usuario
                    System.out.println("Ingresa una lista de números separados por comas:");
                    String entrada = scanner.nextLine();

                    // Dividir la entrada y convertir a enteros
                    String[] numerosTexto = entrada.split(",");
                    List<Integer> numeros = new ArrayList<>();
                    for (String num : numerosTexto) {
                        numeros.add(Integer.parseInt(num.trim()));
                    }

                    // Filtrar números mayores que 10
                    List<Integer> mayoresA10 = new ArrayList<>();
                    for (int num : numeros) {
                        if (num > 10) {
                            mayoresA10.add(num);
                        }
                    }

                    // Multiplicar cada número por 2
                    List<Integer> multiplicados = new ArrayList<>();
                    for (int num : mayoresA10) {
                        multiplicados.add(num * 2);
                    }

                    // Calcular la suma total
                    int sumaTotal = 0;
                    for (int num : multiplicados) {
                        sumaTotal += num;
                    }

                    // Mostrar resultados
                    System.out.println("Números mayores a 10: " + mayoresA10);
                    System.out.println("Números multiplicados por 2: " + multiplicados);
                    System.out.println("Suma total: " + sumaTotal);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Asegúrate de ingresar solo números");
                } finally {

                }
            }
        }

