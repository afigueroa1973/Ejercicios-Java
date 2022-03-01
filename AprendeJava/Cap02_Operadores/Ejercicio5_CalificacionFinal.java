package AprendeJava.Cap02_Operadores;

/*
  Ejercicio 5:
  La calificación final de un estudiante de Informática se calcula con base a las calificaciones de
  cuatro aspectos de su rendimiento académico: participación, primer examen parcial, segundo examen
  parcial y examen final. Sabiendo que las calificaciones anteriores entran a la calificación final
  con ponderaciones del 10%, 25%, 25% y 40%; Hacer un programa que calcule e imprima la calificación
  final obtenida.
*/

import java.util.Scanner;

public class Ejercicio5_CalificacionFinal {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float participacion, primerExamen, segundoExamen, examenFinal, notaFinal;

    System.out.println("\n** C Á L C U L O  D E  L A  C A L I F I C A C I Ó N  F I N A L **");
    System.out.println("-----------------------------------------------------------------");

    // Pedimos los datos
    System.out.print("Ingrese la nota de participación: ");
    participacion = input.nextFloat();
    System.out.print("Ingrese la nota del primer examen parcial:  ");
    primerExamen = input.nextFloat();
    System.out.print("Ingrese la nota del segundo examen parcial: ");
    segundoExamen = input.nextFloat();
    System.out.print("Ingrese la nota del examen final: ");
    examenFinal = input.nextFloat();

    // Hacemos los cálculos considerando los porcentajes de participación
    participacion *= 0.10f; // Al usar una variable de tipo "float", se coloca la f después del valor
    primerExamen *= 0.25f;
    segundoExamen *= 0.25f;
    examenFinal *= 0.40f;

    // Sacamos la nota final
    notaFinal = participacion + primerExamen + segundoExamen + examenFinal;

    System.out.println("\nLa nota final es de " + notaFinal + "%");

    input.close(); // Cerramos la clase Scanner
  }
}