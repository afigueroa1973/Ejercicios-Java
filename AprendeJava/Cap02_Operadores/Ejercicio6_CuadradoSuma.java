package AprendeJava.Cap02_Operadores;

/*
  Ejercicio 6:
  Realizar un programa que calcule el cuadrado de una suma: (a+b)^2 = a^2 + 2ab + b^2
*/

import java.util.Scanner;

public class Ejercicio6_CuadradoSuma {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double a, b, resultado;

    System.out.println("\n** C U A D R A D O  D E  L A  S U M A  **");
    System.out.println("-----------------------------------------");

    System.out.print("Ingrese el valor de a: ");
    a = input.nextDouble();
    System.out.print("Ingrese el valor de b: ");
    b = input.nextDouble();

    // Utilizamos el método "pow" de la clase "Math" para calcular el cuadrado
    resultado = Math.pow(a, 2) + (2 * a * b) + Math.pow(b, 2) ;

    System.out.println("\nEl resultado es: " + resultado);

    input.close(); // Cerramos la clase Scanner
  }
}