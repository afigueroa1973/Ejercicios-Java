package AprendeJava.Cap03_Condicionales;

/*
  Ejercicio 11: (Usando ventanas gráficas)
  Construir un programa que simule el funcionamiento de una calculadora que puede realizar las cuatro
  operaciones aritméticas básicas (suma, resta, producto y división) con valores numéricos enteros.
  El usuario debe especificar la operación con el primer carácter del primer parámetro de la línea
  de comandos: S o s para la suma, R o r para la resta, M o m para el producto y D o d para la
  división.
*/

import javax.swing.*;

public class Ejercicio11B_Calculadora {
  public static void main(String[] args) {
    // Declaramos las variables
    int numero1, numero2, suma, resta, multiplicacion;
    double division;
    char opcion;

    JOptionPane.showMessageDialog(null, "CALCULADORA BÁSICA EN JAVA");

    // Pedimos los números
    numero1 = Integer.parseInt(JOptionPane.showInputDialog("Favor ingrese un número entero: "));
    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Favor ingrese otro número entero: "));

    // Pedimos la operación aritmética
    opcion = JOptionPane.showInputDialog("Indique el tipo de operación a realizar, S para suma, R para resta, M para multiplicación y D para división: ").charAt(0);

    // Calculamos la operación
    switch (opcion) {
      case 's':
      case 'S':
        suma = numero1 + numero2;
        JOptionPane.showMessageDialog(null, "La suma es " + suma);
        break;
      case 'r':
      case 'R':
        resta = numero1 - numero2;
        JOptionPane.showMessageDialog(null, "La resta es " + resta);
        break;
      case 'm':
      case 'M':
        multiplicacion = numero1 * numero2;
        JOptionPane.showMessageDialog(null, "La multiplicación es " + multiplicacion);
        break;
      case 'd':
      case 'D':
        division = (double)numero1 / numero2;
        JOptionPane.showMessageDialog(null, "La división es " + division);
        break;
      default:
        JOptionPane.showMessageDialog(null, "La operación aritmética solicitada no existe");
        break;
    }
  }
}