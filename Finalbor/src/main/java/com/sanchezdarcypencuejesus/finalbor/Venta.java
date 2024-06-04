
package com.sanchezdarcypencuejesus.finalbor;

import java.util.List;

class Venta {
    String codigoVenta;
    List<Producto> productos;
    double total;

    public Venta(String codigoVenta, List<Producto> productos) {
        this.codigoVenta = codigoVenta;
        this.productos = productos;
        this.total = calcularTotal();
    }

    private double calcularTotal() {
        return productos.stream().mapToDouble(p -> p.precio).sum();
    }
}

