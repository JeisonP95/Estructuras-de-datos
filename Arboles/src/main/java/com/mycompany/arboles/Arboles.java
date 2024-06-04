package com.mycompany.arboles;

import javax.swing.JOptionPane;

public class Arboles {


    public static void main(String[] args) {
        int opcion=0, elemento;
        String nombre;
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un Nodo\n"
                         + "2. Salir\n"
                         + "Elige una opción...","Arboles Binarios"
                        ,JOptionPane.QUESTION_MESSAGE));
                switch(opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "Ingrese el Número del Nodo...","Agregando Nodo"
                        ,JOptionPane.QUESTION_MESSAGE));
                        nombre = JOptionPane.showInputDialog(null, 
                                "Ingrese el Nombre del Nodo...","Agregando Nodo"
                                ,JOptionPane.QUESTION_MESSAGE);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Aplicación Finalizada",
                        "Fin",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción Incorrecta",
                        "Cuidado",JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error"+n.getMessage());
            }
        }while(opcion!=2);
    }
    
}
