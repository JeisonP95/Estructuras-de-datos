
package com.sanchezdarcypencuejesus.finalbor;

import java.util.ArrayList;
import java.util.List;


class Cliente {
    int idCliente;
    String nombre;
    String correo;
    List<Producto> compras;

    public Cliente(int idCliente, String nombre, String correo) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.correo = correo;
        this.compras = new ArrayList<>();
    }

    public void realizarCompra(Producto producto) {
        compras.add(producto);
    }
}
