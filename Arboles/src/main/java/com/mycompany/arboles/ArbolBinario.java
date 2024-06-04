package com.mycompany.arboles;

public class ArbolBinario {

    Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void agregarNodo(int dato, String nombre) {
        Nodo nodo = new Nodo(dato, nombre);

        if (this.raiz == null) {
            this.raiz = nodo;
        } else {
            Nodo auxiliar = raiz;
            Nodo padre;

            while (true) {
                padre = auxiliar;
                if (dato < auxiliar.dato) {
                    auxiliar = auxiliar.hijoIzquierdo;

                    if (auxiliar == null) {
                        padre.hijoIzquierdo = nodo;
                        return;
                    }
                } else {
                    auxiliar = auxiliar.hijoDerecho;

                    if (auxiliar == null) {
                        padre.hijoDerecho = nodo;
                        return;
                    }
                }
            }
        }
    }
}
