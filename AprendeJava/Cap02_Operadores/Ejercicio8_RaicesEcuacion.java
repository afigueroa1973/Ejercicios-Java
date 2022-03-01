package AprendeJava.Cap02_Operadores;

/*
  Ejercicio 8:
  Construir un programa que calcule y muestre por pantalla, las raíces de la ecuación de segundo
  grado de coeficientes reales de la forma ax^2 + bx + c = 0, donde:
  x = (-b +- sqrt(b^2-4ac))/2a
*/

import java.util.Scanner;

public class Ejercicio8_RaicesEcuacion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double a, b, c, raiz1, raiz2;

    System.out.println("\n** R A Í C E S  D E  U N A  E C U A C I Ó N **");
    System.out.println("----------------------------------------------");

    // Solicitamos los valores de a, b y c
    System.out.print("Ingrese el valor de a: ");
    a = input.nextDouble();

    System.out.print("Ingrese el valor de b: ");
    b = input.nextDouble();

    System.out.print("Ingrese el valor de c: ");
    c = input.nextDouble();

    // Utilizamos los métodos "sqrt y pow" de la clase "Math" para calcular la raíz y el exponente
    double sqrt = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
    raiz1 = (-b + sqrt) / (2 * a);
    raiz2 = (-b - sqrt) / (2 * a);

    System.out.println("\nLa ecuación " + a + "x^2 + " + b + "x + " + c + " tiene las siguientes raíces:");
    System.out.println("x1: " + raiz1);
    System.out.println("x2: " + raiz2);

    input.close(); // Cerramos la clase Scanner
  }
}