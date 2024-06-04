package listasenlazadas;

public class Elemento {

    public Object dato;
    public Elemento siguiente;

    public Elemento(Object dato) {
        this.dato = dato;
        this.siguiente = null;
    }
    public Object obtenerValor(){
        return dato;
    }
    public void enlazarSiguiente(Elemento n){
        siguiente = n;    
    }
    public Elemento obtenerSiguiente(){
        return siguiente;
    }
}
