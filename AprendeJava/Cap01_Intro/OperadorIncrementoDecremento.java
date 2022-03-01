package AprendeJava.Cap01_Intro;

// Líneas de código para mostrar el funcionamiento de los operadores de incremento y decremento

public class OperadorIncrementoDecremento {
  public static void main(String[] args) {
    int x1 = 5;
    int y1 = x1++;

    System.out.println("\n" + y1); // Primero asigna x1 a y1; 5
    System.out.println(x1); // Luego suma x1 + 1; 6

    int x2 = 5;
    int y2 = ++x2;

    System.out.println("\n" + y2); // Luego asigna x a y; 6
    System.out.println(x2); // Primero suma x + 1; 6

    int x3 = 5;
    int y3 = x3--;

    System.out.println("\n" + y3); // Primero asigna x a y; 5
    System.out.println(x3); // Luego resta x - 1; 4

    int x4 = 5;
    int y4 = --x4;

    System.out.println("\n" + y4); // Luego asigna x a y; 4
    System.out.println(x4); // Primero resta x - 1; 4
  }
}