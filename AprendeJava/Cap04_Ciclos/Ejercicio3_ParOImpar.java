package AprendeJava.Cap04_Ciclos;

/*
  Ejercicio 3:
  Leer números hasta que se introduzca un cero; para cada uno indicar si es par o impar.
*/

import java.util.Scanner;

public class Ejercicio3_ParOImpar {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("\n** P A R  O  I M P A R **");
    System.out.println("-------------------------");

    System.out.print("Favor ingrese un número entero cualquiera o 0 para salir: ");
    int numero = input.nextInt();

    while (numero != 0){ // El ciclo se repetirá indefinidamente hasta que se ingrese el cero
      String mensaje = (numero % 2 == 0) ? "\nEl número ingresado es par" : "\nEl número ingresado es impar";
      System.out.println(mensaje); // Si el residuo de dividir entre dos es cero, entonces es número par

      System.out.print("\nFavor ingrese un número entero cualquiera o 0 para salir: ");
      numero = input.nextInt();
    }
    System.out.println("\nGracias por utilizar mi herramienta, hasta la próxima!");

    input.close(); // Se cierra la clase Scanner
  }
}