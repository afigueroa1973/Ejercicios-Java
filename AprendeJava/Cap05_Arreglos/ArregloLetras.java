package AprendeJava.Cap05_Arreglos;

// Crear un arreglo que incluya elementos de tipo "char" o letras.

import java.util.Scanner;

public class ArregloLetras {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("\n** C R E A R  U N  A R R E G L O  D E  L E T R A S **");
    System.out.println("-----------------------------------------------------");

    // Se solicita la cantidad de elementos a ingresar en el arreglo
    System.out.print("Ingrese la cantidad de elementos del arreglo: ");
    int nElementos = input.nextInt();

    // Se crea un arreglo de tipo "char" para la cantidad de elementos indicados
    char[] letras = new char[nElementos];

    System.out.println(); // Ciclo "for" para solicitar el ingreso de los datos
    for (int i = 0; i < nElementos; i++) {
      System.out.print("Introduzca el carácter de la posición" + "[" + i + "]: ");
      letras[i] = input.next().charAt(0); // El método "charAt(0)" captura solo la primera letra, si
      // es que se introdujera una palabra de varias letras
    }
    System.out.print("\nLos caracteres en el arreglo son los siguientes: [");
    for (int i = 0; i < nElementos; i++) { // Ciclo "for" para imprimir los datos del arreglo
      System.out.print(letras[i] + ", ");
    }
    System.out.print("\b\b]\n"); // Los caracteres de escape "\b\b" se utilizan para eliminar esa
    // última "coma" que se imprime en el bucle

    input.close(); // Se cierra la clase Scanner
  }
}