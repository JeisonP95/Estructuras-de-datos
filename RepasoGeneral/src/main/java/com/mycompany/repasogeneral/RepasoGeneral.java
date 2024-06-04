package com.mycompany.repasogeneral;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class RepasoGeneral {

    public static void main(String[] args) {
        int n1, n2, suma, resta, multiplicacion;
        float division;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("MENU DE OPERACIONES");
        System.out.println("1: SUMAR");
        System.out.println("2: RESTA");
        System.out.println("3: MULTIPLICAR");
        System.out.println("4: DIVIDIR");
        System.out.println("Ingrese la opcion disponible");

        
        int rta = entrada.nextInt();
        System.out.println("Ingrese el primero: ");
        n1 = entrada.nextInt();
        System.out.println("ingrese el segundo numero: ");
        n2 = entrada.nextInt();
        switch (rta) {
            case 1:
                suma = n1 + n2;
                System.out.println("la suma es:  " + suma);
                break;
            case 2:
                resta = n1 - n2;
                System.out.println("la resta es:  " + resta);
                break;
            case 3:
                multiplicacion = n1 * n2;
                System.out.println("la multiplicacion es:  " + multiplicacion);
                break;
            case 4:
                division = n1 + n2;
                System.out.println("la division es:  " + division);
                break;
        }

        /*int n1, n2, suma;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:  ");
        n1= entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        n2=entrada.nextInt();
        System.out.println("la suma es:");*/
 /*int n1, n2, suma;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero:"));
        suma = n1 + n2;
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma);*/
    }
}
