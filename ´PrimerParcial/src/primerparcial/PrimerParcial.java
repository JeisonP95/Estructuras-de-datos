package primerparcial;

import java.util.Scanner;

public class PrimerParcial {


    public static void main(String[] args) {

        Scanner ingreso = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("------Menu-----");
            System.out.println("1. Pregunta 1");
            System.out.println("2. Pregunta 2");
            System.out.println("3. Pregunta 3");
            System.out.println("3. Pregunta 4");
            System.out.println("4. Salir");

            System.out.println("Ingrese la opción:");
            opcion = ingreso.nextInt();

            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    int[][] matriz = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                    };
                    System.out.println("                     ");
                    System.out.println("Matriz normal");
                    System.out.print(matriz[0][0] + " ");
                    System.out.print(matriz[0][1] + " ");
                    System.out.println(matriz[0][2] + " ");
                    //Fila 1 a colunma
                    System.out.print(matriz[1][0] + " ");
                    System.out.print(matriz[1][1] + " ");
                    System.out.println(matriz[1][2] + " ");
                    //Fila 1 a colunma
                    System.out.print(matriz[2][0] + " ");
                    System.out.print(matriz[2][1] + " ");
                    System.out.print(matriz[2][2] + " ");
                    System.out.println();
                    System.out.println("Matriz Invertida");
                    matriz[0][0] = 1;
                    matriz[0][1] = 4;
                    matriz[0][2] = 7;
                    matriz[1][0] = 2;
                    matriz[1][1] = 5;
                    matriz[1][2] = 8;
                    matriz[2][0] = 3;
                    matriz[2][1] = 6;
                    matriz[2][2] = 9;
                    System.out.print(matriz[0][0] + " ");
                    System.out.print(matriz[0][1] + " ");
                    System.out.println(matriz[0][2] + " ");
                    //Fila 1 a colunma
                    System.out.print(matriz[1][0] + " ");
                    System.out.print(matriz[1][1] + " ");
                    System.out.println(matriz[1][2] + " ");
                    //Fila 1 a colunma
                    System.out.print(matriz[2][0] + " ");
                    System.out.print(matriz[2][1] + " ");
                    System.out.println(matriz[2][2] + " ");
                    break;
                case 3:
                    
                    break;
                case 4:
                    int n = 9;
                    int[][] matriz1 = new int[n][n]; 
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (j < i) {
                                matriz1[i][j] = 1;
                            } else {
                                matriz1[i][j] = j - i + 1;
                            }
                        }
                    }
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print(matriz1[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 5);
    }
}


