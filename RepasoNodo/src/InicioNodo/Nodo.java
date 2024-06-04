package InicioNodo;

public class Nodo {

    Object valor;
    //puntero
    Nodo siguiente;

    //crear constructor
    public Nodo(Object valor) {
        this.valor = valor;
        this.siguiente = null;
    }
    //regresa el valor asignado
    public Object obtenerValor() {
        return valor;
    }

    //metodo enlacazar para apuntar a otro nodo
    public void enlazarSiguiente(Nodo n) {
        siguiente = n;
    }

    //metodo obtener para obtener el valor del nodo
    public Nodo obtenerSiguiente() {
        return siguiente;
    }
}
