/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

/**
 *
 * @author VivoBook
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma = 0;
        int[][] matriz = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                matriz[i][j] = (int) (Math.random() * 9);
                suma = suma + matriz[i][j];
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println("  =  " + suma);
        }

        System.out.println();
    }
    /*
    //Ejemplo de acumuladores
    public static void funcioncita() {
        int vector[] = {1, 2, 3};
        int suma = 0;

        for (int i = 0; i < vector.length; i++) {
            suma = suma + vector[i];
        }
        
        System.out.println("la suma es -> " + suma);
    }*/

}
