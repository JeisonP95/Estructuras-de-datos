package arrayinicializacion;

public class ArrayInicializacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] numeros = new int[5];
        int[] encontrados = new int[5];
        numeros[0] = 8;
        numeros[1] = 6;
        numeros[2] = 10;
        numeros[3] = 2;
        numeros[4] = 4;

        for (int i = 0; i < encontrados.length; i++) {
            System.out.println("Valores " + numeros[i]);
        }
    }
}