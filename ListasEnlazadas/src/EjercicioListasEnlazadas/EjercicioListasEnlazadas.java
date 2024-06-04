package EjercicioListasEnlazadas;

import java.util.Scanner;

public class EjercicioListasEnlazadas {

    public static void main(String[] args) {
        ListaEnlazada listaEnlazada = new ListaEnlazada();

        //agregar elementos
        agregarElementos(listaEnlazada);

        //mostrar todos los elementos
        mostrarTodo(listaEnlazada);

        //mostrar elementos por indice
        mostrarPorIndice(listaEnlazada);

        //saber si esta vacia
        saberSiEstaVacia(listaEnlazada);

        //eliminar elementos
        eliminarPorIndice(listaEnlazada);

        //eliminar todo despues de indice ingresado
        eliminarTodoDespuesDeIndice(listaEnlazada);

        //eliminar el primero
        if (listaEnlazada.estaVacia() == false) {
            System.out.println("");
            System.out.println("****************MOSTRAR TODO**************");
            listaEnlazada.eliminarPrimero();
        }

        //saber tamaño
        System.out.println("su tamaño es -> " + listaEnlazada.tamaño());
    }

    public static void agregarElementos(ListaEnlazada listaEnlazada) {
        Scanner lectura = new Scanner(System.in);
        String dato = "";

        System.out.println("ingresa la cantidad de datos que desees, para salir escribe 'SALIR'");

        do {
            System.out.println("ingrese el valor a ingresar: ");
            dato = lectura.nextLine();

            if (!dato.equalsIgnoreCase("SALIR")) {
                listaEnlazada.addElemento(dato);
            }
        } while (!dato.equalsIgnoreCase("SALIR"));
    }

    public static void mostrarTodo(ListaEnlazada listaEnlazada) {
        if (listaEnlazada.estaVacia() == false) {
            System.out.println("");
            System.out.println("****************MOSTRAR TODO**************");

            for (int i = 0; i < listaEnlazada.tamaño(); i++) {
                System.out.println("elemento en el indice " + i + " es: " + listaEnlazada.obtener(i));
            }

            System.out.println("***********************************************");
        }
    }

    public static void mostrarPorIndice(ListaEnlazada listaEnlazada) {
        Scanner lectura = new Scanner(System.in);

        if (listaEnlazada.estaVacia() == false) {
            System.out.println("");
            System.out.println("****************mOSTRAR POR INDICE**************");

            System.out.println("Ingrese el indice");
            int indice = lectura.nextInt();
            System.out.println("su valor es -> " + listaEnlazada.obtener(indice));
        }
    }

    public static void saberSiEstaVacia(ListaEnlazada listaEnlazada) {
        System.out.println("");
        System.out.println("****************SABER SI ESTA VACIA LA LISTA**************");

        if (listaEnlazada.estaVacia() == true) {
            System.out.println("la lista esta vacia");
        }

        if (listaEnlazada.estaVacia() == false) {
            System.out.println("la lista contiene datos");
        }
    }

    public static void eliminarPorIndice(ListaEnlazada listaEnlazada) {
        Scanner lectura = new Scanner(System.in);

        if (listaEnlazada.estaVacia() == false) {
            System.out.println("");
            System.out.println("****************ELIMINAR POR INDICE**************");

            System.out.println("Ingrese el indice");
            int indice = lectura.nextInt();
            listaEnlazada.eliminar(indice);
            mostrarTodo(listaEnlazada);
        }
    }

    public static void eliminarTodoDespuesDeIndice(ListaEnlazada listaEnlazada) {
        Scanner lectura = new Scanner(System.in);

        if (listaEnlazada.estaVacia() == false) {
            System.out.println("");
            System.out.println("****************ELIMINAR tODO DESPUES DEL INDICE**************");

            System.out.println("Ingrese el indice");
            int indice = lectura.nextInt();
            listaEnlazada.cortar(indice);
            mostrarTodo(listaEnlazada);
        }
    }

}
