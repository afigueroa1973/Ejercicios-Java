package AprendeJava.Cap02_Operadores;

/*
  Ejercicio 4:
  Una compañía de venta de autos usados, paga a su personal de ventas un salario de $1000 mensuales,
  más una comisión de $150 por cada auto vendido y el 5% del valor de la venta por auto. Cada mes
  el contador de la empresa ingresa en la computadora los datos pertinentes. Hacer un programa que
  calcule e imprima el salario mensual de un vendedor dado.
*/

import java.util.Scanner;

public class Ejercicio4_Comision {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    final int salarioMes = 1000; //El salario es constante, por eso se declara "final"
    int nAutosVendidos;
    double precioAuto, salarioFinal;

    System.out.println("\n** C Á L C U L O  D E  L A  C O M I S I Ó N **");
    System.out.println("----------------------------------------------");

    System.out.print("Ingrese la cantidad de autos vendidos: "); // Se solicita la información
    nAutosVendidos = input.nextInt();
    System.out.print("Ingrese el precio de los autos: ");
    precioAuto = input.nextDouble();

    // El salario final es igual al salario base + $ 150 por auto vendido + 5% del valor del auto
    salarioFinal = salarioMes + (nAutosVendidos * 150) + (0.05 * precioAuto * nAutosVendidos);

    System.out.println("\nEl salario es de $" + salarioFinal);

    input.close(); // Se cierra la clase Scanner
  }
}