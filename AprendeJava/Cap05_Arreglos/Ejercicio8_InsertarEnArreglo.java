package AprendeJava.Cap05_Arreglos;

/*
  Ejercicio 8:
  Diseñar un programa que cree un arreglo de 10 elementos enteros. Leer mediante el teclado ocho
  números. Después se debe pedir un número y una posición, e insertarlo en la posición indicada,
  desplazando los números que se encuentren detrás.
*/

import java.util.Scanner;

public class Ejercicio8_InsertarEnArreglo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("\n** I N S E R T A R  E N  A R R E G L O **");
    System.out.println("-----------------------------------------");

    int[] arreglo = new int[10]; //Creamos un arreglo de 10 elementos enteros
    int numero;
    int posicion;

    System.out.println("Llenamos el arreglo hasta la posición número 7...");
    for (int i = 0; i < 8; i++) {
      System.out.print("Favor ingrese un número[" + (i) + "]: ");
      arreglo[i] = input.nextInt();
    }

    // Se solicita el nuevo número a ingresar dentro del arreglo
    System.out.print("\nFavor ingrese un nuevo número: ");
    numero = input.nextInt();

    // Pedimos una posición en el rango de 0-7 para colocarlo en ella...
    do {
      System.out.print("Ingrese la posición deseada en el arreglo: ");
      posicion = input.nextInt();
    } while (posicion < 0 || posicion > 7);

    // Corremos una posición los elementos de atrás
    for (int i = 7; i >= posicion; i--) {
      arreglo[i + 1] = arreglo[i];
    }
    // Insertamos el número en la posición deseada
    arreglo[posicion] = numero;

    // Imprimimos el arreglo resultante
    System.out.println("\nEl arreglo resultante queda en...");
    for (int i = 0; i < 9; i++) {
      System.out.println("Posición[" + i + "]: " + arreglo[i]);
    }
    input.close(); // Cerramos la clase Scanner
  }
}