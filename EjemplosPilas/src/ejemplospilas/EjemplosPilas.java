package ejemplospilas;

import java.util.Scanner;
import java.util.Stack;

public class EjemplosPilas {

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        Scanner ingreso = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("___________MENU_________");
            System.out.println("1.Ingresar datos a la pila");
            System.out.println("2.Retirar el ultimo elemento");
            System.out.println("3.Mostar el elemento de la cima");
            System.out.println("4.Mostrar la cantidad de elementos de la pila");
            System.out.println("5.Eliminar todos los elementos de la pila");
            System.out.println("6.Mostrar todos los elementos");
            System.out.println("7.Salir");

            System.out.println("Ingrese la opcion correcta");
            opcion = ingreso.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el dato");
                    int pilas = ingreso.nextInt();
                    pila.push(pilas);
                    break;
                case 2:
                    System.out.println("Retirar el ultimo elemento");
                    pila.pop();
                    break;
                case 3:
                    System.out.println("EL elemento de la cima es: " + pila.peek());
                    break;
                case 4:
                    System.out.println("La pila contiene la siguientes cantidad elementos: " + pila.size());
                    break;
                case 5:
                    while (!pila.isEmpty()) {
                        pila.pop();
                    }
                    if (pila.isEmpty()) {
                        System.out.println("Esta vacia");
                    }
                    break;
                case 6:
                    System.out.println("Los elementos de las pilas son: "+pila);
                    break;
                case 7:
                    System.out.println("Gracias por utilizar el programa");
                    break;
                default:
                    System.out.println("Ingresa la opcion correcta");
            }
        } while (opcion != 7);
    }
}
