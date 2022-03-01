package AprendeJava.Cap03_Condicionales;

/*
  Ejercicio 14:
  Hacer un programa que pase de kilogramos a otra unidad de medida de masa, mostrar en pantalla un
  menú con las opciones posibles.
*/

import javax.swing.JOptionPane;

public class Ejercicio14_ConvertidorUnidades {

  public static void main(String[] args) {
    // Se declaran las variables
    float medida;
    int opcion;

    JOptionPane.showMessageDialog(null, """
        CONVERSOR DE KILOGRAMOS""");

    medida = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad de kilogramos: "));
    opcion = Integer.parseInt(JOptionPane.showInputDialog("""
        Convertir a:
        1. Hectogramos
        2. Decagramos
        3. Gramos
        4. Decigramos
        5. Centigramos
        6. Miligramos
        """));

    switch (opcion) {
      case 1:
        medida *= 10;
        JOptionPane.showMessageDialog(null, "La medida en Hectogramos es de " + medida);
        break;
      case 2:
        medida *= 100;
        JOptionPane.showMessageDialog(null, "La medida en Decagramos es de " + medida);
        break;
      case 3:
        medida *= 1000;
        JOptionPane.showMessageDialog(null, "La medida en Gramos es de " + medida);
        break;
      case 4:
        medida *= 10000;
        JOptionPane.showMessageDialog(null, "La medida en Decigramos es de " + medida);
        break;
      case 5:
        medida *= 100000;
        JOptionPane.showMessageDialog(null, "La medida en Centigramos es de " + medida);
        break;
      case 6:
        medida *= 1000000;
        JOptionPane.showMessageDialog(null, "La medida en Miligramos es de " + medida);
        break;
      default:
        JOptionPane.showMessageDialog(null, "Opción incorrecta, intente nuevamente");
        break;
    }
  }
}