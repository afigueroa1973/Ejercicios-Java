package AprendeJava.Cap03_Condicionales;

/*
  Ejercicio 1:
  Elaborar un programa que lea un número entero y muestre si el número es múltiplo de 10
*/

import java.util.Scanner;

public class Ejercicio1_MultiploDeDiez {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Se declara la variable
    int numero;

    System.out.println("\n** M U L T I P L O  D E  D I E Z **");
    System.out.println("-----------------------------------");

    //Pedimos el número
    System.out.print("Favor ingrese un número entero cualquiera: ");
    numero = input.nextInt();

    //Comprobamos si es múltiplo de 10
    if (numero % 10 == 0) {
      System.out.println("\nEl número " + numero + " es múltiplo de 10");
    } else { //Caso contrario
      System.out.println("\nEl número " + numero + " no es múltiplo de 10");
    }
    input.close();
  }
}