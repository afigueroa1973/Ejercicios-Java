package AprendeJava.Cap03_Condicionales;

/*
  Ejercicio 4:
  En un centro comercial se hace un 20% de descuento a los clientes cuya compra supere los L. 300
  ¿Cuál será la cantidad que pagará una persona por su compra?
*/

import java.util.Scanner;

public class Ejercicio4_CantidadAPagar {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Se declaran las variables
    float precioCompra;
    float descuento;

    System.out.println("\n** C O M P R A  C O N  D E S C U E N T O **");
    System.out.println("-------------------------------------------");

    // Solicitamos el valor de la compra
    System.out.print("Favor ingrese el valor de la compra: ");
    precioCompra = input.nextFloat();

    if (precioCompra > 300) { // Se establece la condición para compras mayores a L. 300
      descuento = precioCompra * 0.20f;
      precioCompra -= descuento;
      System.out.println("\nEl total a pagar es de L. " + precioCompra);
    }
    else{
      System.out.println("\nEl total a pagar es de L. " + precioCompra);
    }
    input.close(); // Se cierra la clase Scanner
  }
}