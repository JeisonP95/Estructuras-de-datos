package com.mycompany.tallerdeestructurascondicionales;

import java.util.Scanner;

public class Ejercicios {
    
    Scanner ingreso = new Scanner(System.in);

    public void tienda() {
        
        // Pedir el nombre del cliente
        System.out.println("Ingrese su nombre:");
        String nombreCliente = ingreso.nextLine();

        // Pedir la edad del cliente
        System.out.println("Ingrese su edad:");
        int edadCliente = ingreso.nextInt();

        // Pedir el total de la compra
        System.out.println("Ingrese el total de la compra:");
        double totalCompra = ingreso.nextDouble();
        
        System.out.println("Ingrese el valor del producto");
        double valorProducto = ingreso.nextDouble();

        // Calcular el descuento
        double descuento = 0.0;
        if (edadCliente > 70) {            
            descuento = totalCompra * 0.3; // 30% de descuento
        }
        else{
            descuento=totalCompra*0.1;
        } 
            
   
        // Calcular el total a paga
        double totalPagar = (totalCompra*valorProducto) - descuento;

        // Mostrar el resumen de la compra
        System.out.println("Resumen de la compra:");
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Total de la compra: $" + totalCompra);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalPagar);


    }
}
