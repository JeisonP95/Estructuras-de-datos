
package ejercicio4;


public class Ejercicio4 {

    public static void main(String[] args) {
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
    }
    
}
