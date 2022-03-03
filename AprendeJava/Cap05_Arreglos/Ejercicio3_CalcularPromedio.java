package AprendeJava.Cap05_Arreglos;

/*
  Ejercicio 3:
  Introducir 5 números por teclado, almacenarlos en un arreglo y a continuación calcular el promedio
  de los números positivos, el promedio de los negativos y contar el número de ceros.
*/

import java.util.Scanner;

public class Ejercicio3_CalcularPromedio {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("\n** C A L C U L A R  P R O M E D I O **");
    System.out.println("--------------------------------------");

    // Se crea el arreglo y las variables
    double[] numeros = new double[5];
    double sumaPositivos = 0, sumaNegativos = 0, mediaPositivos, mediaNegativos;
    int conteoPositivos = 0, conteoNegativos = 0, conteoCeros = 0;

    System.out.println("Guardando los números en el arreglo...");
    for (int i = 0; i < 5; i++) {
      System.out.print("Ingrese el elemento " + (i + 1) + ": ");
      numeros[i] = input.nextFloat();

      if (numeros[i] == 0) {
        conteoCeros++;
      }
      else if (numeros[i] > 0) {
        sumaPositivos += numeros[i];
        conteoPositivos++;
      }
      else {
        sumaNegativos += numeros[i];
        conteoNegativos++;
      }
    }
    //Promedio de los números positivos
    if (conteoPositivos == 0) { // Condición para evitar la división entre cero
      System.out.println("\nNo hay números positivos ingresados para calcular el promedio");
    }
    else {
      mediaPositivos = sumaPositivos / conteoPositivos;
      System.out.println("\nEl promedio de los números positivos es: " + mediaPositivos);
    }
    //Promedio de los números negativos
    if (conteoNegativos == 0) { // Condición para evitar la división entre cero
      System.out.println("No hay números negativos ingresados para calcular el promedio");
    }
    else {
      mediaNegativos = sumaNegativos / conteoNegativos;
      System.out.println("El promedio de los números negativos es: " + mediaNegativos);
    }
    System.out.println("La cantidad de ceros es: " + conteoCeros);

    input.close(); // Se cierra la clase Scanner
  }
}