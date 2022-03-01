package AprendeJava.Cap03_Condicionales;

/*
  Ejercicio 13: (Usando ventanas gráficas)
  Hacer un programa que simule un cajero automático con un saldo inicial de 1000 Dólares, con el
  siguiente menú de opciones:
  1. Ingresar dinero a la cuenta
  2. Retirar dinero de la cuenta
  3. Salir
*/

import javax.swing.JOptionPane;

public class Ejercicio13B_CajeroATM {

  public static void main(String[] args) {

    // Se declaran las variables
    final int saldoInicial = 1000;
    double saldo, deposito, retiro;
    int opcion;

    // Menú de opciones en ventana
    opcion = Integer.parseInt(JOptionPane.showInputDialog("""
        Bienvenido al cajero Automático

        1. Ingresar dinero a la cuenta
        2. Retirar dinero de la cuenta
        3. Salir

        Seleccione la opción deseada:\s"""));

    switch (opcion) {
      case 1:
        deposito = Double.parseDouble(
            JOptionPane.showInputDialog("Ingrese la cantidad de dinero a depositar: "));
        saldo = saldoInicial + deposito;
        JOptionPane.showMessageDialog(null, """
            Depósito exitoso!
            El saldo actual en la cuenta es de $""" + saldo);
        break;
      case 2:
        retiro = Double.parseDouble(
            JOptionPane.showInputDialog("Ingrese la cantidad de dinero a retirar: "));

        if (retiro > saldoInicial) {
          JOptionPane.showMessageDialog(null, """
            Retiro fallido, la cantidad de dinero en la cuenta es insuficiente!
            El saldo actual de la cuenta es de $""" + saldoInicial);
        } else {
          saldo = saldoInicial - retiro;
          JOptionPane.showMessageDialog(null, """
            Retiro exitoso!
            El saldo actual de la cuenta es de $""" + saldo);
        }
        break;
      case 3:
        JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro cajero automático");
        break;
      default:
        JOptionPane.showMessageDialog(null,
            "La opción ingresada es incorrecta, intente nuevamente");
        break;
    }
  }
}