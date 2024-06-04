package EjercicioListasEnlazadas;

public class Nodo {
    private Object valor;
    private Nodo siguiente;

    public Nodo(Object valor) {
        this.valor = valor;
        this.siguiente = null;
    }
    
    public Object obtenerValor(){
        return valor;
    }
    
    public void enlazarSiguiente(Nodo n){
        siguiente = n;
    }
    
    public Nodo obtenerSiguiente(){
        return siguiente;
    }
}
