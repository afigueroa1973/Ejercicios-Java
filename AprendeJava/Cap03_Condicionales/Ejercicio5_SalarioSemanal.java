package AprendeJava.Cap03_Condicionales;

/*
  Ejercicio 5:
  Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
  - Si trabaja 40 horas o menos se paga $16 por hora
  - Si trabaja más de 40 horas se paga $16 por cada una de las primeras 40 horas y $20 por cada hora
    extra.
*/

import java.util.Scanner;

public class Ejercicio5_SalarioSemanal {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Se declaran las variables
    double horasTrabajadas;
    double salario;

    System.out.println("\n** C Á L C U L O  D E L  S A L A R I O **");
    System.out.println("-----------------------------------------");

    // Solicitamos la cantidad de horas
    System.out.print("Favor ingrese la cantidad de horas trabajadas: ");
    horasTrabajadas = input.nextFloat();

    if (horasTrabajadas <= 40) { // Se establece una condición cuando las horas son menos de 40
      salario = horasTrabajadas * 16;
    }
    else{ // Si hay horas extras...
      double horaExtra = horasTrabajadas - 40;
      salario = 40 * 16 + horaExtra * 20;
    }
    System.out.println("\nEl salario total es de $" + salario);

    input.close(); // Se cierra la clase Scanner
  }
}