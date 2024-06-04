
package listasenlazadas;

public class Enlaces {
    Elemento cabeza;
    int tamaño;
    
    public Enlaces() {
        this.cabeza = null;
        this.tamaño = 0;
    }
    public boolean estaVacia(){
        return (cabeza==null);
    }
    public void addPrimer(Object obj){
        if (cabeza==null) {
            //se creo un nodo
            cabeza = new Elemento(obj);
        } else {
            //tem es un apuntador que me va aguardar una direccion
            Elemento tem = cabeza;
            //se crea un nuevo nodo
            Elemento nuevo = new Elemento(obj);
            //Se enlaza
            nuevo.enlazarSiguiente(tem);
            cabeza = nuevo;           
        }
        tamaño++;
    } 
    public int tamaño(){
        return tamaño;
    } 
    public void eliminarPrimero(){
        
    }
}
