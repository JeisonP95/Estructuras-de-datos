package com.mycompany.colascirculares;

import java.util.LinkedList;
import java.util.Queue;

public class ColasCirculares {

    public static void main(String[] args) {
        /**
         * Las colas circulares son estructuras de datos que permiten un acceso
         * eficiente a los elementos, ya que los elementos se pueden agregar al
         * final y quitar del principio de la cola de manera constante. Son
         * útiles en situaciones donde se necesita un procesamiento continuo de
         * elementos en un ciclo, como en el procesamiento de datos en tiempo
         * real o en aplicaciones de gestión de eventos.
         *
         * Ejemplos de situaciones donde se pueden utilizar colas circulares: 
         * -Procesamiento de eventos en tiempo real. 
         * - Implementación de un buffer circular en sistemas de comunicación. 
         * - Algoritmo de round-robin en la planificación de CPU.
         */

        Queue<Integer> cola = new LinkedList<>();

        // Añadir elementos a la cola
        cola.add(1); // equivalente a enqueue
        cola.add(2);
        cola.add(3);

        // Consultar el primer elemento de la cola sin eliminarlo
        System.out.println("Consultar primer elemento (peek): " + cola.peek()); // 1

        // Eliminar y devolver el primer elemento de la cola
        System.out.println("Eliminar y devolver el elemento que se ha eliminado (dequeue): " + cola.poll()); // 1

        // Consultar el primer elemento de la cola después de eliminar
        System.out.println("Consultar primer elemento después de eliminar (peek): " + cola.peek()); // 2

        // Verificar si la cola está vacía
        System.out.println("¿La cola está vacía? (isEmpty): " + cola.isEmpty()); // false

        // Obtener el tamaño de la cola
        System.out.println("Tamaño de la cola (size): " + cola.size());
    }
}
