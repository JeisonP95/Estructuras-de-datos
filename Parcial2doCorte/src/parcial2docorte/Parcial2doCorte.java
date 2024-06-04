package parcial2docorte;

import java.util.Scanner;

public class Parcial2doCorte {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("----------Parcial--------");
            System.out.println("1.Stock computadores");
            System.out.println("2.Salir");

            System.out.println("Ingresa la opcion que desee");
            opcion = ingreso.nextInt();
            ingreso.nextLine();

            switch (opcion) {
                case 1:
                    
                case 2:
                    System.out.println("---GRACIAS---");
                    break;
                default:
                    System.out.println("--INGRESA LA OPCION CORRECTA--");
            }

        } while (opcion != 2);

    }

}
