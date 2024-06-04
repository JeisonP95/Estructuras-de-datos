package stockcomputadores;

public class ListaComputadores {

    private Nodo inicio;
    private Nodo fin;

    public ListaComputadores() {
        inicio = null;
        fin = null;
    }

    public void insertarComputador(Computador computador) {
        Nodo nuevo = new Nodo(computador, null);
        
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }

    public void mostrarComputadores() {
        if (inicio == null) {
            System.out.println("La lista de computadores está vacía.");
        } else {
            Nodo actual = inicio;
            while (actual != null) {
                System.out.println(actual.getDato());
                actual = actual.getSiguiente();
            }
        }
    }

    public boolean buscarComputador(String serial) {
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.getDato().getSerial().equals(serial)) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public void eliminar(int index) {

        if (index == 0) {
            inicio = inicio.getSiguiente();
        } else {
            int cont = 0;

            Nodo temporal = inicio;
            while (cont < index - 1) {
                temporal = temporal.getSiguiente();
                cont++;
            }

            temporal.setSiguiente(temporal.getSiguiente().getSiguiente());
        }
    }
}
