package com.sanchezdarcypencuejesus.proyectofinal;

public class Celulares extends Productos implements  IAplicacion {
    public int sim; 

    public Celulares(int sim, String nombre, double precio, String codigo, int almacenamiento, int ram, String color) {
        super(nombre, precio, codigo, almacenamiento, ram, color);
        this.sim = sim;
        
       
    }
    @Override
    public String realizarVenta(){  
        return "realizar venta celular";
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

   
