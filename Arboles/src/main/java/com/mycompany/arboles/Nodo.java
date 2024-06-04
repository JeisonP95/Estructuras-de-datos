package com.mycompany.arboles;

public class Nodo {

    int dato;
    String nombre;
    Nodo hijoIzquierdo, hijoDerecho;

    public Nodo(int dato, String nombre) {
        this.dato = dato;
        this.nombre = nombre;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }

    @Override
    public String toString() {
        return nombre + "Su dato es: " + dato;
    }

}
