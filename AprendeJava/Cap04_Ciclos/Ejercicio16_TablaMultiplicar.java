package AprendeJava.Cap04_Ciclos;

/*
  Ejercicio 16:
  Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número
*/

import java.util.Scanner;

public class Ejercicio16_TablaMultiplicar {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("\n** T A B L A  D E  M U L T I P L I C A R **");
    System.out.println("-------------------------------------------");

    // Se solicita el número del cual se sacará la tabla de multiplicar
    System.out.print("Favor ingrese un número entero entre 0 y 10: ");
    int numero = input.nextInt();

    if (numero > 0 && numero <= 10){ // Condición para no permitir valores fuera del rango de 0 a 10
      System.out.println("\nLa tabla de multiplicar es:");

      for (int i = 1; i <= 12; i++) { // Ciclo para elaborar la tabla hasta el valor de 12
        System.out.println(numero + " x " + i + " = " + i * numero);
      }
    }
    else
      System.out.println("\nEl número ingresado no esta entre 0 y 10, intente nuevamente.");

    input.close(); // Se cierra la clase Scanner
  }
}