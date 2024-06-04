package com.mycompany.tallerdeestructurascondicionales;


import java.util.Scanner;

public class TallerDeEstructurasCondicionales {

    public static void main(String[] args) {
        //1.TIENDA
        String nombre;
        int edad;
        double totalCompra, totalPagar, descuento;
        //2.ALMACEN
        int cantidadLlantas;
        double precioPorUnidad, precioTotal;
        //3.LEER DOS NUMEROS
        double numero1, numero2, multiplicacion, resta;
        //4.JOVEN O VIEJO
        String nombree;
        int edadd;
        //5.ALTO O CHAPARRO
        String nombreUsuario;
        double estatura;
        //6.CONTRASEÑA
        String contraseña;
        //7.LEER DOS NUMEROS
        double numeroo1, numeroo2, resultado;
        //8.ALGORITMO DE CAMISAS
        double totalCompraDeCamisas, valorCamisa, cantidadDeCamisas, valorTotal, descuentos;
        int numeroDocumento;
        String nombreee;
        //9.SUPERMERCADO
        double azar, aleatorio, valorCompra, elDescuento, valorTOtall;
        //TIENDA DE DESCUENTO
        String fechaDeCompra, ciudad, nombreCliente, colorBola;
        double descBlanco, descVerde, descAmarillo, descAzul, descRojo, valCompra, valDescuento, valFinal;
        //11.FABRICA DE COMPUTADORES
        double descuentoo, cantidaad, valoor, vCompu;

        Scanner ingreso = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("------MENU------");
            System.out.println("1.Ejercicio Tienda");
            System.out.println("2.Ejercicio Almacen de llantas");
            System.out.println("3.Ejercicio Leer dos numeros");
            System.out.println("4.Ejercicio Joven o viejo");
            System.out.println("5.Ejercicio Alto o chaparro");
            System.out.println("6.Ejercicio Contraseña");
            System.out.println("7.Ejercicio Leer dos numeros");
            System.out.println("8.Ejercicio Algoritmo de camisas");
            System.out.println("9.Ejercicio Supermercado");
            System.out.println("10.Ejercicio Tienda de descuento");
            System.out.println("11.Ejercicio Fabricas de computadores");
            System.out.println("12.Ejercicio de clase");
            System.out.println("13.Salir");

            System.out.println("Ingrese la opcion a escoger");
            opcion = ingreso.nextInt();
            ingreso.nextLine();

            switch (opcion) {
                case 1:

                    System.out.println("Ingrese su nombre:");
                    nombre = ingreso.nextLine();

                    System.out.println("Ingrese su edad:");
                    edad = ingreso.nextInt();

                    System.out.println("Ingrese el total de la compra:");
                    totalCompra = ingreso.nextDouble();

                    descuento = 0;
                    if (edad > 70) {
                        descuento = totalCompra * 0.30;
                    }

                    totalPagar = totalCompra - descuento;

                    System.out.println("----Resumen de la compra----");
                    System.out.println("Nombre del cliente: " + nombre);
                    System.out.println("Total de la compra: " + totalCompra);
                    System.out.println("Descuento aplicado: " + descuento);
                    System.out.println("Total a pagar: " + totalPagar);

                    break;
                case 2:
                    System.out.println("Ingresar cantidad de llantas");
                    cantidadLlantas = ingreso.nextInt();

                    if (cantidadLlantas < 5) {
                        precioPorUnidad = 800000;
                    } else {
                        precioPorUnidad = 700000;
                    }
                    precioTotal = cantidadLlantas * precioPorUnidad;
                    System.out.println("Precio a pagar es: " + precioTotal);

                    break;
                case 3:
                    System.out.println("ingresar primer numero");
                    numero1 = ingreso.nextDouble();

                    System.out.println("ingresar segundo numero");
                    numero2 = ingreso.nextDouble();

                    if (numero1 == numero2) {
                        multiplicacion = numero1 * numero2;
                        System.out.println("Resultado multiplicacion: " + multiplicacion);
                    } else {
                        resta = numero1 - numero2;
                        System.out.println("Resultado resta: " + resta);
                    }
                    break;
                case 4:
                    System.out.println("Ingresar nombre");
                    nombree = ingreso.nextLine();
                    System.out.println("Ingresar edad");
                    edadd = ingreso.nextInt();
                    if (edadd < 45) {
                        System.out.println("Es joven " + nombree);

                    } else {
                        System.out.println("Es viejo " + nombree);
                    }
                    break;
                case 5:
                    System.out.println("Ingresar nombre del usuario");
                    nombreUsuario = ingreso.nextLine();
                    System.out.println("Ingresar estatura");
                    estatura = ingreso.nextDouble();
                    if (estatura < 1.65) {
                        System.out.println("Es chaparro " + nombreUsuario);

                    } else {
                        System.out.println("Es alto " + nombreUsuario);
                    }
                    break;
                case 6:
                    System.out.println("Ingresar contraseña");
                    contraseña = ingreso.nextLine();

                    if (contraseña.equals("solrac")) {
                        System.out.println("contraseña correcta");
                    } else {
                        System.out.println("contraseña incorrecta");
                    }

                    break;
                case 7:
                    System.out.println("Ingresar primer numero");
                    numeroo1 = ingreso.nextDouble();
                    System.out.println("Ingresar segundo numero");
                    numeroo2 = ingreso.nextDouble();

                    if (numeroo1 == numeroo2) {
                        resultado = numeroo1 * numeroo2;
                        System.out.println("El resultado de la multiplicacion es: " + resultado);
                    } else {
                        if (numeroo1 > numeroo2) {
                            resultado = numeroo1 - numeroo2;
                            System.out.println("El resultado de la resta es: " + resultado);
                        } else {
                            resultado = numeroo1 + numeroo2;
                        }
                    }

                    break;
                case 8:
                    System.out.println("ingresar nombre");
                    nombree = ingreso.nextLine();
                    System.out.println("Ingresar numero de documento");
                    numeroDocumento = ingreso.nextInt();
                    System.out.println("Ingresar cantidad de camisas");
                    cantidadDeCamisas = ingreso.nextInt();

                    valorCamisa = 10000;
                    valorTotal = cantidadDeCamisas * valorCamisa;
                    if (cantidadDeCamisas > 2) {
                        descuentos = valorTotal * 0.2;
                        totalCompraDeCamisas = valorTotal - descuentos;
                    } else {
                        descuentos = valorTotal * 0.1;
                        totalCompraDeCamisas = valorTotal - descuentos;
                    }
                    System.out.println("-------DATOS DEL CLIENTE------");
                    System.out.println("Nombre: " + nombree);
                    System.out.println("Documernto: " + numeroDocumento);
                    System.out.println("Valor por camisa: " + valorCamisa);
                    System.out.println("Total valor de la compra: " + totalCompraDeCamisas);
                    break;
                case 9:
                    System.out.println("Ingresar el numero 1 para participar");
                    azar = ingreso.nextInt();

                    aleatorio = (int) (Math.random() * 100);
                    System.out.println("Aleatorio: " + aleatorio);
                    System.out.println("Ingresar el valor de la compra");
                    valorCompra = ingreso.nextDouble();

                    if (aleatorio < 74) {
                        elDescuento = valorCompra * 0.15;
                        valorTOtall = valorCompra - elDescuento;
                        System.out.println("decuento del 15 da: " + valorTOtall);

                    } else {
                        elDescuento = valorCompra * 0.2;
                        valorTOtall = valorCompra - elDescuento;
                        System.out.println("descuento del 20 da : " + valorTOtall);
                    }
                    break;
                case 10:
                    System.out.println("Ingresar la fecha de compra");
                    fechaDeCompra = ingreso.nextLine();
                    System.out.println("Ingresar la ciudad");
                    ciudad = ingreso.nextLine();
                    System.out.println("Ingresar nombre");
                    nombreCliente = ingreso.nextLine();

                    descBlanco = 0;
                    descVerde = 0.1;
                    descAmarillo = 0.25;
                    descAzul = 0.5;
                    descRojo = 1.00;

                    System.out.println("Ingresar color de la bola(blanco,verde,amarillo,azul,rojo)");
                    colorBola = ingreso.nextLine();

                    double deescuento = 0;

                    switch (colorBola) {
                        case "blanco":
                            deescuento = descBlanco;
                            break;
                        case "verde":
                            deescuento = descVerde;
                            break;
                        case "amarillo":
                            deescuento = descAmarillo;
                            break;
                        case "azul":
                            deescuento = descAzul;
                            break;
                        case "rojo":
                            deescuento = descRojo;
                            break;
                        default:
                            System.out.println("Color bola no existe");
                    }
                    System.out.println("Ingresar el valor de la compra");
                    valCompra = ingreso.nextDouble();
                    valDescuento = valCompra * deescuento;
                    valFinal = valCompra - valDescuento;

                    System.out.println("---Informacion de compra----");
                    System.out.println("Fecha de compra: "+fechaDeCompra);
                    System.out.println("Ciudad: "+ciudad);
                    System.out.println("Nombre del cliente: "+nombreCliente);
                    System.out.println("Descuento aplicado: "+deescuento);
                    System.out.println("Total a pagar: "+valFinal);

                    break;

                case 11:
                    System.out.println("Ingrese cantidaad de computdoras que desea llevar");
                    cantidaad = ingreso.nextDouble();
                    vCompu = 1200000;
                    if (cantidaad < 5) {
                        descuentoo = cantidaad * vCompu * 0.1;
                        valoor = (cantidaad * vCompu) - descuentoo;
                    } else {
                        descuentoo = cantidaad * vCompu * 0.2;
                        valoor = (cantidaad * vCompu) - descuentoo;

                    }
                    System.out.println("El descuento optenido por la compra es: " + descuentoo);
                    System.out.println("valor total de la compra es: " + valoor);
                    break;
                case 12:
                    Ejercicios ejerc = new Ejercicios();
                    ejerc.tienda();
                    break;
                case 13:
                    System.out.println("Gracias por utilizar el servicio");
                    break;
                default:
                    System.out.println("Esta opcion no existe");
            }

        } while (opcion != 13);

    }

}
