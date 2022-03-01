package AprendeJava.Cap03_Condicionales;

/*
  Ejercicio 11:
  Construir un programa que simule el funcionamiento de una calculadora que puede realizar las cuatro
  operaciones aritméticas básicas (suma, resta, producto y división) con valores numéricos enteros.
  El usuario debe especificar la operación con el primer carácter del primer parámetro de la línea
  de comandos: S o s para la suma, R o r para la resta, M o m para el producto y D o d para la
  división.
*/

import java.util.Scanner;

public class Ejercicio11_Calculadora {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //Se declaran las variables
    int a, b;
    char operacion;

    System.out.println("\n** C A L C U L A D O R A  B Á S I C A **");
    System.out.println("----------------------------------------");

    // Se solicitan los datos por teclado
    System.out.print("Favor ingrese un número entero: ");
    a = input.nextInt();
    System.out.print("Favor ingrese otro número entero: ");
    b = input.nextInt();
    System.out.print("\nIndique el tipo de operación a realizar, S para suma, R para resta, M para multiplicación y D para división: ");
    operacion = input.next().toLowerCase().charAt(0); // Se usa el método "toLowerCase" para que asi
    // el programa admita tanto mayúsculas como minúsculas

    if (operacion == 's') { // Operación de suma
      int suma = a + b;
      System.out.println("\nLa suma de " + a + " + " + b + " es " + suma);
    }
    if (operacion == 'r') { // Operación de resta
      int resta = a - b;
      System.out.println("\nLa resta de " + a + " - " + b + " es " + resta);
    }
    if (operacion == 'm') { // Operación de multiplicación
      int multiplicacion = a * b;
      System.out.println("\nLa multiplicación de " + a + " x " + b + " es " + multiplicacion);
    }
    if (operacion == 'd' && b != 0) { // Operación de división
      double division = (double)a / b;
      System.out.println("\nLa división de " + a + "/" + b + " es " + division);
    }
    if (operacion == 'd' && b == 0) // Se incluye excepción para no dividir entre cero
      System.out.println("\nLa división entre cero no es permitida");

    input.close(); // Se cierra la clase Scanner
  }
}