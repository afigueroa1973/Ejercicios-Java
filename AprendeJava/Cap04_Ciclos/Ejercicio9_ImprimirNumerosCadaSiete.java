package AprendeJava.Cap04_Ciclos;

/*
  Ejercicio 9:
  Imprimir en consola todos los números desde el 100 al 0 de 7 en 7.
*/

public class Ejercicio9_ImprimirNumerosCadaSiete {
  public static void main(String[] args) {

    System.out.println("\n** I M P R I M I R  N Ú M E R O S  C A D A  7 **");
    System.out.println("------------------------------------------------");
    System.out.println();

    for (int i = 100; i >= 0 ; i -=7) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}