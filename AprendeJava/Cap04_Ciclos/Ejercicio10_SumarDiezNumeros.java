package AprendeJava.Cap04_Ciclos;

/*
  Ejercicio 10:
  Pedir 10 números y escribir la suma total.
*/

import java.util.Scanner;

public class Ejercicio10_SumarDiezNumeros {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Se declaran las variables
    int numero;
    int sumaTotal = 0;
    int contador = 1;

    System.out.println("\n** S U M A R  M E D I A N T E  C I C L O S **");
    System.out.println("---------------------------------------------");

    do{
      System.out.print("Favor ingrese un número entero: ");
      numero = input.nextInt();

      sumaTotal += numero;
      contador++;
    }
    while (contador <= 10); // Se limita el ciclo a ingresar solamente diez números

    System.out.println("\nLa suma total de los diez números ingresados es " + sumaTotal);

    input.close(); // Se cierra la variable Scanner
  }
}