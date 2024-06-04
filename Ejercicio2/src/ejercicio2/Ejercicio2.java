
package ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {
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
    }
    
}
