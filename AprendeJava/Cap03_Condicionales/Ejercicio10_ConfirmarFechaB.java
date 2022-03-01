package AprendeJava.Cap03_Condicionales;

/*
  Ejercicio 10:
  Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31
  días, sin años bisiestos.
*/

import java.util.Scanner;

public class Ejercicio10_ConfirmarFechaB {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int dia, mes, year; // Se declaran las variables

    System.out.println("\n** C O N F I R M A R  F E C H A  V E R S I O N  2.0 **");
    System.out.println("------------------------------------------------------");

    // Se solicitan los datos
    System.out.print("Favor ingresar el día: ");
    dia = input.nextInt();

    System.out.print("Favor ingresar el mes: ");
    mes = input.nextInt();

    System.out.print("Favor ingresar el año: ");
    year = input.nextInt();

    if (year <= 0)
      System.out.println("\nLa fecha " + dia + "/" + mes + "/" + year + " es incorrecta");
    else if (mes == 2 && (dia >= 1 && dia <= 28))
      System.out.println("\nLa fecha " + dia + "/" + mes + "/" + year + " es correcta");
    else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia >= 1 && dia <= 30))
      System.out.println("\nLa fecha " + dia + "/" + mes + "/" + year + " es correcta");
    else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia >= 1 && dia <= 31))
      System.out.println("\nLa fecha " + dia + "/" + mes + "/" + year + " es correcta");
    else
      System.out.println("\nLa fecha " + dia + "/" + mes + "/" + year + " es incorrecta");

    input.close(); // Se cierra la clase Scanner
  }
}