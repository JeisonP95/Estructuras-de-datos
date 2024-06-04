
package Listas;


public class Lista {
    private Nodo inicio;
    private Nodo fin;
    int size;
    
    public Lista(){
        inicio=null;
        fin=null;
    }
    
    public boolean estaVacia(){
        if(inicio==null){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void insertar(Persona persona){
        Nodo nuevo;
        if(estaVacia()){
            nuevo = new Nodo(persona,null);
            inicio = nuevo;
            fin = nuevo;
        }
        else{
            nuevo = new Nodo(persona,null);
            fin.setSiguiente(nuevo);
            fin = nuevo;
            
        }           
    }
    public void mostrar(){
        if (estaVacia()) {
            System.out.println("La lista esta vacia");
        } else {
            Nodo temporal;
            temporal = inicio;
            while(temporal!=null)
            {
                System.out.println("mostrar dato "+temporal.getDato().toString());
                temporal = temporal.getSiguiente();
            }
        }
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
        size--;
    }
    public boolean buscarLista(String nombre) {
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.getDato().getNombres().equals(nombre)) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

}
