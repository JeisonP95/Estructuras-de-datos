
package llenadomatrices;

import java.util.Scanner;


public class OperacionesMatrices {
    int[][]numeros = new int [5][3];
    public void llenadoMatriz(){
        Scanner ingreso = new Scanner (System.in);
        for (int i = 0; i < 5; i++) {
               for (int j = 0; j < 3; j++) {
                   System.out.println(" Ingrese valor: ");
                   numeros[i][j]=ingreso.nextInt();                                  
            }            
        }    
    }
    
    public void mostrar(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numeros[i][j]+  " \t");
                
            }
            System.out.println(" ");
        }
        
    }
 }
    

