package com.mycompany.colasqueue;

import java.util.LinkedList;
import java.util.Queue;

public class ColasQueue {

    public static void main(String[] args) {

        // Crear una cola para la fila de cajas registradoras
        Queue<String> filaDeCajas = new LinkedList<>();

        // Simular la llegada de clientes a la tienda
        filaDeCajas.offer("Cliente1");
        filaDeCajas.offer("Cliente2");
        filaDeCajas.offer("Cliente3");
        filaDeCajas.offer("Cliente4");

        // Mostrar la fila de cajas antes de empezar a atender
        System.out.println("Fila de cajas antes de empezar a atender: " + filaDeCajas);

        // Empezar a atender a los clientes
        atenderCliente(filaDeCajas); // Atiende al primer cliente
        atenderCliente(filaDeCajas); // Atiende al segundo cliente

        // Mostrar la fila de cajas después de atender a algunos clientes
        System.out.println("Fila de cajas después de atender algunos clientes: " + filaDeCajas);

        // Obtener el próximo cliente en la fila sin atenderlo
        String proximoCliente = filaDeCajas.peek();
        System.out.println("Próximo cliente en la fila: " + proximoCliente);

        // Atender a otro cliente
        atenderCliente(filaDeCajas);

        // Mostrar la fila de cajas después de atender otro cliente
        System.out.println("Fila de cajas después de atender otro cliente: " + filaDeCajas);
    }

    // Método para simular la atención de un cliente
    public static void atenderCliente(Queue<String> filaDeCajas) {
        String clienteAtendido = filaDeCajas.poll();
        System.out.println("Atendiendo a: " + clienteAtendido);
    }
}
