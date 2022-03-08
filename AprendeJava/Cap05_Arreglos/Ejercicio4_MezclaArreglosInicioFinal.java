package AprendeJava.Cap05_Arreglos;

/*
  Ejercicio 4:
  Leer 10 números enteros, guardarlos en un arreglo. Debemos mostrarlos en el siguiente orden: el
  primero, el último, el segundo, el penúltimo, etc.
*/

import java.util.Scanner;

public class Ejercicio4_MezclaArreglosInicioFinal {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("\n** I M P R I M I R  I N I C I O / F I N A L **");
    System.out.println("----------------------------------------------");

    // Se crea un arreglo de 10 elementos
    int[] numeros = new int[10];

    // Pedimos el arreglo
    for (int i = 0; i < 10; i++) {
      System.out.print("Favor ingrese el elemento [" + (i + 1) + "]: ");
      numeros[i] = input.nextInt();
    }
    // Imprimimos el arreglo
    System.out.print("\nEl arreglo sería: ");
    for (int i = 0; i < 5; i++) {
      System.out.print(numeros[i] + ", "); // imprimirá el primer elemento
      System.out.print(numeros[9 - i] + ", "); // Luego imprime el último elemento y asi sucesivamente
    }
    System.out.print("\b\b\n"); // Los caracteres de escape "\b\b" se utilizan para eliminar esa
    // última "coma" y el espacio que se imprimen en el bucle

    input.close(); // Se cierra la clase Scanner
  }
}