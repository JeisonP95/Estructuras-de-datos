package repasoarraylist;

import java.util.ArrayList;

public class RepasoArrayList {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Juan");
        lista.add("Jose");
        lista.add("David");
        lista.add("Esteban");
        // forma manual
        System.out.println("ompresion del arraylist");
        System.out.println("elemento   " + lista.get(0));
        System.out.println("elemento   " + lista.get(1));
        System.out.println("elemento   " + lista.get(2));
        System.out.println("elemento   " + lista.get(3));
        //con indice
        System.out.println("impresion con interacion");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("posicion" + i + "  " + lista.get(i));
        }
        System.out.println("impresion con for each");
        for (String i : lista) {
            System.out.println(i);
        }
        System.out.println("impresion con  tamaño");
        System.out.println("Cantidad: " + lista.size());

        System.out.println("impresion con for each eliminar");
        lista.remove(1);
        for (String i : lista) {
            System.out.println("Elemento: " + i);
        }

        boolean band = false;
        for (String i : lista) {
            if ("Carlos" == i) {
                band = true;
            } else {
                band = false;
            }
        }
        if (band == true) {
            System.out.println("El elemento Carlos se encuentra en la lista");
        } else {
            System.out.println("El elemento Carlos NO se encuentra en la lista");
        }
    }

}
