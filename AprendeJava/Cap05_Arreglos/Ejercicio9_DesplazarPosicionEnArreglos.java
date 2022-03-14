package AprendeJava.Cap05_Arreglos;

/*
  Ejercicio 9:
  Crear un programa que lea por teclado y cree un arreglo de 10 números enteros y los desplace una
  posición hacia abajo: por ejemplo: El primero pasa a ser el segundo, el segundo pasa a ser el
  tercero, y así sucesivamente hasta llegar al último que pasa a ser el primero.
*/

import java.util.Scanner;

public class Ejercicio9_DesplazarPosicionEnArreglos {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("\n** D E S P L A Z A R  P O S I C I O N  E N  E L  A R R E G L O **");
    System.out.println("-----------------------------------------------------------------");

    // Creamos un arreglo de 10 elementos y una variable para almacenar el último elemento del arreglo
    int[] arreglo = new int[10];
    int ultimo;

    System.out.println("Llenamos el arreglo...");
    for (int i = 0; i < 10; i++) {
      System.out.print("Favor ingrese un número[" + (i) + "]: ");
      arreglo[i] = input.nextInt();
    }

    ultimo = arreglo[9]; // Guardamos el último elemento del arreglo

    for (int i = 8; i >= 0; i--) { //desplazamos hacia abajo una posición
      arreglo[i + 1] = arreglo[i];
    }

    arreglo[0] = ultimo; // Asignamos la primera posición para el último valor del arreglo

    System.out.println("\nEl arreglo quedaría asi...");
    for (int i = 0; i < 10; i++) {
      System.out.println("Posición[" + i + "]: " + arreglo[i]);
    }
    input.close(); // Cerramos la variable Scanner
  }
}