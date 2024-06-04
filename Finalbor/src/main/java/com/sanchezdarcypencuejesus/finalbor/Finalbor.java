/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sanchezdarcypencuejesus.finalbor;

import java.util.ArrayList;
import java.util.List;

public class SistemaVentas {
    public static void main(String[] args) {
        // Ejemplo de uso:

        // Crear productos y categorías
        Producto producto1 = new Producto("P001", "Camiseta", 19.99);
        Producto producto2 = new Producto("P002", "Pantalón", 29.99);

        CategoriaProducto categoriaRopa = new CategoriaProducto("Ropa");
        categoriaRopa.agregarProducto(producto1);
        categoriaRopa.agregarProducto(producto2);

        // Crear clientes
        Cliente cliente1 = new Cliente(1, "Cliente1", "cliente1@example.com");
        Cliente cliente2 = new Cliente(2, "Cliente2", "cliente2@example.com");

        // Asociar clientes con productos (compras)
        cliente1.realizarCompra(producto1);
        cliente2.realizarCompra(producto2);

        // Crear vendedores
        Vendedor vendedor1 = new Vendedor(101, "Vendedor1");

        // Asociar vendedor con venta
        List<Producto> ventaProductos = new ArrayList<>();
        ventaProductos.add(producto1);
        ventaProductos.add(producto2);

        Venta venta1 = new Venta("V001", ventaProductos);
        vendedor1.venta = venta1;

        // Imprimir información de la venta
        System.out.println("Venta realizada por " + vendedor1.nombre + ":");
        for (Producto producto : venta1.productos) {
            System.out.println("- " + producto.nombre + ": $" + producto.precio);
        }

        System.out.println("Total: $" + venta1.total);
    }