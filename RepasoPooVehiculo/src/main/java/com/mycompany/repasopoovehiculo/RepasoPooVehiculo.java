package com.mycompany.repasopoovehiculo;

import java.util.Scanner;

public class RepasoPooVehiculo {

    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo("pyk051", "chevrolet", 2400, "campero", 2012);

        Scanner ingreso = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("-----MENU-----------");
            System.out.println("1.Mostrar el vehiculo");
            System.out.println("2.Encender");
            System.out.println("3.Marcha");
            System.out.println("4.Frenar");
            System.out.println("5.Salir");

            System.out.println("Ingrese la opcion a escoger");
            opcion = ingreso.nextInt();

            switch (opcion) {
                case 1:
                    vehiculo1.mostrarVehiculo();
                    break;
                case 2:
                    vehiculo1.encender();
                    break;
                case 3:
                    vehiculo1.marcha();
                    break;
                case 4:
                    vehiculo1.frenar();
                    break;
                case 5:
                    System.out.println("Gracias por ingresar");
                    break;
                default:
                    throw new AssertionError();
            }

        } while (opcion != 5);

    }
}
