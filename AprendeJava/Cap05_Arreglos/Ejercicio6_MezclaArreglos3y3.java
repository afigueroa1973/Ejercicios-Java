package AprendeJava.Cap05_Arreglos;

/*
  Ejercicio 6:
  Leer los datos correspondientes a dos arreglos de 12 elementos numéricos, y mezclarlos en un tercer
  arreglo de la forma: 3 del arreglo A, 3 del B, otros 3 de A, otros 3 de B, etc.
*/

import java.util.Scanner;

public class Ejercicio6_MezclaArreglos3y3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("\n** M E Z C L A  D E  D O S  A R R E G L O S - 3 & 3 **");
    System.out.println("------------------------------------------------------");

    int[] a, b, c;

    a = new int[12]; //Arreglo "a" de 12 elementos
    b = new int[12]; //Arreglo "b" de 12 elementos
    c = new int[24]; //Arreglo "c" que contendrá a "a" y "b"

    // Pedimos el arreglo "a"
    System.out.println("\nPrimer arreglo...");
    for (int i = 0; i < 12; i++) {
      System.out.print("Favor ingrese un número[" + (i + 1) + "]: ");
      a[i] = input.nextInt();
    }
    //Pedimos el arreglo "b"
    System.out.println("\nSegundo arreglo...");
    for (int i = 0; i < 12; i++) {
      System.out.print("Favor ingrese un número[" + (i + 1) + "]: ");
      b[i] = input.nextInt();
    }
    // Ahora mezclamos en el arreglo "c", 3 de "a" y 3 de "b", el indice "i" será para el arreglo "c"
    int i = 0;
    for (int k = 0; k < 12; k += 3) {
      //Copiamos 3 elementos de "a"
      c[i] = a[k]; // Se comienza en la posición k = 0
      c[i + 1] = a[k + 1]; // Se incrementa en uno para ocupar la siguiente posición...
      c[i + 2] = a[k + 2 ]; // Se incrementa en uno para ocupar la siguiente posición...
      //Copiamos 3 elementos de "b"
      c[i + 3] = b[k]; // Se comienza en la posición k = 3
      c[i + 4] = b[k + 1]; // Se incrementa en uno para ocupar la siguiente posición...
      c[i + 5] = b[k + 2 ]; // Se incrementa en uno para ocupar la siguiente posición...
      i += 6; // Incrementamos en 6 la variable "i", para que en el siguiente ciclo copie otros tres
      // elementos de "a" y otros tres de "b" comenzando en la posición seis
    }
    System.out.print("\nEl arreglo resultante es: "); // Se imprime el arreglo resultante
    for (int k = 0; k < 24; k++) {
      System.out.print(c[k] + ", ");
    }
    System.out.print("\b\b\n");

    input.close(); // Se cierra la clase Scanner
  }
}