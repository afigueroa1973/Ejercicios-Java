package AprendeJava.Cap04_Ciclos;

/*
  Ejercicio 21:
  Pedir 10 números y mostrar al final si se ha introducido alguno negativo.
*/

import java.util.Scanner;

public class Ejercicio21_NumerosNegativos {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Se declaran las variables
    int numero;
    boolean negativos = false;

    System.out.println("\n** I D E N T I F I C A R  N E G A T I V O S **");
    System.out.println("----------------------------------------------");

    for (int i = 1; i <= 10 ; i++) { // Ciclo para ingresar diez números enteros
      System.out.print("Favor ingrese un número entero: ");
      numero = input.nextInt();

      if (numero < 0){ // Condición que determina si hay negativos
        negativos = true;
      }
    }
    if (negativos)
      System.out.println("\nExiste al menos un número negativo entre los introducidos");
    else
      System.out.println("\nNo hay números negativos introducidos");

    input.close(); // Se cierra la clase Scanner
  }
}