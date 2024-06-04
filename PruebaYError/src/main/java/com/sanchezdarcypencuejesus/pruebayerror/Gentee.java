
package com.sanchezdarcypencuejesus.pruebayerror;


import java.util.Scanner;

public class Gentee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos por teclado
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese sexo (H para hombre, M para mujer): ");
        char sexo = scanner.next().charAt(0);
        System.out.print("Ingrese peso (en kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Ingrese altura (en metros): ");
        double altura = scanner.nextDouble();

        // Crear objetos de Persona
        Gentee persona1 = new Gentee(nombre, edad, sexo);
        Gentee persona2 = new Gentee(nombre, edad, "12345X", sexo, peso, altura);
        Gentee persona3 = new Gentee();

        // Comprobar el IMC y si es mayor de edad para cada objeto
        int imc1 = persona1.calcularIMC();
        int imc2 = persona2.calcularIMC();
        int imc3 = persona3.calcularIMC();

        System.out.println(" Resultados: ");

        System.out.println("Persona 1:");
        System.out.println("IMC: " + (imc1 == -1 ? "Por debajo del peso ideal" : (imc1 == 0 ? "Peso ideal" : "Sobrepeso")));
        System.out.println("Es mayor de edad: " + persona1.esMayorDeEdad());
        System.out.println(persona1);

        System.out.println(" Persona 2:");
        System.out.println("IMC: " + (imc2 == -1 ? "Por debajo del peso ideal" : (imc2 == 0 ? "Peso ideal" : "Sobrepeso")));
        System.out.println("Es mayor de edad: " + persona2.esMayorDeEdad());
        System.out.println(persona2);

        System.out.println(" Persona 3:");
        System.out.println("IMC: " + (imc3 == -1 ? "Por debajo del peso ideal" : (imc3 == 0 ? "Peso ideal" : "Sobrepeso")));
        System.out.println("Es mayor de edad: " + persona3.esMayorDeEdad());
        System.out.println(persona3);

        scanner.close();
    }
}


    }
}


