package AprendeJava.Cap05_Arreglos;

/*
  Ejercicio 1:
  Introducir 5 números de tipo "float", guardarlos en un arreglo y mostrarlos en el mismo orden
  introducido.
*/

import java.util.Scanner;

public class Ejercicio1_ImprimirArreglo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("\n** I M P R I M I R  A R R E G L O **");
    System.out.println("------------------------------------");

    float[] numeros = new float[5]; // Se crea un arreglo de tipo "float" de 5 elementos

    System.out.println("Guardando los datos en el arreglo...\n");
    for (int i = 0; i < 5; i++) { // Se imprimen los datos del arreglo
      System.out.print((i + 1) + ". Favor ingrese un número: ");
      numeros[i] = input.nextFloat();
    }

    System.out.print("\nImprimiendo los elementos del arreglo...");
    for (float numero : numeros) { // El ciclo "foreach" se compone de (tipo dato : nombre del arreglo)
      System.out.print(numero + "  ");
    }
    System.out.println();

    input.close(); // Se cierra la clase Scanner
  }
}