package AprendeJava.Cap04_Ciclos;

/*
  Ejercicio 2:
  Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca
  un cero.
*/

import java.util.Scanner;

public class Ejercicio2_PositivoONegativo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("\n** P O S I T I V O  O  N E G A T I V O **");
    System.out.println("-----------------------------------------");

    System.out.print("Favor ingrese un número entero cualquiera o 0 para salir: ");
    int numero = input.nextInt();

    while (numero != 0){
      if (numero > 0)
        System.out.println("\nEl número ingresado es positivo");
      else
        System.out.println("\nEl número ingresado es negativo");

      System.out.print("\nFavor ingrese un número entero cualquiera o 0 para salir: ");
      numero = input.nextInt();
    }
    System.out.println("\nGracias por utilizar mi herramienta, hasta la próxima!");

    input.close(); // Se cierra la clase Scanner
  }
}