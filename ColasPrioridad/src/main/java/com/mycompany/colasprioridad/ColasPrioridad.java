package com.mycompany.colasprioridad;

import java.util.PriorityQueue;
import java.util.Comparator;

public class ColasPrioridad {

    public static void main(String[] args) {
        /*
         * Las colas de prioridad son estructuras de datos donde cada elemento
         * tiene asociado un valor de prioridad, esto cambia el metodo de como se insertan los datos. 
         */
   
        // Crear una cola de prioridad para cadenas en orden natural (ascendente)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Añadir elementos a la cola
        pq.add(5);
        pq.add(1);
        pq.add(7);
        pq.add(3);
        pq.add(9);
        pq.add(8);
        pq.add(4);

        // Imprimir estado inicial de la cola
        System.out.println("Estado inicial de la cola: " + pq);

        // Eliminar un elemento
        pq.poll();
        System.out.println("Después de eliminar: " + pq);


        // Imprimir y eliminar elementos de la cola
            
        System.out.println("Elementos de la cola en orden:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        /*
            *Aquí, el método poll() se llama repetidamente hasta que la cola esté vacía
            *Cada llamada a poll() elimina y devuelve el elemento con la más alta prioridad
            */ 
        }
    }
}
