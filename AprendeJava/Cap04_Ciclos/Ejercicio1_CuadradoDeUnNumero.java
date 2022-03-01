package AprendeJava.Cap04_Ciclos;

/*
  Ejercicio 1:
  Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
*/

import java.util.Scanner;

public class Ejercicio1_CuadradoDeUnNumero {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Declaramos las variables
    int numero;
    int cuadrado;

    System.out.println("\n** C U A D R A D O  D E  U N  N Ú M E R O **");
    System.out.println("--------------------------------------------");

    // Pedimos un número entero
    System.out.print("Favor ingrese un número entero, para salir, ingrese un número negativo: ");
    numero = input.nextInt();

    while (numero >= 0){
      cuadrado = (int)Math.pow(numero, 2); // La función Math devuelve un número de tipo "double",
      // por lo tanto, se convierte el resultado a un número de tipo "int"

      System.out.println("\nEl cuadrado de " + numero + " es " + cuadrado);

      // Se vuelve a solicitar introducir un entero para repetir el proceso, en caso de que el valor
      // introducido sea negativo, el proceso se detiene
      System.out.print("\nFavor ingrese un número entero, para salir, ingrese un número negativo: ");
      numero = input.nextInt();
    }
    System.out.println("\nGracias por utilizar mi herramienta, hasta la próxima!");

    input.close(); // Se cierra la clase Scanner
  }
}