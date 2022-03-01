package AprendeJava.Cap03_Condicionales;

/*
  Ejercicio 12: Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, suficiente, bien,
  notable y sobresaliente.
*/

import java.util.Scanner;

public class Ejercicio12_NotaClase {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("\n** N O T A  D E  C L A S E **");
    System.out.println("-----------------------------");

    System.out.print("Favor ingrese la nota de clase (Valor entero entre 0 y 10): ");
    int nota = input.nextInt();

    switch (nota) {
      case 0, 1, 2, 3, 4, 5 -> System.out.println("\nLa nota tiene categoría de insuficiente");
      case 6 -> System.out.println("\nLa nota tiene categoría de suficiente");
      case 7 -> System.out.println("\nLa nota tiene categoría de buena");
      case 8, 9 -> System.out.println("\nLa nota tiene categoría de notable");
      case 10 -> System.out.println("\nLa nota tiene categoría de sobresaliente");
      default -> {
      }
    }
    input.close(); // Se cierra la clase Scanner
  }
}