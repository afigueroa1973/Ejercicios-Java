package AprendeJava.Cap04_Ciclos;

/*
  Ejercicio 17:
  Una empresa que se dedica a la venta de desinfectantes y necesita un programa para gestionar las
  facturas. En cada factura figura el código del artículo, la cantidad vendida en litros y el precio
  por litro. Se piden 5 facturas introducidas que contendrán: Facturación total, cantidad en litros
  vendidos del artículo 1, y cuantas facturas se emitieron de más de $600.
*/

import java.util.Scanner;

public class Ejercicio17_ResumenVentas {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Se declaran las variables
    int codigo, litrosArticulo1 = 0, conteoMas600 = 0;
    double litros, precioLitro, importeFactura, facturacionTotal = 0;

    System.out.println("\n** R E S U M E N  D E  V E N T A S **");
    System.out.println("-------------------------------------");

    for(int i = 1;i <= 5; i++){ // Ciclo para ingresar las cinco facturas
      System.out.println("Factura #" + i);
      System.out.print("Ingrese el código del producto: ");
      codigo = input.nextInt();
      System.out.print("Ingrese la cantidad de litros: ");
      litros = input.nextDouble();
      System.out.print("Ingrese el precio por litro: ");
      precioLitro = input.nextDouble();

      System.out.println();

      importeFactura = litros * precioLitro;
      facturacionTotal += importeFactura;

      if(codigo == 1){ // Condición para calcular la cantidad de litros del artículo #1
        litrosArticulo1 += litros;
      }
      if(importeFactura > 600){ // Condición para contar la cantidad de facturas mayores a $600
        conteoMas600++;
      }
    }
    System.out.println("Resumen de Ventas: ");
    System.out.println("Facturación Total: $" + facturacionTotal);
    System.out.println("Cantidad en litros vendidos del artículo #1: " + litrosArticulo1);
    System.out.println("Facturas se emitieron por más de $600: " + conteoMas600);

    input.close(); // Se cierra la variable Scanner
  }
}