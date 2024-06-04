
package Listas;


public class Nodo {
    private Nodo siguiente;
    private Persona dato;
    public Nodo(Persona dato, Nodo siguiente){
        this.dato=dato;
        this.siguiente=siguiente;
    }
    public Nodo getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente){
        this.siguiente=siguiente;
    }
    public Persona getDato(){
        return dato;
    }
    public void setDato(Persona dato){
        this.dato=dato;
    }   
}
