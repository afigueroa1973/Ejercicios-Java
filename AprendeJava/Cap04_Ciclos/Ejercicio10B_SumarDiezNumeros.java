package AprendeJava.Cap04_Ciclos;

/*
  Ejercicio 10: (Otra forma de resolver el ejercicio)
  Pedir 10 números y escribir la suma total.
*/

import java.util.Scanner;

public class Ejercicio10B_SumarDiezNumeros {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Se declaran las variables
    int numero;
    int sumaTotal = 0;

    System.out.println("\n** S U M A R  M E D I A N T E  C I C L O S **");
    System.out.println("---------------------------------------------");

    for (int i = 1; i <= 10; i++) {
      System.out.print("Favor ingrese un número entero: ");
      numero = input.nextInt();

      sumaTotal += numero;
    }
    System.out.println("\nLa suma total de los diez números ingresados es " + sumaTotal);

    input.close(); // Se cierra la clase Scanner
  }
}