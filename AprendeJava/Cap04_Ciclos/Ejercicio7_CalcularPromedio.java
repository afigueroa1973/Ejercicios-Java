package AprendeJava.Cap04_Ciclos;

/*
  Ejercicio 7:
  Pedir números hasta que se introduzca uno negativo y calcular la media.
*/

import java.util.Scanner;

public class Ejercicio7_CalcularPromedio {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int numero;
    int sumaTotal = 0;
    int contador = 0;
    double promedio;

    System.out.println("\n** C A L C U L A R  P R O M E D I O **");
    System.out.println("--------------------------------------");

    System.out.print("Introduzca un número entero, para salir, ingrese cualquier número negativo: ");
    numero = input.nextInt();

    while (numero >= 0) { // Si se ingresa un número negativo, se interrumpe el ciclo
      sumaTotal += numero;
      contador++; // Variable que contabiliza la cantidad de números ingresados para calcular promedio

      System.out.print("Favor introduzca otro número entero: ");
      numero = input.nextInt();
    }
    if (contador == 0) // Se establece una restricción para evitar la división entre cero
      System.out.println("\nNo se puede calcular el promedio ya que no se ingresó ningún dato");
    else {
      promedio = (double) sumaTotal / contador;
      System.out.println("\nEl promedio de los números ingresados es de " + promedio);
    }
    input.close(); // Se cierra la variable Scanner
  }
}