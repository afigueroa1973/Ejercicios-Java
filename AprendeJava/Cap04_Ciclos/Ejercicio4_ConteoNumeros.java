package AprendeJava.Cap04_Ciclos;

/*
  Ejercicio 4:
  Pedir números hasta que se teclee uno negativo y mostrar cuántos números se han introducido.
*/

import java.util.Scanner;

public class Ejercicio4_ConteoNumeros {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("\n** C O N T E O  D E  N U M E R O S **");
    System.out.println("-------------------------------------");

    System.out.print("Favor ingrese un número entero positivo para continuar o negativo para salir: ");
    int numero = input.nextInt();
    int contador = 0;

    while (numero >= 0){ // Mientras el valor no sea negativo, el ciclo se repetirá indefinidamente
      System.out.print("Favor ingrese un número entero positivo para continuar o negativo para salir: ");
      numero = input.nextInt();
      contador++; // La variable contador llevará un registro de las veces que el ciclo se repite
    }
    System.out.println("\nLa cantidad de números positivos ingresados es " + contador);

    input.close(); // Se cierra la clase Scanner
  }
}