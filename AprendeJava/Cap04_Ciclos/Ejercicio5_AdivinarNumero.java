package AprendeJava.Cap04_Ciclos;

/*
  Ejercicio 5:
  Realizar un juego para adivinar un número. Para ello generar un número aleatorio entre 0 y 100,
  luego ir pidiendo números indicando “es mayor” o “es menor” según sea mayor o menor con respecto a
  N. El proceso termina cuando el usuario acierta y muestra el número de intentos.
*/

import java.util.Scanner;

public class Ejercicio5_AdivinarNumero {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Se declaran las variables
    int contador = 1; // La variable contador lleva un conteo de los intentos realizados
    int aleatorio = (int) (Math.random() * 100); // El método "random" de la clase "Math", genera un
    // número aleatorio de tipo "double" entre 0 y 1, luego se multiplica por 100 para dar el rango
    // solicitado, y posteriormente se convierte a entero

    System.out.println("\n** A D I V I N A R  N Ú M E R O **");
    System.out.println("----------------------------------");

    // Se solicita la entrada de datos
    System.out.print("Favor ingrese un número entero entre 0 y 100: ");
    int numero = input.nextInt();

    while (numero != aleatorio){ // El ciclo se repetirá hasta que número introducido sea igual al "random"
      if (numero > aleatorio)
        System.out.println("El número buscado es menor");
      else
        System.out.println("El número buscado es mayor");

      System.out.print("Favor ingrese un número entero entre 0 y 100: ");
      numero = input.nextInt();
      contador++;
    }
    System.out.println("\nAcertaste y lo intentaste " + contador + " veces!");

    input.close(); // Se cierra la clase Scanner
  }
}