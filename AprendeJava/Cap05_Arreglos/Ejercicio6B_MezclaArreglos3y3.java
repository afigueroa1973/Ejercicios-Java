package AprendeJava.Cap05_Arreglos;

/*
  Ejercicio 6: (Otra forma de resolver el ejercicio)
  Leer los datos correspondientes a dos arreglos de 12 elementos numéricos, y mezclarlos en un tercer
  arreglo de la forma: 3 del arreglo A, 3 del B, otros 3 de A, otros 3 de B, etc.
*/

import java.util.Scanner;

public class Ejercicio6B_MezclaArreglos3y3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("\n** M E Z C L A  D E  D O S  A R R E G L O S - 3 & 3 **");
    System.out.println("------------------------------------------------------");

    int[] x = new int[12]; // Arreglo "x" con 12 elementos
    int[] y = new int[12]; // Arreglo "y" con 12 elementos
    int[] z = new int[24]; // Arreglo "z" que contendrá a "x" y "y"

    // Pedimos el arreglo "x"
    System.out.println("\nIngresando el primer arreglo...");
    for (int i = 0; i < 12; i++) {
      System.out.print("Favor ingrese un número[" + (i + 1) + "]: ");
      x[i] = input.nextInt();
    }
    //Pedimos el arreglo "y"
    System.out.println("\nIngresando el segundo arreglo...");
    for (int i = 0; i < 12; i++) {
      System.out.print("Favor ingrese un número[" + (i + 1) + "]: ");
      y[i] = input.nextInt();
    }
    // Ahora mezclamos en el arreglo "z", 3 de "x" y 3 de "y", el indice "i" será para los arreglos
    // "x" y "y" y el índice "j" será para el arreglo "z"
    int i = 0;
    int j = 0;

    while (i < 12) {
      //Copiamos tres elementos de "x"
      for (int k = 0; k < 3; k++) {
        z[j] = x[i + k];
        j++;
      }
      //Copiamos tres elementos de "y"
      for (int k = 0; k < 3; k++) {
        z[j] = y[i + k];
        j++;
      }
      i += 3; //Como hemos copiado tres elementos de "x" y "y", incrementamos a "i" en tres
    }
    System.out.print("\nEl arreglo es: "); // Imprimimos el arreglo resultante
    for (int k = 0; k < 24; k++) {
      System.out.print(z[k] + ", ");
    }
    System.out.print("\b\b\n");

    input.close(); // Cerramos la clase Scanner
  }
}