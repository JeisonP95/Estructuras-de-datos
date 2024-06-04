package tallermatrices;

import java.util.Scanner;

public class TallerMatrices {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("-----MENU----");
            System.out.println("1.Ejercicio1");
            System.out.println("2.Ejercicio2");
            System.out.println("3.Ejercicio3");
            System.out.println("4.Ejercicio propio");
            System.out.println("5.Salir");

            System.out.println("ingresa la opcion");
            opcion = ingreso.nextInt();

            switch (opcion) {
                case 1:
                    int n = 9;
                    int[][] matriz = new int[n][n];
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (j < i) {
                                matriz[i][j] = 1;
                            } else {
                                matriz[i][j] = j - i + 1;
                            }
                        }
                    }
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print(matriz[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    Scanner scanner = new Scanner(System.in);

                    System.out.println("Ingrese el tamaño de la matriz cuadrada:");
                    int num = scanner.nextInt();

                    int[][] matrizdos = new int[num][num];

                    System.out.println("Ingrese los elementos de la matriz:");
                    for (int i = 0; i < num; i++) {
                        for (int j = 0; j < num; j++) {
                            matrizdos[i][j] = scanner.nextInt();
                        }
                    }

                    int sumaDiagonalPrincipal = 0;
                    for (int i = 0; i < num; i++) {
                        sumaDiagonalPrincipal += matrizdos[i][i];
                    }

                    int sumaDiagonalSecundaria = 0;
                    for (int i = 0; i < num; i++) {
                        sumaDiagonalSecundaria += matrizdos[i][num - 1 - i];
                    }

                    System.out.println("La suma de la diagonal principal es: " + sumaDiagonalPrincipal);
                    System.out.println("La suma de la diagonal secundaria es: " + sumaDiagonalSecundaria);
                    break;
                case 3:
                    int[] arreglo = {5, 10, 3, 8, 15, 2};

                    if (arreglo.length == 0) {
                        System.out.println("El arreglo está vacío.");
                        return;
                    }

                    int mayor = arreglo[0];
                    int menor = arreglo[0];
                    int posicionMayor = 0;
                    int posicionMenor = 0;

                    for (int i = 1; i < arreglo.length; i++) {
                        if (arreglo[i] > mayor) {
                            mayor = arreglo[i];
                            posicionMayor = i;
                        } else if (arreglo[i] < menor) {
                            menor = arreglo[i];
                            posicionMenor = i;
                        }
                    }

                    System.out.println("El numero mayor es " + mayor + " y se encuentra en la posicion " + posicionMayor);
                    System.out.println("El numero menor es " + menor + " y se encuentra en la posicion " + posicionMenor);
                    break;
                case 4:
                    Scanner scannerdos = new Scanner(System.in);

                    System.out.println("Ingrese el tamaño del arreglo:");
                    int number = scannerdos.nextInt();

                    int[] arreglodos = new int[number];

                    System.out.println("Ingrese los elementos del arreglo:");
                    for (int i = 0; i < number; i++) {
                        arreglodos[i] = scannerdos.nextInt();
                    }

                    encontrarMayorMenor(arreglodos);
                    break;
                case 5:
                    System.out.println("Gracias por utilizar el servicio");
                    break;
                default:
                    System.out.println("Seleciona la opcion correcta");
            }
        } while (opcion != 5);
    }

    public static void encontrarMayorMenor(int[] arreglo) {
        if (arreglo.length == 0) {
            System.out.println("El arreglo está vacío.");
            return;
        }

        int mayor = arreglo[0];
        int menor = arreglo[0];
        int posicionMayor = 0;
        int posicionMenor = 0;

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
                posicionMayor = i;
            } else if (arreglo[i] < menor) {
                menor = arreglo[i];
                posicionMenor = i;
            }
        }

        System.out.println("El número mayor es " + mayor + " y se encuentra en la posición " + posicionMayor);
        System.out.println("El número menor es " + menor + " y se encuentra en la posición " + posicionMenor);
    }
}
