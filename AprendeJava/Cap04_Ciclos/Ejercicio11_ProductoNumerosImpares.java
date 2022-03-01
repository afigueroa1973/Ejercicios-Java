package AprendeJava.Cap04_Ciclos;

/*
  Ejercicio 11:
  Elaborar un programa que muestre el producto de los 10 primeros números impares.
*/

public class Ejercicio11_ProductoNumerosImpares {
  public static void main(String[] args) {
    // Se declara la variable
    int producto = 1;

    System.out.println("\n** P R O D U C T O  D E  N Ú M E R O S  I M P A R E S **");
    System.out.println("--------------------------------------------------------");

    for (int i = 1; i <= 20; i += 2) { // la variable contador ejecuta el ciclo cada dos números
      producto *= i;
    }
    System.out.println("\nEl producto de los diez primeros números impares es " + producto);
  }
}