package AprendeJava.Cap02_Operadores;

/*
  Ejercicio 3:
  Guillermo tiene "n" dólares, Luis tiene la mitad de lo que posee Guillermo, Juan tiene la mitad de
  lo que poseen Luis y Guillermo juntos... Hacer un programa que calcule e imprima la cantidad de
  dinero que tienen entre los tres.
*/

import java.util.Scanner;

public class Ejercicio3_CantidadDolares {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float guillermo, luis, juan, total; // Declaramos las variables

    System.out.println("\n** C A N T I D A D  D E  D I N E R O  T O T A L **");
    System.out.println("--------------------------------------------------");

    System.out.print("Ingrese la cantidad de dinero que tiene Guillermo: ");
    guillermo = input.nextFloat();

    luis = guillermo / 2; // Luis tiene la mitad de Guillermo
    juan = (guillermo + luis) / 2; // Juan tiene la mitad de Luis y Guillermo juntos

    total = guillermo + luis + juan; // Sumamos las 3 cantidades

    System.out.println("\nLa cantidad de dinero entre los tres es de $" + total);

    input.close(); // Se cierra la clase Scanner
  }
}