package AprendeJava.Cap04_Ciclos;

/*
  Ejercicio 19:
  Dadas 6 notas, escribir la cantidad de alumnos aprobados (>60%), condicionados (50 a 59%) y reprobados.
*/

import java.util.Scanner;

public class Ejercicio19_ResumenGrado {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Se declaran las variables
    int nota;
    int aprobados = 0;
    int condicionados = 0;
    int reprobados = 0;

    System.out.println("\n** R E S U M E N  D E  G R A D O **");
    System.out.println("-----------------------------------");

    for (int i = 1; i <= 6; i++) { // Ciclo for para solicitar seis notas
      do {
        System.out.print("Favor ingrese un valor entre 0 y 100, nota #" + i + ": ");
        nota = input.nextInt();
      }
      while (nota < 0 || nota > 100);

      if (nota >= 60) // Condición para aprobados
        aprobados++;
      else if (nota >= 50) // Condición para condicionados
        condicionados++;
      else
        reprobados++; // Condición para reprobados
    }
    System.out.println("\nResumen:\nAprobados: " + aprobados + "\nCondicionados: " + condicionados + "\nReprobados: "
        + reprobados);

    input.close(); // Se cierra la variable Scanner
  }
}