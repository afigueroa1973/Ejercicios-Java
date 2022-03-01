package AprendeJava.Cap04_Ciclos;

/*
  Ejercicio 22:
  Pedir 5 calificaciones de alumnos y decir al final si hay algún reprobado (<60%).
*/

import java.util.Scanner;

public class Ejercicio22_Reprobado {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Se declaran las variables
    int nota;
    boolean reprobado = false;

    System.out.println("\n** A L U M N O S  R E P R O B A D O S **");
    System.out.println("----------------------------------------");

    for (int i = 1; i <= 5 ; i++) { // Ciclo que pide cinco calificaciones
      System.out.print("Favor ingrese nota #" + i + ": ");
      nota = input.nextInt();

      if (nota < 60) // Condición para notas reprobadas
        reprobado = true;
    }
    if (reprobado)
      System.out.println("\nHay por lo menos un alumno reprobado");
    else
      System.out.println("\nNo hay alumnos reprobados");

    input.close(); // Se cierra la clase Scanner
  }
}