package AprendeJava.Cap03_Condicionales;

/*
  Ejercicio 2:
  Pedir dos números y decir cuál es el mayor de los dos o si son iguales.
*/

import java.util.Scanner;

public class Ejercicio2_MayorMenorIgual {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Se declara la variable
    int numero1, numero2;

    System.out.println("\n** M A Y O R  Q U E **");
    System.out.println("----------------------");

    //Pedimos los datos
    System.out.print("Favor ingrese el primer número: ");
    numero1 = input.nextInt();
    System.out.print("Favor ingrese el segundo número: ");
    numero2 = input.nextInt();

    //Comprobamos quien es mayor
    if (numero1 > numero2) {
      System.out.println("\nEl número mayor es " + numero1);
    }
    else if (numero2 > numero1) {
      System.out.println("\nEl número mayor es " + numero2);
    }
    else { //Caso contrario son números iguales
      System.out.println("\nAmbos números son iguales");
    }
    input.close();
  }
}