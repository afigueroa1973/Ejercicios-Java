package AprendeJava.Cap03_Condicionales;

/*
  Ejercicio 7:
  Pedir tres números y mostrarlos ordenados de mayor a menor.
*/

import java.util.Scanner;

public class Ejercicio7_OrdenamientoDeNumeros {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Se declaran las variables
    int numero1, numero2, numero3;

    System.out.println("\n** O R D E N A R  N Ú M E R O S **");
    System.out.println("----------------------------------");

    // Se piden los números
    System.out.print("Favor ingrese el primer número: ");
    numero1 = input.nextInt();
    System.out.print("Favor ingrese el segundo número: ");
    numero2 = input.nextInt();
    System.out.print("Favor ingrese el tercer número: ");
    numero3 = input.nextInt();

    if (numero1 > numero2 && numero1 > numero3) {
      if (numero2 > numero3) {
        System.out.println("\nEl orden de los números de mayor a menor es: " + numero1 + ", " + numero2 + " y " + numero3);
      } else if (numero2 < numero3) {
        System.out.println("\nEl orden de los números de mayor a menor es: " + numero1 + ", " + numero3 + " y " + numero2);
      }
    }
    if (numero2 > numero1 && numero2 > numero3) {
      if (numero1 > numero3) {
        System.out.println("\nEl orden de los números de mayor a menor es: " + numero2 + ", " + numero1 + " y " + numero3);
      } else if (numero1 < numero3) {
        System.out.println("\nEl orden de los números de mayor a menor es: " + numero2 + ", " + numero3 + " y " + numero1);
      }
    }
    if (numero3 > numero1 && numero3 > numero2) {
      if (numero1 > numero2) {
        System.out.println("\nEl orden de los números de mayor a menor es: " + numero3 + ", " + numero1 + " y " + numero2);
      } else if (numero1 < numero2) {
        System.out.println("\nEl orden de los números de mayor a menor es: " + numero3 + ", " + numero2 + " y " + numero1);
      }
    }
    input.close(); // Se cierra la clase Scanner
  }
}