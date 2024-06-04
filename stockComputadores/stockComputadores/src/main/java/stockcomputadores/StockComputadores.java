package stockcomputadores;

import java.util.Scanner;

public class StockComputadores {

    public static void main(String[] args) {
        ejecutarMenu();
    }

    public static void ejecutarMenu() {
        Scanner ingreso = new Scanner(System.in);
        ListaComputadores stock = new ListaComputadores();

        int opcionMenu;

        do {
            System.out.println("-----------MENU-----------------");
            System.out.println("1. Agregar");
            System.out.println("2. Mostrar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");

            System.out.println("Ingresa el valor deseado:");
            opcionMenu = ingreso.nextInt();

            switch (opcionMenu) {
                case 1:
                    agregarComputadora(stock);
                    break;
                case 2:
                    System.out.println("Computadoras en inventario:");
                    stock.mostrarComputadores();
                    break;
                case 3:
                    buscarPorSerial(stock);
                    break;
                case 4:
                    eliminarPorIndice(stock);
                    break;
                case 5:
                    System.out.println("----GRACIAS-----");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opcionMenu != 5);
    }

    public static void eliminarPorIndice(ListaComputadores stock) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el índice:");
        int indice = scanner.nextInt();

        stock.eliminar(indice);
        System.out.println("Se eliminó correctamente");

        System.out.println("Todas las computadoras en inventario:");
        stock.mostrarComputadores();
    }
    
    public static void agregarComputadora(ListaComputadores stock) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el serial: ");
        String serial = scanner.nextLine();

        System.out.println("Ingresa la marca: ");
        String marca = scanner.nextLine();

        System.out.println("Ingresa la capacidad de almacenamiento: ");
        int almacenamiento = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingresa la capacidad de RAM: ");
        int ram = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingresa el procesador: ");
        String procesador = scanner.nextLine();

        Computador computadora = new Computador(serial, marca, almacenamiento, ram, procesador);
        stock.insertarComputador(computadora);
    }

    public static void buscarPorSerial(ListaComputadores stock) {
        System.out.println("Buscar por serial de computadora: ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el serial: ");
        String serialABuscar = scanner.nextLine();

        if (stock.buscarComputador(serialABuscar)) {
            System.out.println("La computadora con serial " + serialABuscar + " está registrada.");
        } else {
            System.out.println("La computadora con serial " + serialABuscar + " no está registrada.");
        }
    }

}
