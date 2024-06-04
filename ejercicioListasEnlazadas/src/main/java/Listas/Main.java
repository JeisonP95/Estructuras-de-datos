package Listas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Lista lista1 = new Lista();
        Scanner ingreso = new Scanner(System.in);
        int op = 0;
        do {
            System.out.println("-----Menu-----");
            System.out.println("1.Insertar");
            System.out.println("2.Mostrar");
            System.out.println("3.Eliminar");
            System.out.println("4.Buscar");
            System.out.println("5.Salir");

            System.out.println("Ingresa la opcion");
            op = ingreso.nextInt();
            ingreso.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Ingresa los nombres");
                    String nombres = ingreso.nextLine();
                    System.out.println("Ingresar los apellidos");
                    String apellidos = ingreso.nextLine();
                    System.out.println("Ingresar la edad");
                    int edad = ingreso.nextInt();

                    Persona persona = new Persona(nombres, apellidos, edad);
                    lista1.insertar(persona);
                    break;
                case 2:
                    lista1.mostrar();
                    break;
                case 3:
                    if (!lista1.estaVacia()) {
                        System.out.println("Ingrese su indice");
                        int ind = ingreso.nextInt();
                        lista1.eliminar(ind);
                    } else {
                        System.out.println("Esta lista esta vacia, ingrese datos a la lista");
                    }
                    break;
                case 4:
                    buscarPorSerial(lista1);
                    break;
                case 5:
                    System.out.println("GRACIAS POR UTILIZAR NUESTRO SERVICIO");
                    break;
                default:
                    System.out.println("ingresa la opcion correcta");

            }

        } while (op != 5);
    }

    public static void buscarPorSerial(Lista lista1) {
        System.out.println("Buscar por nombre: ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre: ");
        String nombreABuscar = scanner.nextLine();

        if (lista1.buscarLista(nombreABuscar)) {
            System.out.println("La persona con nombre " + nombreABuscar + " está registrada.");
        } else {
            System.out.println("La persona con nombre " + nombreABuscar + " no está registrada.");
        }
    }
}
//implementar dos funciones mas diferentes a las que ya estan (eliminar o ? se incluye en el menu)
