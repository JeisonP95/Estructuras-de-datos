package stockcomputadores;

public class Nodo {

    private Computador dato;
    private Nodo siguiente;

    public Nodo(Computador dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Computador getDato() {
        return dato;
    }

    public void setDato(Computador dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
