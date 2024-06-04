package academico;

import java.util.Vector;
import java.util.Scanner;

public class Academico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Estudiante> ListEstudiantes = new Vector<>();
        char sig;

        do {
            System.out.println("--------MENU------- ");
            System.out.println("1.Agregar el estudiante.");
            System.out.println("2.Mostrar los estudiantes.");
            System.out.println("3.Modificar el estudiante.");
            System.out.println("4.Eliminar al estudiante.");

            System.out.println("Ingresar la opcion que desee");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    Estudiante nuevoEstudiante = Estudiante.agregarEstudiante();
                    ListEstudiantes.add(nuevoEstudiante);
                    break;
                case 2:
                    System.out.println("Estos son los estudiantes que registro: ");
                    for (int i = 0; i < ListEstudiantes.size(); i++) {
                        Estudiante estudiante = ListEstudiantes.get(i);
                        System.out.println("El estudinate" + i);
                        estudiante.mostrarEstudiante();
                    }
                    break;
                case 3:
                    System.out.println("Esta es la cantidad de estudiantes: " + ListEstudiantes.size());
                    System.out.println("Ingrese el indice del estudinate que va a modificar: ");
                    int modif = scanner.nextInt();
                    Estudiante estudianteAModificar = ListEstudiantes.get(modif);
                    Estudiante.modificarEstudiante(estudianteAModificar);
                    estudianteAModificar.mostrarEstudiante();

                    break;
                case 4:
                    System.out.println("indique el lugar del estudiante a eliminar: ");
                    int elim = scanner.nextInt();
                    ListEstudiantes.remove(elim);
                default:
            }
            System.out.print("Deseas continuar? SI(S)/NO(N)......");
            sig = scanner.next().charAt(0);
        } while ((sig == 'S') || (sig == 's'));
        if ((sig == 'N') || (sig == 'n')) {
            System.out.println("Has terminado gracias");
        } else {
            System.out.println("esta opcion no es valida");
        }
    }
}
