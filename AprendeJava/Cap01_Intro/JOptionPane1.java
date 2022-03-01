package AprendeJava.Cap01_Intro;

// Uso de las ventanas gráficas para introducción y salida de datos, importando la biblioteca Swing.

import static javax.swing.JOptionPane.*;

public class JOptionPane1 {
  public static void main(String[] args) {
    int entero;
    char letra;
    double decimal;
    String cadena;

    cadena = showInputDialog("Mi nombre es: ");
    entero = Integer.parseInt(showInputDialog("Introduzca un entero:"));
    letra = showInputDialog("Introduzca una letra:").charAt(0);
    decimal = Double.parseDouble(showInputDialog("Introduzca un número decimal:"));

    showMessageDialog(null, "La cadena es: " + cadena);
    showMessageDialog(null, "El entero es: " + entero);
    showMessageDialog(null, "La letra es: " + letra);
    showMessageDialog(null, "El decimal es: " + decimal);
  }
}