package AprendeJava.Cap02_Operadores;

/*
  Ejercicio 1:
  Hacer un programa que calcule e imprima la suma de tres calificaciones.
*/

import java.util.Scanner; // Importamos la clase Scanner

public class Ejercicio1_SumaCalificaciones {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float nota1, nota2, nota3, suma; // Declaramos las variables

    System.out.println("\n** S U M A  D E  C A L I F I C A C I O N E S **");
    System.out.println("-----------------------------------------------");

    System.out.println("Favor ingrese tres calificaciones: ");
    nota1 = input.nextFloat(); // Guardamos las tres calificaciones; notar que solo una vez pedirá
    nota2 = input.nextFloat(); // la entrada de datos, pero debemos de ingresar tres notas, seguidas
    nota3 = input.nextFloat(); // de la tecla "enter" cada una

    suma = nota1 + nota2 + nota3; // Sumamos las 3 calificaciones

    System.out.println("\nLa suma es: " + suma);

    input.close(); // Se cierra la clase Scanner
  }
}