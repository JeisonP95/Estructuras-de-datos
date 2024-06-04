package division;

import java.util.Scanner;

public class Excepciones {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. division");
            System.out.println("2. Pedir un numero");
            System.out.println("3. Salir");

            System.out.println("Ingresa la opcion");
            opcion = ingreso.nextInt();
            ingreso.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresar primer numero");
                    int numero1 = ingreso.nextInt();
                    System.out.println("Ingresa el segundo numero");
                    int numero2 = ingreso.nextInt();
                    //Excepcion
                    try {
                        double division = numero1 / numero2;
                        System.out.println("resultado: " + division);
                    } catch (ArithmeticException e) {
                        System.out.println(" Ten en cuenta que la division entre 0 no existe ");
                    }
                    break;
                case 2:
                    System.out.println("ingresa el numero");
                    try {
                        String num = ingreso.nextLine();
                        int num1 = Integer.parseInt(num);
                        System.out.println("El numero ingresado es: " + num);
                        
                    } catch (NumberFormatException e) {
                        System.out.println("Ingresa un hp numero");
                    }

                    break;
                case 3:
                    System.out.println("Gracias por utilizar el servicio");
                    break;
                default:
                    throw new AssertionError();
            }

        } while (opcion != 3);

    }

}
