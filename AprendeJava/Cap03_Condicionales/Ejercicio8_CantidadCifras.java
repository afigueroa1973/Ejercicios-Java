package AprendeJava.Cap03_Condicionales;

/*
  Ejercicio 8:
  Pedir un número entre 0 y 99,999 y decir cuantas cifras tiene.
*/

import java.util.Scanner;

public class Ejercicio8_CantidadCifras {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("\n** C O N T A R  C I F R A S **");
    System.out.println("------------------------------");

    System.out.print("Favor ingrese un número entre 0 y 99,999: ");
    int numero = input.nextInt(); // Se declara la variable y al mismo tiempo se solicita su valor por teclado

    if (numero < 10) // Se establecen las condiciones para números de 1, 2, 3, 4 y 5 cifras
      System.out.println("\nEl número tiene una cifra");
    else if (numero < 100)
      System.out.println("\nEl número tiene dos cifras");
    else if (numero < 1000)
      System.out.println("\nEl número tiene tres cifras");
    else if (numero < 10000)
      System.out.println("\nEl número tiene cuatro cifras");
    else if (numero < 100000)
      System.out.println("\nEl número tiene cinco cifras");

    input.close(); // Se cierra la variable Scanner
  }
}