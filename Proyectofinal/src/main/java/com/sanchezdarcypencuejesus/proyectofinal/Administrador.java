/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanchezdarcypencuejesus.proyectofinal;


public class Administrador extends Empleados implements iTrabajable{
    public Administrador( String nombre, int id, float valorHora, int numTelefono) {
        super(nombre, id, valorHora, numTelefono);
       
    }

    @Override
    float salario() {
        return getValorHora()*203;
    }

    @Override
    public String ejecutarTrabajo() {
        return "El Administrador supervisa la emplresa";
    }
   
}
    
    Scanner scanner = new Scanner(System.in);
        int productosEjecutados = 0;
        
        while (productosEjecutados < 2) {
            System.out.println("--- Menú de Productos ---");
            System.out.println("1.Celulares");
            System.out.println("2.Computadores");
            System.out.println("3.Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Celulares");
                    Celulares Iphone11 = new Celulares("Iphone11", "azul", 64, 4, 34999, "100092");
                    Celulares Iphone12 = new Celulares("Iphone12", "negro", 64, 4, 34999, "100092");
                    Celulares Iphone13 = new Celulares("Iphone13", "rojo", 64, 4, 34999, "100092");
                    Celulares Iphone14 = new Celulares("Iphone14", "blanco", 64, 4, 34999, "100092");

                    Iphone11.setColor("dorado");
                    System.out.println(Iphone11);
            }
        }
    }

