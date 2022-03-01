package AprendeJava.Cap03_Condicionales;

/*
  Ejercicio 13:
  Hacer un programa que simule un cajero automático con un saldo inicial de 1000 Dólares, con el
  siguiente menú de opciones:
  1. Ingresar dinero a la cuenta
  2. Retirar dinero de la cuenta
  3. Salir
*/

import java.util.Scanner;

public class Ejercicio13_CajeroATM {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Se declaran las variables
    final int saldoInicial = 1000; // Se declara una variable final, ya que el saldo inicial es fijo.
    double deposito;
    double retiro;
    double saldo;

    System.out.println("\n** C A J E R O  A T M **");
    System.out.println("------------------------");

    // Menú del cajero ATM
    System.out.print("""
        Bienvenido al cajero automático

        1. Ingresar dinero a la cuenta
        2. Retirar dinero de la cuenta
        3. Salir

        Seleccione la opción deseada:\s""");
    int opcion = input.nextInt();

    switch (opcion) { // Se establecen las opciones del cajero
      case 1:
        System.out.print("Ingrese la cantidad de dinero a depositar: ");
        deposito = input.nextDouble();
        saldo = saldoInicial + deposito;
        System.out.println("\nDepósito exitoso!");
        System.out.println("El saldo actual en la cuenta es de $" + saldo);
        break;
      case 2:
        System.out.print("Ingrese la cantidad de dinero a retirar: ");
        retiro = input.nextDouble();

        if (retiro > saldoInicial) { // Condición si el retiro es mayor que el saldo en la cuenta
          System.out.println(
              "\nRetiro fallido, la cantidad de dinero en la cuenta es insuficiente!");
          System.out.println("El saldo actual en la cuenta es de $" + saldoInicial);
        } else {
          saldo = saldoInicial - retiro;
          System.out.println("\nRetiro exitoso!");
          System.out.println("El saldo actual en la cuenta es de $" + saldo);
        }
        break;
      case 3:
        System.out.println("\nGracias por utilizar nuestro cajero automático");
        break;
      default:
        System.out.println("\nLa opción ingresada es incorrecta, intente nuevamente");
        break;
    }
    input.close(); // Se cierra la clase Scanner
  }
}