/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasevector;

import java.util.Vector;

public class ClaseVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crear un nuevo vector
        
       Vector<Integer> vector = new Vector <>();
       //Agregar elementos al vector
       vector.add(10);
       vector.add(20);
       vector.add(30);
       //Acceder a los elementos del vector
        System.out.println("Elemento de la posicion 0:  "+vector.get(0));
        System.out.println("Elemento de la posicion 1:  "+vector.get(1));
        System.out.println("Elemento de la posicion 2:  "+vector.get(2));              
       //Modificar un elemento del vector 
       vector.set(1, 25);
       vector.set(0, 15);
       vector.set(2, 30);
       
       
        System.out.println("Nuevo elemento de la posicion 0:  "+vector.get(0));
        System.out.println("Nuevo elemento de la posicion 1:  "+vector.get(1));
        System.out.println("Nuevo elemento de la posicion 2:  "+vector.get(2));
        
        //verificar tamaño del vector
        
        System.out.println("El tamano del vector es:  "+vector.size());
        
        //Eliminar un elemento del vector
        
        vector.remove(0);
        System.out.println("El tamano del vector es:  "+vector.size());
        

        int[] numeros = new int[10];
        int[] mostrar = new int[10];
        vector.add(40);
        vector.add(50);
        vector.add(60);
        vector.add(70);
        vector.add(80);
        vector.add(90);
        vector.add(100);
        vector.add(110);
        for (int i = 0; i < mostrar.length; i++) {
            System.out.println("Elementos: "+numeros);
            
        }       
        
    }
    
}
//crear un nuevo project(Academico)metodo main, a traves de un vector crear con objetos (estudiante)datos(codigo(int))nombre apellido semestre y programa string nivel de encapsulamiento(private)metodo constructor  
//get y set 