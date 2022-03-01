package AprendeJava.Cap04_Ciclos;

/*
  Ejercicio 8:
  Pedir un número "n" para luego mostrar todos los números desde el 1 a la "n".
*/

import java.util.Scanner;

public class Ejercicio8_ImprimirNumeros {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("\n** I M P R I M I R  N Ú M E R O S **");
    System.out.println("------------------------------------");

    // Se solicita el valor de "n"
    System.out.print("Favor ingrese un número entero cualquiera: ");
    int n = input.nextInt();

    System.out.println();
    for (int i = 1; i <= n; i++) { // Ciclo for para imprimir desde 1 hasta "n"
      System.out.print(i + " ");
    }
    System.out.println();

    input.close(); // Se cierra la clase Scanner
  }
}