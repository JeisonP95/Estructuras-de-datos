package ejerclinkedlist;

import java.util.Scanner;

public class EjercLinkedList {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        OperacionFraciones listaFracciones = new OperacionFraciones();
        int opcion = 0;

        do {
            System.out.println("-----Menu------");
            System.out.println("1.Adicionar");
            System.out.println("2.Mostrar");
            System.out.println("3.Eliminar el primero");
            System.out.println("4.Eliminar el ultimo");
            System.out.println("5.Mirar si la lista esta vacia");
            System.out.println("6.Buscar en la lista");
            System.out.println("7.Salir");

            System.out.println("Ingrese su opcion");
            opcion = ingreso.nextInt();

            switch (opcion) {
                case 1:
                    listaFracciones.agregarALaLista();
                    break;
                case 2:
                    listaFracciones.mostrarLaLista();
                    break;
                case 3:
                    listaFracciones.eliminarElPrimero();
                    break;
                case 4:
                    listaFracciones.eliminaarElUltimo();
                    break;
                case 5:
                    listaFracciones.estaVacia();
                    break;
                case 6:
                    listaFracciones.buscar();
                    break;
                case 7:
                    System.out.println("Gracias por utilizar el servicio");
                    break;   
                default:
                    System.out.println("Ingresa la opcion correcta");
            }
        } while (opcion != 5);
    }

}
