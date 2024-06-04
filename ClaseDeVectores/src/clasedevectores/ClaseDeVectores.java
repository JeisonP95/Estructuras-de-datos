/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasedevectores;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Usuario
 */
public class ClaseDeVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*esta es la estructura de como crear una arrays
        (establecemos su espacio con 20 si se pasa añade 5 espacios mas )*/
        Scanner entrada= new Scanner (System.in);
        //Vector nombreVector= new Vector(20,5);
        //ArrayList<Integer> numeros = new ArrayList<>();
        //int [] numeross = new int [5];
        int numeros[]={1,2,2,3,6,7};
        
        for (int i = 0; i < 6; i++) {
            System.out.println("estos son los elementos del vector");  
        }
        //Otro metodo por funciones
        Vector<Integer>vector= new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        // acceder al vector para mostrar con el metodo .get
        System.out.println("Elemento de la pocision 0 es :"+vector.get(0));
        System.out.println("Elemento de la pocision 1 es :"+vector.get(1));
        System.out.println("Elemento de la pocision 2 es :"+vector.get(2));
        //Modificar los vectores mediante elm metodo .set
        vector.set(0,25);
        vector.set(1,34);
        vector.set(2,74);
        System.out.println("Elemento de la pocision 0 nueva es :"+vector.get(0));
        System.out.println("Elemento de la pocision 1 nueva es :"+ vector.get(1));
        System.out.println("Elemento de la pocision 2 nueva es :"+ vector.get(2));
        // remover o eliminar mediante el metodo .remove
        // para ver el tamaño del vector utilizamos el metodo .size
        System.out.println("El vector tiene un tamaño: "+ vector.size());
        vector.remove(2);
        System.out.println("El vector tiene un tamaño: "+ vector.size());
        System.out.println("-----------------------------");
        System.out.println("Ingrese el numero de espacios que desea agregar: ");
        int cant=entrada.nextInt();
        
        for (int i = 0; i < cant; i++) {
            System.out.println("ingrese su "+i+" numero: ");
            int num=entrada.nextInt();
            vector.add(num);
        }
        for (int i = 0; i < vector.size(); i++) {
            System.out.println("Estos son los numeros de su vector: " + vector.get(i));
        }
    }
    
}
