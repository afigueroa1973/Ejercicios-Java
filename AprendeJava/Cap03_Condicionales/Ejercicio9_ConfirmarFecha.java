package AprendeJava.Cap03_Condicionales;

import java.util.Scanner;

/*
  Ejercicio 9:
  Pedir el día, mes y año de una fecha e indicar si la fecha es correcta suponiendo que todos los
  meses tienen 30 días.
*/

public class Ejercicio9_ConfirmarFecha {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("\n** C O N F I R M A R  F E C H A **");
    System.out.println("----------------------------------");

    System.out.print("Favor ingresar el día: ");
    int dia = input.nextInt(); // Se declara la variable y se solicita entrada por teclado

    System.out.print("Favor ingresar el mes: ");
    int mes = input.nextInt();

    System.out.print("Favor ingresar el año: ");
    int year = input.nextInt();

    if (dia >= 1 && dia <= 30) // Condición para que de error si se ingresa un valor fuera del rango de 1 a 30
      if (mes >= 1 && mes <= 12) // Condición para que de error si se ingresa un valor fuera del rango de 1 a 12
        if (year >= 0) // Condición para que de error si el año es menor a cero
          System.out.println("\nLa fecha " + dia + "/" + mes + "/" + year + " es correcta");
        else
          System.out.println("\nLa fecha " + dia + "/" + mes + "/" + year + " es incorrecta");
      else
        System.out.println("\nLa fecha " + dia + "/" + mes + "/" + year + " es incorrecta");
    else
      System.out.println("\nLa fecha " + dia + "/" + mes + "/" + year + " es incorrecta");

    input.close();
  }
}