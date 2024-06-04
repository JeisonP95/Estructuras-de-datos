package com.mycompany.repasopoovehiculo;

public class Vehiculo {

    String placa;
    String marca;
    int cilindraje;
    String linea;
    int modelo;

    //metodo constructor
    public Vehiculo(String placa, String marca, int cilindraje, String linea, int modelo) {
        this.placa = placa;
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.linea = linea;
        this.modelo = modelo;
    }
            
    
    public void mostrarVehiculo() {
        System.out.println("La placa es: " + placa);
        System.out.println("La marca es: " + marca);
        System.out.println("El cilindraje es: " + cilindraje);
        System.out.println("la linea es: " + linea);
        System.out.println("El modelo es: " + modelo);
    }

    public void encender(){
        System.out.println("El vehiculo esta encendido");
    }
    
    public void marcha(){
        System.out.println("El vehiculo esta circulando");
    }
    
    public void frenar(){
        System.out.println("El vehiculo acaba de frenar");
    }
}
