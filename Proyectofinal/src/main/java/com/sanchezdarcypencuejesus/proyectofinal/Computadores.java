package com.sanchezdarcypencuejesus.proyectofinal;

public class Computadores extends Productos implements IAplicacion {
    public String tarjetaGrafica;

    public Computadores(String tarjetaGrafica, String nombre, double precio, String codigo, int almacenamiento, int ram, String color) {
        super(nombre, precio, codigo, almacenamiento, ram, color);
        this.tarjetaGrafica = tarjetaGrafica;
    }
    
    @Override
    public String realizarVenta(){
        return "realizar venta computador";
    }
    @Override
    public String abrirApp() {
        return "Abre gmail";
    }

    @Override
    public String actualizarApp() {
        return "Actualiza gmail";
    }

    @Override
    public String EliminarApp() {
        return "Elimina gmail";
    }
}