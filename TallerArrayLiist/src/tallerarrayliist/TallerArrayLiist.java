package tallerarrayliist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TallerArrayLiist {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        ArrayList<String> estudiantes = new ArrayList<>();

        int opcion = 0;

        do {
            System.out.println("------MENU------");
            System.out.println("1.Ingresar nombre del estudiante");
            System.out.println("2.Eliminar nombres de los estudiantes");
            System.out.println("3.Actualizar nombre del estudiante");
            System.out.println("4.Buscar nombre del estudiante");
            System.out.println("5.Mostrar estudiante(s)");
            System.out.println("6.SALIR");

            System.out.println("Ingreasa la opcion");
            opcion = ingreso.nextInt();
            ingreso.nextLine();

            switch (opcion) {
                case 1:
                    //Ingresar nombre(s) de estudiante(s)
                    System.out.println("Ingresar nombre del estudiante");
                    String newStudent = ingreso.nextLine();

                    while (!newStudent.equals("fin")) {
                        estudiantes.add(newStudent);
                        newStudent = ingreso.nextLine();
                    }
                    System.out.println("Se ingreso correctamente");

                    break;
                case 2:
                    //Eliminar nombre de estudiante
                    if (estudiantes.isEmpty()) {
                        System.out.println("No hay estudiantes para eliminar");
                    } else {
                        System.out.println("Ingresar estudiante a eliminar");
                        String eliminarStudent = ingreso.nextLine();

                        if (estudiantes.contains(eliminarStudent)) {
                            estudiantes.remove(eliminarStudent);
                            System.out.println("Se elimino el nombre del estudiante " + eliminarStudent);
                        } else {
                            System.out.println("No se encuentra el nombre del estudiante " + eliminarStudent);
                        }
                    }

                    break;
                case 3:
                    //Actualizar nombre de estudiante
                    if (estudiantes.isEmpty()) {
                        System.out.println("No hay estudiantes para actualizar");

                    } else {
                        System.out.println("Ingrese el nombre del estudiante que desea actualizar");
                        String actualizarStudent = ingreso.nextLine();

                        if (estudiantes.contains(actualizarStudent)) {
                            System.out.println("Ingrese el nuevo nombre del estudiante");
                            String nuevoStudent = ingreso.nextLine();
                            estudiantes.set(estudiantes.indexOf(actualizarStudent), nuevoStudent);
                            System.out.println("El nombre del estudiante se actualizo correctamente");

                        } else {
                            System.out.println("El nombre del estudiante no se encontro en la lista");
                        }
                    }
                    break;
                case 4:
                    //Buscar nombre de estudiante
                    if (estudiantes.isEmpty()) {
                        System.out.println("No hay estudiantes para buscar");

                    } else {
                        System.out.println("Ingresar el nombre del estudiante que desea buscar");
                        String searchStudent = ingreso.nextLine();

                        boolean encontrado = false;
                        for (int i = 0; i < estudiantes.size(); i++) {
                            if (estudiantes.get(i).equals(searchStudent)) {
                                encontrado = true;
                                break;
                            }
                        }

                        if (encontrado) {
                            System.out.println("El estudiante: " + searchStudent + " se encuentra en la lista ");
                        } else {
                            System.out.println("El estudiante: " + searchStudent + " no se encuentra en la lista ");
                        }
                    }
                    break;
                case 5:
                    //Mostrar ordenadamente
                    if (estudiantes.isEmpty()) {
                        System.out.println("No se encuentra ningun nombre en la lista para mostrar");

                    } else {
                        Collections.sort(estudiantes);
                        System.out.println("Lista de estudiantes ordenados alfabeticamente: \n");
                        for (String estudiante : estudiantes) {
                            System.out.println(estudiante);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Gracias por utilizar el servicio");
                    break;
                default:
                    System.out.println("Ingresa la opcion correcta");
            }
        } while (opcion != 6);
    }
}
