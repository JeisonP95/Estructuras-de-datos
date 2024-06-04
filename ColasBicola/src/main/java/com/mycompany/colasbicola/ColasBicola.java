package com.mycompany.colasbicola;

import java.util.ArrayDeque;
import java.util.Deque;

public class ColasBicola {

    public static void main(String[] args) {
        /**
         * Las bicolas, o dequeues, son útiles en situaciones donde necesitas
         * acceder eficientemente a los datos tanto desde el frente como desde
         * la parte posterior de la estructura. Algunos momentos adecuados para
         * utilizar bicolas son:
         *
         * - Procesamiento de colas con requisitos de acceso eficiente. - Manejo
         * de listas de acciones en editores de texto. - Algoritmos de búsqueda
         * en grafos. - Políticas de reemplazo de caché FIFO/LIFO.
         */

        // Crear una Deque utilizando ArrayDeque
        Deque<String> deque = new ArrayDeque<>();

        // Agregar elementos al principio y al final
        deque.addFirst("Elemento 1");
        deque.addLast("Elemento 2");
        deque.addFirst("Elemento 3");

        // Imprimir la Deque
        System.out.println("Deque: " + deque);

        // Eliminar elementos del principio y del final
        String firstElement = deque.removeFirst();  // [Elemento 1, Elemento 2]
        System.out.println("Eliminado del principio: " + firstElement);

        String lastElement = deque.removeLast();    // [Elemento 1]
        System.out.println("Eliminado del final: " + lastElement);

        // Ver el primer y último elemento sin eliminar
        String peekFirst = deque.peekFirst();  // Elemento 1
        System.out.println("Primero sin eliminar: " + peekFirst);

        String peekLast = deque.peekLast();    // Elemento 1
        System.out.println("Último sin eliminar:" + peekLast);
    }
}
