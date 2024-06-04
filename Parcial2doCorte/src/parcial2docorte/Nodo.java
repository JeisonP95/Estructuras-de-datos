
package parcial2docorte;

public class Nodo {
    
    private Computador dato;
    private Nodo siguiente;

    // Constructor
    public Nodo(Computador dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    // Métodos de acceso para el atributo dato
    private Computador getDato() {
        return dato;
    }

    private void setDato(Computador dato) {
        this.dato = dato;
    }

    // Métodos de acceso para el atributo siguiente
    private Nodo getSiguiente() {
        return siguiente;
    }

    private void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}

