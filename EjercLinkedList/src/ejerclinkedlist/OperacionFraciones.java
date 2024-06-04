package ejerclinkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class OperacionFraciones {

    private LinkedList<Fraccion> listaFracion = new LinkedList<>();

    public void agregarALaLista() {
        Scanner ingreso = new Scanner(System.in);
        Fraccion fraccion = new Fraccion();

        System.out.println("Ingrese el numerador");
        int numerador = ingreso.nextInt();

        System.out.println("Ingrese el denominador");
        int denominador = ingreso.nextInt();

        fraccion.setDenominador(denominador);
        fraccion.setNumerador(numerador);

        listaFracion.addLast(fraccion);
    }

    public void mostrarLaLista() {
        for (int i = 0; i < listaFracion.size(); i++) {
            System.out.println("Su fraccionario es : " + listaFracion.get(i).toString());
        }
    }

    public void eliminarElPrimero() {
        listaFracion.removeFirst();
        System.out.println("Se elimino  correctamente");
    }

    public void eliminaarElUltimo() {
        listaFracion.removeLast();
        System.out.println("Se elimino correctamennte");
    }

    public void estaVacia() {
        if (!listaFracion.isEmpty()) {
            System.out.println("La lista no esta vacia");
            mostrarLaLista();
        } else {
            System.out.println("La lista esta vacia");
        }
    }

    public void buscar() {
        Scanner ingreso = new Scanner(System.in);

        System.out.println("Ingrese su indice");
        int indice = ingreso.nextInt();

        System.out.println(listaFracion.get(indice).toString());
    }
}
