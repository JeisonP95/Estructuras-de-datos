package repasonodo;


public class RepasoNodo {

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        
        System.out.println("Esta vacia " + lista.estaVacia());
        
        lista.addPrimero("jorge");
        lista.addPrimero(20);
        lista.addPrimero("hola");
        lista.addPrimero(3);
        
        System.out.println("primer elemento "+lista.obtener(0));
        System.out.println("último elemento: " + lista.obtener(lista.size() - 1));
        System.out.println("Index 2: "+lista.obtener(2));
        
        System.out.println("Esta vacia " + lista.estaVacia());
        System.out.println("Tamaño: "+lista.size());
        
    } 
}