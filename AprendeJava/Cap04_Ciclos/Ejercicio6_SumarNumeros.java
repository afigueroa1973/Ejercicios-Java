package AprendeJava.Cap04_Ciclos;

/*
  Ejercicio 6:
  Pedir números hasta que se teclee un cero, mostrar la suma de todos los números introducidos.
*/

import java.util.Scanner;

public class Ejercicio6_SumarNumeros {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Se declaran las variables
    int numero;
    int sumaTotal = 0;

    System.out.println("\n** S U M A R  N Ú M E R O S  I N G R E S A D O S **");
    System.out.println("---------------------------------------------------");

    System.out.print("Ingrese un número entero, si ingresa 0, se sumaran todos los números introducidos: ");
    numero = input.nextInt();

    while (numero != 0){ // El ciclo se repetirá hasta que se ingrese cero
      sumaTotal += numero; // Esto es equivalente a sumaTotal = sumaTotal + numero

      System.out.print("Favor ingrese otro número entero: ");
      numero = input.nextInt();
    }
    System.out.println("\nLa suma total de los números ingresados es " + sumaTotal);

    input.close(); // Se cierra la clase Scanner
  }
}