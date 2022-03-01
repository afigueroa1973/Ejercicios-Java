package AprendeJava.Cap03_Condicionales;

// Programa para mostrar el uso de la condición "switch"

import javax.swing.*;

public class SentenciaSwitch {
  public static void main(String[] args) {
    // Se declaran las variables
    int dato;

    // Se solicitan ingreso de valores por teclado
    dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entero entre 1 y 5: "));

    switch(dato){
      case 1: JOptionPane.showMessageDialog(null, "Es el número 1");
        break;
      case 2: JOptionPane.showMessageDialog(null, "Es el número 2");
        break;
      case 3: JOptionPane.showMessageDialog(null, "Es el número 3");
        break;
      case 4: JOptionPane.showMessageDialog(null, "Es el número 4");
        break;
      case 5: JOptionPane.showMessageDialog(null, "Es el número 5");
        break;
      default: JOptionPane.showMessageDialog(null, "El número no esta en el rango de 1 a 5");
    }
  }
}