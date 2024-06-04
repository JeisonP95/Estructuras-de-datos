package com.mycompany.opecionesaritmeticas;

import java.util.Scanner;

public class OpecionesAritmeticas {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        double numero1, numero2, resultado;
        String operador;
        //Aqui el usuario ingresara un numero
        System.out.println("Ingrese el primer numero:  ");
        numero1 = ingreso.nextDouble();
        //Aqui el usuario ingresara la operacion a realizar
        System.out.println("Ingrese la operacion que desea realizar(+, -, *, /): ");
        operador = ingreso.next();
        //Aqui el usuario ingresara otro numero
        System.out.println("ingrese el segundo numero:  ");
        numero2 = ingreso.nextDouble();

        switch (operador) {
            case "+":
                resultado = numero1 + numero2;
                System.out.println("La suma es:  " + resultado);
                break;
            case "-":
                resultado = numero1 - numero2;
                System.out.println("La resta es: " + resultado);
                break;
            case "*":
                resultado = numero1 * numero2;
                System.out.println("La multiplicación es: " + resultado);
                break;
            case "/":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("La división es: " + resultado);
                } else {
                    System.out.println("Error: división por cero.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
        }
    }
}
