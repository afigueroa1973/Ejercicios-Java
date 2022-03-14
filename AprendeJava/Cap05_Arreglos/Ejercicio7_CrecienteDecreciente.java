package AprendeJava.Cap05_Arreglos;

/*
  Ejercicio 7:
  Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los números
  están ordenados de forma creciente, decreciente, o si están desordenados.
*/

import java.util.Scanner;

public class Ejercicio7_CrecienteDecreciente {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("\n** C R E C I E N T E  O  D E C R E C I E N T E **");
    System.out.println("-------------------------------------------------");

    // Creamos el arreglo de 10 elementos enteros
    int[] arreglo = new int[10];
    // Creamos dos variables booleanas para confirmar si el arreglo es creciente o decreciente
    boolean creciente = false;
    boolean decreciente = false;
    boolean iguales = false;

    // Llenamos el arreglo...
    System.out.println("Llenamos el arreglo...");
    for (int i = 0; i < 10; i++) {
      System.out.print("Favor ingrese un número[" + (i + 1) + "]: ");
      arreglo[i] = input.nextInt();
    }
    // Confirmamos si el arreglo va en orden creciente o decreciente
    for (int i = 0; i < 9; i++) { // Se itera hasta 9, ya que si no "i + 1" saldría del arreglo
      if (arreglo[i] < arreglo[i + 1]) { // Arreglo creciente: 1-2-3-4-5...
        creciente = true;
      }
      if (arreglo[i] > arreglo[i + 1]) { // Arreglo decreciente: 5-4-3-2-1...
        decreciente = true;
      }
      if (arreglo[i] == arreglo[i + 1]){ // Arreglos iguales: 1-1-1-1-1...
        iguales = true;
      }
    }
    // Condicionales para imprimir resultados
    if (creciente && !decreciente) {
      System.out.println("\nEl arreglo se encuentra ordenado en forma creciente");
    }
    else if (!creciente && decreciente) {
      System.out.println("\nEl arreglo se encuentra ordenado en forma decreciente");
    }
    else if (iguales) {
      System.out.println("\nTodos los números del arreglo son iguales");
    }
    else
    System.out.println("\nEl arreglo se encuentra desordenado");

    input.close(); // Se cierra la clase Scanner
  }
}