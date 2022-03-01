package AprendeJava.Cap03_Condicionales;

// Programa para determinar si un número es par o impar, utilizando el operador ternario

import javax.swing.*;

public class OperadorTernario {
  public static void main(String[] args) {
    // Se declara la variable
    int numero;

    JOptionPane.showMessageDialog(null, """
        ** PAR O IMPAR **""");

    numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

    /*
      Opción utilizando if-else en la cual se puede apreciar que el operador ternario, simplifica en
      gran manera la cantidad de código utilizado, cuatro líneas de código se transforma en una sola:
      if (numero % 2 == 0)
        System.out.println("El número es par");
      else
        System.out.println("El número es impar");
    */

    String mensaje;
    mensaje = (numero % 2 == 0)? "El número es par!" : "El número es impar!";

    JOptionPane.showMessageDialog(null, mensaje);
  }
}