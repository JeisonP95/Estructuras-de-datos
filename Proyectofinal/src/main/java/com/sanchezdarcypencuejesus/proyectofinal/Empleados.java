/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanchezdarcypencuejesus.proyectofinal;

/**
 *
 * @author Usuario
 */
public abstract class Empleados {
    private String nombre;
    private int id;
    private float valorHora;
    private int numTelefono;
    
    public Empleados(String nombre, int id, float valorHora, int numTelefono ) {
        this.nombre = nombre;
        this.id = id;
        this.valorHora = valorHora;
        this.numTelefono = numTelefono;
    }
    public String getNombre() {
        return nombre;
    }
    public int getId() {
        return id;
    }
    public int getNumTelefono() {
        return numTelefono;
    }
    public float getValorHora() {
        return valorHora;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }
    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    } 
    abstract float salario();
}
