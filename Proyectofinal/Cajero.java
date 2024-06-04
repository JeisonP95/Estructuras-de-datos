package com.sanchezdarcypencuejesus.proyectofinal;


public class Cajero extends Empleados implements iTrabajable {
    

    public Cajero( String nombre, int id, float valorHora, int numTelefono) {
        super(nombre, id, valorHora, numTelefono);
    }
    
    @Override
    float salario() {
        
        return getValorHora()*180;
    }
    @Override
    public String ejecutarTrabajo(){
        return "El cajero realiza su trabajo";
    }

}
