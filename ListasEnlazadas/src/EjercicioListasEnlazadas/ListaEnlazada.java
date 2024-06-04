package EjercicioListasEnlazadas;

public class ListaEnlazada {

    private Nodo cabeza;
    private int size;

    public ListaEnlazada() {
        cabeza = null;
        size = 0;
    }

    public Object obtener(int index) {
        int contador = 0;
        Nodo temporal = cabeza;
        while (contador < index) {
            temporal = temporal.obtenerSiguiente();
            contador++;
        }
        return temporal.obtenerValor();
    }

    public boolean estaVacia() {
        return (cabeza == null);
    }

    public void addElemento(Object obj) {
        if (cabeza == null) {
            cabeza = new Nodo(obj);
        } else {
            Nodo temp = cabeza;
            Nodo nuevo = new Nodo(obj);
            nuevo.enlazarSiguiente(temp);
            cabeza = nuevo;
        }
        size++;
    }

    public void cortar(int index) {
        int cont = 0;
        Nodo temporal = cabeza;
        while (cont < index) {
            temporal = temporal.obtenerSiguiente();
            cont++;
        }
        temporal.enlazarSiguiente(null);
        size = index;
    }

    public void eliminar(int index) {

        if (index == 0) {
            cabeza = cabeza.obtenerSiguiente();
        } else {
            int cont = 0;
            Nodo temporal = cabeza;
            while (cont < index - 1) {
                temporal = temporal.obtenerSiguiente();
                cont++;
            }
            temporal.enlazarSiguiente(temporal.obtenerSiguiente().obtenerSiguiente());
        }
        size--;
    }

    public void eliminarPrimero() {
        cabeza = cabeza.obtenerSiguiente();
        size--;
    }

    public int tamaño() {
        return size;
    }
}
