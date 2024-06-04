
package listasenlazadas;

public class ListasEnlazadas {

    public static void main(String[] args) {
        Elemento primero = new Elemento("Elemento uno");
        Elemento segundo = new Elemento("Elemento dos");
        Elemento tercero = new Elemento("Elemento tres");
        //Enlazar
        primero.enlazarSiguiente(segundo);
        segundo.enlazarSiguiente(tercero);
        //Mostrar
        System.out.println("Valor segundo elemento "+segundo.obtenerValor()); 
        //Enlazanado
        System.out.println("Valor tercer elemento "+primero.obtenerSiguiente().obtenerSiguiente().obtenerValor());
    }
    
}
