package apliarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ApliArrayList {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        //Ingresar numeros 
        System.out.println("Ingrese los numeros que desee");
        int numero = 0;

        while (numero != -99) {
            numero = ingreso.nextInt();

            if (numero != -99) {
                numeros.add(numero);
            }
        }

        //Cantidad
        int cantNum = numeros.size();
        System.out.println("cantidad  " + cantNum);

        //Sumatoria
        int suma = 0;
        for (Integer numeross : numeros) {
            suma += numeross;            
        }
        System.out.println("Sumatoria: "+suma);
        
        //promedio
        float promedio = (float) suma / cantNum;
        System.out.println("Promedio: "+promedio);
    }

}
