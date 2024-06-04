
package com.sanchezdarcypencuejesus.finalbor;

import java.util.ArrayList;
import java.util.List;

class CategoriaProducto {
    String nombre;
    List<Producto> productos;

    public CategoriaProducto(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
}