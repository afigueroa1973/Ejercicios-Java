package AprendeJava.Cap05_Arreglos;

// Uso del bucle "foreach"

public class BucleForEach {
  public static void main(String[] args) {

    System.out.println("\n** B U C L E  F O R E A C H **");
    System.out.println("------------------------------");

    int[] numeros = {22, 5, 73, 4, 4, 86, 0, 8, 1, 125, 254, -4, 16, 31}; // Arreglo de 14 elementos

    int i = 0; // Como el bucle "foreach" carece de una variable contador, creamos una para asi
    // identificar el número de elemento; esto es opcional.
    for (int numero : numeros) { // En el bucle "foreach" se declara una nueva variable que representa
      System.out.println("Elemento[" + i + "]: " + numero); // el contenido del arreglo
      i++;
    }
  }
}