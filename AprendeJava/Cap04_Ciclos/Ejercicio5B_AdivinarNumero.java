package AprendeJava.Cap04_Ciclos;

/*
  Ejercicio 5B: (Otra forma de resolver el ejercicio usando un bucle "do-while")
  Realizar un juego para adivinar un número. Para ello generar un número aleatorio entre 0 y 100,
  luego ir pidiendo números indicando “es mayor” o “es menor” según sea mayor o menor con respecto a
  N. El proceso termina cuando el usuario acierta y muestra el número de intentos.
*/

import java.util.Scanner;

public class Ejercicio5B_AdivinarNumero {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Se declaran las variables
    int contador = 0; // La variable contador lleva un registro de los intentos realizados
    int numero;
    int aleatorio = (int) (Math.random() * 100); // Genera un número aleatorio entre 0 y 100

    System.out.println("\n** A D I V I N A R  N Ú M E R O **");
    System.out.println("----------------------------------");

    do {
      System.out.print("Favor ingrese un número entero entre 0 y 100: ");
      numero = input.nextInt();

      if (numero > aleatorio)
        System.out.println("El número buscado es menor");
      else if (numero < aleatorio)
        System.out.println("El número buscado es mayor");

      contador++;
    }
    while (numero != aleatorio); // El bucle while no tiene contenido, ya que este está incluido en
    // el cuerpo de "do"

    System.out.println("\nAcertaste y lo intentaste " + contador + " veces!");

    input.close(); // Se cierra la clase Scanner
  }
}