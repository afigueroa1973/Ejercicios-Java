package AprendeJava.Cap04_Ciclos;

/*
  Ejercicio 20:
  Pedir un número "n", introducir "n" sueldos y mostrar el sueldo máximo.
*/

import java.util.Scanner;

public class Ejercicio20_SueldoMaximo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Se declaran las variables
    double sueldo;
    double sueldoMaximo = 0;

    System.out.println("\n** S U E L D O  M Á X I M O **");
    System.out.println("------------------------------");

    // Se solicita la cantidad de sueldos a ingresar
    System.out.print("Favor introduzca un valor entero \"n\" para cantidad de sueldos a ingresar: ");
    int n = input.nextInt();

    System.out.println();

    for (int i = 1; i <= n; i++) { // Ciclo para introducir los sueldos
      System.out.print("Sueldo #" + i + ": ");
      sueldo = input.nextDouble();

      if (sueldo > sueldoMaximo) // Condición para sueldo máximo
        sueldoMaximo = sueldo;
    }
    System.out.println("\nEl sueldo máximo es de L. " + sueldoMaximo);

    input.close(); // Se cierra la clase Scanner
  }
}