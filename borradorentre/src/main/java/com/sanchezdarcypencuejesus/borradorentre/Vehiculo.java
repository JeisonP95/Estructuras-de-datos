/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sanchezdarcypencuejesus.borradorentre;

/**
 *
 * @author VivoBook
 */
class Vehiculo {

    protected String marca;
    protected String modelo;
    protected String color;
    protected int velocidadMaxima;
    protected int velocidadActual;

    public Vehiculo(String marca, String modelo, String color, int velocidadMaxima, int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = velocidadActual;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void acelerar() {
        velocidadActual += 20;
        if (velocidadActual > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
        }
    }

    public void frenar() {
        velocidadActual -= 10;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
    }

        @Override
        public String toString() {
            return "Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color
                    + ", Velocidad Máxima: " + velocidadMaxima + " km/h, Velocidad Actual: " + velocidadActual + " km/h";
    }
}

class Auto extends Vehiculo {

    protected int numPuertas;
    protected String tipoCombustible;

    public Auto(String marca, String modelo, String color, int velocidadMaxima, int velocidadActual, int numPuertas, String tipoCombustible) {
        super(marca, modelo, color, velocidadMaxima, velocidadActual);
        this.numPuertas = numPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    @Override
    public void acelerar() {
        velocidadActual += 30;
        if (velocidadActual > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
        }
    }

    @Override
    public void frenar() {
        velocidadActual -= 20;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de Puertas: " + numPuertas + ", Tipo de Combustible: " + tipoCombustible;
    }
}

class Deportivo extends Auto {

    protected int potenciaMotor;

    public Deportivo(String marca, String modelo, String color, int velocidadMaxima, int velocidadActual, int numPuertas, String tipoCombustible, int potenciaMotor) {
        super(marca, modelo, color, velocidadMaxima, velocidadActual, numPuertas, tipoCombustible);
        this.potenciaMotor = potenciaMotor;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    @Override
    public void acelerar() {
        // Incrementar la velocidad actual del deportivo en una cantidad específica (por ejemplo, 50 km/h).
        velocidadActual += 50;
        if (velocidadActual > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
        }
    }

    @Override
    public void frenar() {
        // Reducir la velocidad actual del deportivo en una cantidad específica (por ejemplo, 30 km/h).
        velocidadActual -= 30;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Potencia del Motor: " + potenciaMotor + " HP";
    }
}

public class Main {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Ford", "Focus", "Rojo", 200, 60);
        Auto auto = new Auto("Toyota", "Corolla", "Azul", 220, 80, 4, "Gasolina");
        Deportivo deportivo = new Deportivo("Ferrari", "488 GTB", "Amarillo", 330, 120, 2, "Gasolina Premium", 600);

        // Acelerar y frenar los vehículos
        vehiculo.acelerar();
        auto.acelerar();
        deportivo.acelerar();
        deportivo.frenar();

        // Imprimir información de los vehículos
        System.out.println("Información del Vehículo:");
        System.out.println(vehiculo.toString());

        System.out.println("Información del Auto:");
        System.out.println(auto.toString());

        System.out.println("Información del Deportivo:");
        System.out.println(deportivo.toString());

        Vehiculo[] vehiculos = {vehiculo, auto, deportivo};

        imprimirInformacionVehiculos(vehiculos);
        double velocidadPromedio = calcularVelocidadPromedio(vehiculos);
        System.out.println("Velocidad promedio de los vehículos: " + velocidadPromedio + " km/h");
    }

    public static void imprimirInformacionVehiculos(Vehiculo[] vehiculos) {
        System.out.println("Información de los Vehículos en el Arreglo:");
        for (Vehiculo v : vehiculos) {
            System.out.println(v.toString());
        }
    }

    public static double calcularVelocidadPromedio(Vehiculo[] vehiculos) {
        int totalVelocidad = 0;
        for (Vehiculo v : vehiculos) {
            totalVelocidad += v.getVelocidadActual();
        }
        return (double) totalVelocidad / vehiculos.length;
    }
}

public abstract class ClaseAbstracta {
    // Puedes tener campos (ATRIBUTOS) en una clase abstracta
    protected int campoEjemplo;

    // También puedes tener métodos concretos (con implementación) en una clase abstracta
    public void metodoConcreto() {
        System.out.println("Este es un método concreto.");
    }

    // Declara métodos abstractos utilizando la palabra clave abstract
    public abstract void metodoAbstracto();
}
public class ClaseConcreta extends ClaseAbstracta {
    @Override
    public void metodoAbstracto() {
        System.out.println("Implementación del método abstracto en ClaseConcreta.");
    }
}
