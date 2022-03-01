package AprendeJava.Cap02_Operadores;

/*
  Ejercicio 2:
  Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de sus horas
  semanales trabajadas y de su salario por hora.
*/

import java.util.Scanner;

public class Ejercicio2_SalarioSemanal {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int horas;
    float salarioHora, salario;

    System.out.println("\n** S A L A R I O  S E M A N A L **");
    System.out.println("----------------------------------");

    // Pedimos los datos
    System.out.print("Ingrese el número total de horas trabajadas a la semana: ");
    horas = input.nextInt();
    System.out.print("Ingrese el salario por hora: ");
    salarioHora = input.nextFloat();

    // Sacamos el salario semanal
    salario = horas * salarioHora;

    // Mostramos el resultado
    System.out.println("\nEl salario semanal es de $" + salario);

    input.close();
  }
}