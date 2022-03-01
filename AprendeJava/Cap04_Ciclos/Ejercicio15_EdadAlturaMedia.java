package AprendeJava.Cap04_Ciclos;

/*
  Ejercicio 15:
  Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de
  alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75 m.
*/

import java.util.Scanner;

public class Ejercicio15_EdadAlturaMedia {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Se declaran las variables
    final int alumnos = 5;
    int edad;
    int edadSuma = 0;
    int contadorMayorEdad = 0;
    double altura;
    double alturaSuma = 0;
    int contadorAltura = 0;

    System.out.println("\n** E D A D  Y  A L T U R A **");
    System.out.println("-----------------------------");

    for (int i = 1; i <= 5; i++) { // Ciclo para solicitar las edades y alturas
      System.out.print("Favor ingrese la edad del alumno" + i + ": ");
      edad = input.nextInt();
      edadSuma += edad;

      if (edad > 18) {
        contadorMayorEdad++; // Contador para mayores de 18 años
      }

      System.out.print("¿Cual es la altura?: ");
      altura = input.nextDouble();
      alturaSuma += altura;

      if (altura > 1.75) {
        contadorAltura++; // Contador para alturas mayores a 1.75 m
      }

      System.out.println();
    }
    double promedioEdad = (double) edadSuma / alumnos;
    double promedioAltura = alturaSuma / alumnos;

    System.out.println(
        "Edad promedio de los alumnos: " + promedioEdad + " años \nEstatura promedio: "
            + promedioAltura + " m \nCantidad de alumnos mayores de 18 años: " + contadorMayorEdad
            + "\nCantidad de alumnos con altura mayor de 1.75m: " + contadorAltura);

    input.close(); // Se cierra la clase Scanner
  }
}