package repasonodo;


public class ListaEnlazada {

    Nodo cabeza;
    int size = 0;

    public ListaEnlazada() {
        cabeza = null;
        size = 0;
    }

    public Object obtener(int index) {
        int contador = 0;
        //se crea nuevo nodo
        Nodo temporal = cabeza;
        while (contador < index) {
            temporal = temporal.obtenerSiguiente();
            contador++;
        }
        return temporal.obtenerValor();
    }

    public void addPrimero(Object obj) {
        if (cabeza == null) {

        } else {
            //puntero
            Nodo temp = cabeza;
            //guardar el nuevo nodo
            Nodo nuevo = new Nodo(obj);
            nuevo.enlazarSiguiente(temp);
            cabeza = nuevo;
        }
        size++;
    }

    public int size() {
        return size;

    }

    public boolean estaVacia() {
        return (cabeza == null) ? true : false;
    }
}
