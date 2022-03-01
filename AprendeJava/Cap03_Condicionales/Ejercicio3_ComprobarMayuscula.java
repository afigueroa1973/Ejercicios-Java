package AprendeJava.Cap03_Condicionales;

/*
  Ejercicio 3:
  Programa que lee un carácter por teclado y comprueba si es una letra mayúscula.
*/

import java.util.Scanner;

public class Ejercicio3_ComprobarMayuscula {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Se declara la variable
    char letra;

    System.out.println("\n** C O M P R O B A R  S I  E S  M A Y U S C U L A **");
    System.out.println("----------------------------------------------------");

    System.out.print("Favor ingrese una letra: ");
    letra = input.nextLine().charAt(0);

    // Utilizamos el método isUpperCase de la clase Character
    if (Character.isUpperCase(letra)) {
      System.out.println("\nLa letra " + "\"" + letra + "\"" + " es mayúscula");
    } else {
      System.out.println("\nLa letra " + "\"" + letra + "\"" + " es minúscula");
    }
    input.close();
  }
}