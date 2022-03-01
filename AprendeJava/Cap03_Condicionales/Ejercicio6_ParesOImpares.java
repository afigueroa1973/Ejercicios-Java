package AprendeJava.Cap03_Condicionales;

/*
  Ejercicio 6:
  Hacer un programa que tome dos números y diga si ambos son pares o impares.
*/

import java.util.Scanner;

public class Ejercicio6_ParesOImpares {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Se declaran las variables
    int numero1;
    int numero2;

    System.out.println("\n** P A R  O  I M P A R **");
    System.out.println("-------------------------");

    // Se solicitan ambos números
    System.out.print("Favor ingrese el primer número: ");
    numero1 = input.nextInt();
    System.out.print("Favor ingrese el segundo número: ");
    numero2 = input.nextInt();

    if (numero1 % 2 == 0 && numero2 % 2 == 0) { // Condición cuando ambos números son pares
      System.out.println("\nLos números " + numero1 + " y " + numero2 + " son pares");
    }
    else if (numero1 % 2 != 0 && numero2 % 2 != 0) { // Condición cuando ambos números son impares
      System.out.println("\nLos números " + numero1 + " y " + numero2 + " son impares");
    }
    else{
      System.out.println("\nUn número es par, el otro impar"); // Condición si uno es par y el otro impar
    }
    input.close();
  }
}