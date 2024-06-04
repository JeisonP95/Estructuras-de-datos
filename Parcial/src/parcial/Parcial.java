package parcial;

import java.util.Scanner;

public class Parcial {

    public static void main(String[] args) {

        Scanner ingreso = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("------menu-----");
            System.out.println("1.pregunta1");
            System.out.println("2.pregunta2");
            System.out.println("3.pregunta3");
            System.out.println("4.pregunta4");
            System.out.println("5.salir");

            System.out.println("Ingrese la opcion");
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
                    int[][] matriz2 = new int[n][n];
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (j < i) {
                                matriz2[i][j] = 1;
                            } else {
                                matriz2[i][j] = j - i + 1;
                            }
                        }
                    }
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print(matriz2[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("gracias por utilizar el servicio");
                    break;
                default:
                    System.out.println("ingresa la opcion correcta");  
            }
        } while (opcion != 5);
        }
    
    }
//int menu = 0;

        do {
            System.out.println("-----------MENU-----------------");
            System.out.println("1. Insertar");
            System.out.println("2. Mostrar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");

            System.out.println("Ingresa el valor deseado:");
            menu = scan.nextInt();

            switch (menu) {
                case 1:
                    añadirElementos(lista1);
                    break;
                case 2:
                    System.out.println("Computadores registrados:");
                    lista1.mostrarComputadores();
                    break;
                case 3:
                    System.out.println("Buscar por indice");
                    mostrarPorIndice(lista1);
                    break;
                case 4:
                    eliminarPorIndice(lista1);
                    break;
                case 5:
                    System.out.println("Gracias por utilizar el sistema");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (menu != 5);
    }

    public static void añadirElementos(ListaComputadores lista) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Para salir debes ingresar la palabra: SALIR");

        System.out.println("Ingrese el serial");
        String serial = leer.nextLine();

        System.out.println("Ingrese la marca");
        String marca = leer.nextLine();

        System.out.println("Ingrese la capacidadAlmacenamiento");
        int capacidadAlmacenamiento = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese el capacidadRAM");
        int capacidadRAM = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese el procesador");
        String procesador = leer.nextLine();

        Computador computadora = new Computador(serial, marca, capacidadAlmacenamiento, capacidadRAM, procesador);
        lista.insertarComputador(computadora);
    }

    public static void mostrarPorIndice(ListaComputadores lista) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa el serial: ");
        String serialABuscar = leer.nextLine();

        if (lista.buscarComputador(serialABuscar)) {
            System.out.println("El computador con serial " + serialABuscar + " está registrado.");
        } else {
            System.out.println("El computador con serial " + serialABuscar + " no está registrado.");
        }
    }

    public static void eliminarPorIndice(ListaComputadores lista) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa el indice: ");
        int indice = leer.nextInt();

        lista.eliminar(indice);
        System.out.println("se elimino Correctamente!");

        System.out.println("Todos los productos de nuevo:");
        lista.mostrarComputadores();
    }
}
//
do {
            System.out.println("Menú:");
            System.out.println("1. Insertar");
            System.out.println("2. Mostrar");
            System.out.println("3. Buscar");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    // Aquí puedes solicitar los datos del computador y llamar a insertarComputador()
                    break;
                case 2:
                    lista1.mostrarComputadores();
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del computador a buscar: ");
                    String nombre = scanner.next();
                    Nodo resultado = lista1.buscarComputador(nombre);
                    if (resultado != null) {
                        System.out.println("Computador encontrado: " + resultado.getComputador());
                    } else {
                        System.out.println("Computador no encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);