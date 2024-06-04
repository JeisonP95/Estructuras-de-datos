package academico;

import java.util.Scanner;

public class Estudiante {
    private int codigo;
    private String nombre;
    private String apellido;
    private int semestre;
    private String programa;
    
    
    public Estudiante() {
    }
    
    public Estudiante(int codigo, String nombre, String apellido, int semestre, String programa) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.semestre = semestre;
        this.programa = programa;
        
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getSemestre() {
        return semestre;
    }

    public String getPrograma() {
        return programa;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    

    public void setPrograma(String programa) {
        this.programa = programa;
    }
    
    public static Estudiante agregarEstudiante(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un codigo: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("ingrese el semestre que cursa: ");
        int semestre= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el programa que cursa: ");
        String programa= scanner.nextLine();

            
        
        Estudiante nuevoEstudiante= new Estudiante(codigo,nombre,apellido,semestre,programa);
        
        return nuevoEstudiante;
    }
    
    public void mostrarEstudiante(){
        System.out.println("Codigo: " + this.getCodigo());
        System.out.println("Nombre: " +this.getNombre());
        System.out.println("Apellido: "+this.getApellido());
        System.out.println("Semestre: "+this.getSemestre());
        System.out.println("Programa: "+this.getPrograma());
    }
    
    public static void modificarEstudiante(Estudiante estudianteAModificar){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nuevo codigo: ");
        int newCodigo=scanner.nextInt();
        estudianteAModificar.setCodigo(newCodigo);
        System.out.println("Ingrese el nuevo nombre: ");
        String newNombre=scanner.nextLine();
        estudianteAModificar.setNombre(newNombre);
        System.out.println("Ingrese el nuevo apellido: ");
        String newApellido=scanner.nextLine();
        estudianteAModificar.setApellido(newApellido);
        System.out.println("Ingrese el nuevo semestre: ");
        int newSemestre=scanner.nextInt();
        estudianteAModificar.setSemestre(newSemestre);
        System.out.println("Ingrese el nuevo programa: ");
        String newPrograma=scanner.nextLine();
        estudianteAModificar.setPrograma(newPrograma);
        
        
        
    }


}
