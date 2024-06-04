package Restaurante;

import java.util.Scanner;

public class PedidosRestaurante {

    public static void main(String[] args) {
        OrdenesRestaurante pedido = new OrdenesRestaurante();
        int opcion = 0;
        Scanner ingreso = new Scanner(System.in);
        //Agregar pedidos 
        do {
            System.out.println("-----Menu------");
            System.out.println("1.Agregar pedidos");
            System.out.println("2.Mostrar los pedidos");
            System.out.println("3.Mostrar los pedidos que esten haciendo");
            System.out.println("4.SALIR");

            System.out.println("Ingresa la opcion deseada");
            opcion = ingreso.nextInt();
            ingreso.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.println("Ingresar pedido");
                    String orden = ingreso.nextLine();
                    pedido.añadirAlaOrden(orden);
                    break;
                case 2:
                    pedido.mostrarOrdenLista();
                    break;
                case 3:
                    pedido.procesarSiguienteOrden();
                    break;
                case 4:
                    System.out.println("Gracias por utilizar el servicio");
                    break;
                default:
                    throw new AssertionError();
            }

        } while (opcion != 3);
    }

}
