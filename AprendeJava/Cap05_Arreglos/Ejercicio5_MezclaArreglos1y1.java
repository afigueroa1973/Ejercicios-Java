package AprendeJava.Cap05_Arreglos;

/*
  Ejercicio 5:
  Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma: el 1º
  de a, el 1º de b, el 2º de a, el 2º de b, etc.
*/

import java.util.Scanner;

public class Ejercicio5_MezclaArreglos1y1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("\n** M E Z C L A  D E  D O S  A R R E G L O S - 1 & 1 **");
    System.out.println("------------------------------------------------------");

    // Se crean tres arreglos de 10 elementos cada uno
    int[] a, b, c;

    a = new int[10]; // Arreglo a[] de 10 elementos
    b = new int[10]; // Arreglo b[] de 10 elementos
    c = new int[20]; // El arreglo c[] almacenará elementos de a[] y b[] (20 en total)

    // Pedimos el arreglo "a"
    System.out.println("\nIngresando el primer arreglo...");
    for (int i = 0; i < 10; i++) {
      System.out.print("Favor ingrese un número[" + (i + 1) + "]: ");
      a[i] = input.nextInt();
    }
    // Pedimos el arreglo "b"
    System.out.println("\nIngresando el segundo arreglo...");
    for (int i = 0; i < 10; i++) {
      System.out.print("Favor ingrese un número[" + (i + 1) + "]: ");
      b[i] = input.nextInt();
    }
    // Ahora mezclaremos los dos arreglos ingresados en el arreglo "c"; para los
    // arreglos "a" y "b"
    // utilizaremos como indice "i" y para el arreglo "c" utilizaremos como indice
    // "j"
    int j = 0;
    for (int i = 0; i < 10; i++) { // Ciclo para crear el arreglo "c"; durante cada ciclo se incluye
      // tanto un elemento de "a" como uno de "b", entonces solo ejecutamos 10 ciclos
      c[j] = a[i]; // 1° de a, 2° de a,...
      j++; // Comenzando por 0, se incrementa en 1, para que el elemento de la siguiente
      // línea de código, se grabe en la siguiente posición, al volver a correr el ciclo, su posición
      // sería la 2, 4, 6, 8, etc...
      c[j] = b[i]; // 1° de b, 2° de b,...
      j++; // Comienza en la posición 1, ya que fue incrementado su valor, asi cuando corra el ciclo
      // "for" la siguiente vez, su posición sería la 3, 5, 7, 9, etc...
    }
    // Se imprime el arreglo resultante
    System.out.print("\nEl tercer arreglo resultante es: ");
    for (int i = 0; i < 20; i++) {
      System.out.print(c[i] + ", ");
    }
    System.out.print("\b\b\n");

    input.close(); // Se cierra la clase Scanner
  }
}