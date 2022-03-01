package AprendeJava.Cap04_Ciclos;

/*
  Ejercicio 14: Pedir 10 sueldos, mostrar su suma y cuantos hay mayores de $1000.
*/

import java.util.Scanner;

public class Ejercicio14_SumarSalario {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Se declaran las variables
    double salario;
    double totalSalarios = 0;
    int contadorSalariosMayoresMil = 0;

    System.out.println("\n** S U M A R  S A L A R I O S **");
    System.out.println("--------------------------------");

    for (int i = 1; i <= 10 ; i++) { // Ciclo para pedir diez salarios
      System.out.print("Favor ingrese el salario" + i + ": ");
      salario = input.nextInt();
      totalSalarios += salario;

      if (salario > 1000) // Condición para salarios mayores a 1000
        contadorSalariosMayoresMil++;
    }
    System.out.println("\nTotal Salarios: $" + totalSalarios);
    System.out.println("La cantidad de salarios mayores a $1,000 es de " + contadorSalariosMayoresMil);

    input.close(); // Se cierra la clase Scanner
  }
}