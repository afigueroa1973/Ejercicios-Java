package AprendeJava.Cap02_Operadores;

/*
  Ejercicio 7:
  Construir un programa que, dado un número total de horas, devuelve el número de semanas, días y
  horas equivalentes. Por ejemplo, dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16
  horas.
*/

import java.util.Scanner;

public class Ejercicio7_ConvertirHoras {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int horasTotales, semanas, dias, horas;

    System.out.println("\n** C O N V E R S O R  D E  H O R A S **");
    System.out.println("---------------------------------------");

    System.out.print("Ingrese el número total de horas a convertir: ");
    horasTotales = input.nextInt();

    semanas = horasTotales / 168; // Hallamos las semanas, una semana tiene 168 horas
    dias = horasTotales % 168 / 24; // Hallamos los dias
    horas = horasTotales % 24; // Hallamos las horas

    System.out.print("\n" + horasTotales + " horas, son equivalentes a ");
    System.out.println(semanas + " semanas " + dias + " días y " + horas + " horas...");

    input.close(); // Cerramos la clase Scanner
  }
}