package AprendeJava.Cap04_Ciclos;

/*
  Ejercicio 18:
  Hacer unas modificaciones al ejercicio 17, suponiendo que no se introduce el precio por litro.
  Solo existen tres productos con precios:
    1- 0,6 $/litro
    2- 3 $/litro
    3- 1,25 $/litro
*/

import java.util.Scanner;

public class Ejercicio18_ResumenVentasB {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Se declaran las variables
    int codigo, litrosArticulo1 = 0, conteoMas600 = 0;
    double litros, importeFactura, facturacion1 = 0, facturacion2 = 0, facturacion3 = 0, facturacionTotal = 0;
    final double precioArticulo1 = 0.6;
    final double precioArticulo2 = 3.0;
    final double precioArticulo3 = 1.25;

    System.out.println("\n** R E S U M E N  D E  V E N T A S  V2.0 **");
    System.out.println("-------------------------------------------");

    for (int i = 1; i <= 5; i++) { // Ciclo "for" para ingresar cinco facturas
      do { // Ciclo "do-while" que limita los productos a tres tipos, si se introduce un código de
        // producto diferente de los establecidos, se repetirá hasta que se ingrese uno correcto
        System.out.println("Factura #" + i);
        System.out.print("Ingrese el código del producto: ");
        codigo = input.nextInt();
      }
      while (codigo < 1 || codigo > 3);

      System.out.print("Ingrese la cantidad de litros: ");
      litros = input.nextDouble();

      System.out.println();

      if (codigo == 1) {
        importeFactura = litros * precioArticulo1;
        facturacion1 += importeFactura;
        litrosArticulo1 += litros;
      }
      else if (codigo == 2) {
        importeFactura = litros * precioArticulo2;
        facturacion2 += importeFactura;
      }
      else {
        importeFactura = litros * precioArticulo3;
        facturacion3 += importeFactura;
      }
      facturacionTotal = facturacion1 + facturacion2 + facturacion3;

      if (importeFactura > 600) {
        conteoMas600++;
      }
    }
    System.out.println("Resumen de Ventas: ");
    System.out.println("Facturación Total: $" + facturacionTotal);
    System.out.println("Cantidad del artículo #1: " + litrosArticulo1 + " litros");
    System.out.println("Facturas que se emitieron por más de $600: " + conteoMas600);

    input.close(); // Se cierra la variable Scanner
  }
}