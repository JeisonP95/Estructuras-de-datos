package Restaurante;

import java.util.LinkedList;

//Liked
public class OrdenesRestaurante {

    private LinkedList<String> listaOrden = new LinkedList<>();

    //Metodo para crear una lista
    public void añadirAlaOrden(String orden) {
        listaOrden.addLast(orden);
        System.out.println("Pedido añadido: " + orden);
    }

    //Metodo para procesar el pedido mas antiguo
    public String procesarSiguienteOrden() {
        if (!listaOrden.isEmpty()) {
            String siguienteOrden = listaOrden.removeFirst();
            System.out.println("Procesando pedido: " + siguienteOrden);
            return siguienteOrden;
        } else {
            System.out.println("No hay pedidos en espera.");
            return null;
        }
    }

    //Metodo para mostrar los pedidos en espera
    public void mostrarOrdenLista() {
        for (String orden : listaOrden) {
            System.out.println(orden);

        }
    }

}
