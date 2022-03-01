package AprendeJava.Cap04_Ciclos;

/*
  Ejercicio 13:
  Pedir 10 números, mostrar la media de los números positivos, la media de los números negativos y
  la cantidad de ceros.
*/

import java.util.Scanner;

public class Ejercicio13_PromedioNumeros {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Se declaran las variables
    int numero;
    int totalPositivos = 0;
    int totalNegativos = 0;
    int contadorPositivos = 0;
    int contadorNegativos = 0;
    int contadorCeros = 0;
    String mensajePositivos = "No se ingresó un número positivo para calcular el promedio";
    String mensajeNegativos = "No se ingresó un número negativo para calcular el promedio";

    System.out.println("\n** P R O M E D I O S  Y  C E R O S **");
    System.out.println("-------------------------------------");

    for (int i = 1; i <= 10; i++) { // Ciclo para solicitar los diez números
      System.out.print("Favor ingrese un número entero: ");
      numero = input.nextInt();

      if (numero < 0) { // Condición para calcular el promedio de los negativos
        totalNegativos += numero;
        contadorNegativos++;
      }
      else if (numero > 0) { // Condición para calcular el promedio de los positivos
        totalPositivos += numero;
        contadorPositivos++;
      }
      else // Condición para calcular la cantidad de ceros
        contadorCeros++;
    }
    System.out.println("\nResumen: ");

    if (contadorPositivos == 0) // Condición para evitar la división entre ceros
      System.out.println("Promedio Números Positivos: " + mensajePositivos);
    else {
      double promedioPositivos = (double) totalPositivos / contadorPositivos;
      System.out.println("Promedio Números Positivos: " + promedioPositivos);
    }

    if (contadorNegativos == 0) // Condición para evitar la división entre ceros
      System.out.println("Promedio Números Negativos: " + mensajeNegativos);
    else {
      double promedioNegativos = (double) totalNegativos / contadorNegativos;
      System.out.println("Promedio Números Negativos: " + promedioNegativos);
    }
    System.out.println("Cantidad de Ceros Ingresados: " + contadorCeros);

    input.close(); // Se cierra la clase Scanner
  }
}