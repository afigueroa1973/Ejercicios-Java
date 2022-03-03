package AprendeJava.Cap05_Arreglos;

/*
  Ejercicio 2:
  Introducir 5 números enteros, guardarlos en un arreglo y mostrarlos en el orden inverso al introducido.
*/

import java.util.Scanner;

public class Ejercicio2_ArregloInvertido {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("\n** A R R E G L O  I N V E R T I D O **");
    System.out.println("--------------------------------------");

    int[] numeros = new int[5]; // Se crea un arreglo de tipo "int" de 5 elementos

    System.out.println("Guardando los datos del arreglo...");
    for (int i = 0; i < 5; i++) {
      System.out.print((i + 1) + ". Ingrese un numero: ");
      numeros[i] = input.nextInt();
    }

    System.out.print("\nLos elementos del arreglo en orden inverso son...");
    for (int i = 4; i >= 0; i--) {
      System.out.print(numeros[i] + ", ");
    }
    System.out.print("\b\b\n"); // Los caracteres de escape "\b\b" se utilizan para eliminar esa
    // última "coma" que se imprime en el bucle

    input.close(); // Se cierra la clase Scanner
  }
}