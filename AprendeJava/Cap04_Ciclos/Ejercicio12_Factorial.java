package AprendeJava.Cap04_Ciclos;

/*
  Ejercicio 12:
  Pedir un número y calcular su factorial.
*/

import java.util.Scanner;

public class Ejercicio12_Factorial {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Se declara una variable de tipo "long", ya que los factoriales resultantes son bastante grandes
    long factorial = 1;

    System.out.println("\n** F A C T O R I A L **");
    System.out.println("-----------------------");

    // Se solicita el número al cual se calculará el factorial
    System.out.print("Favor ingrese un número entero: ");
    int numero = input.nextInt();

    for (int i = 1; i <= numero; i++) {
      factorial *= i;
    }
    System.out.println("\nEl factorial de " + numero + "! es " + factorial);

    input.close(); // Se cierra la clase Scanner
  }
}