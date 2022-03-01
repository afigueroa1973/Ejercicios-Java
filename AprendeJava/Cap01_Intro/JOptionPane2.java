package AprendeJava.Cap01_Intro;

// Uso de las ventanas gráficas para introducción y salida de datos, sin importar la biblioteca Swing.

public class JOptionPane2 {
  public static void main(String[] args) {
    int entero;
    char letra;
    double decimal;
    String cadena;

    cadena = javax.swing.JOptionPane.showInputDialog("Ingrese la cadena:");

    entero = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese un entero:"));

    letra = javax.swing.JOptionPane.showInputDialog("Ingrese una letra:").charAt(0);

    decimal = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Ingrese un número decimal:"));

    // En este caso, para no importar la biblioteca Swing, se escribe toda la ruta del método en la
    // línea de código
    javax.swing.JOptionPane.showMessageDialog(null, "La cadena es " + cadena);
    javax.swing.JOptionPane.showMessageDialog(null, "El entero es " + entero);
    javax.swing.JOptionPane.showMessageDialog(null, "La letra es " + letra);
    javax.swing.JOptionPane.showMessageDialog(null, "El decimal es " + decimal);
  }
}