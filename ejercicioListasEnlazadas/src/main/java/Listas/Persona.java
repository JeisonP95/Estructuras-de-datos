
package Listas;


public class Persona {
   
    private String nombres;
    private String apellidos;
    int edad;

    public Persona(String nombres, String apellidos, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    
    @Override
    public String toString() {
        return "Persona"
                + "\n Nombres  " + getNombres()
                + "\n Apellidos  " + getApellidos()
                + "\n Edad  " + getEdad();
    }
    
    
    
    public String getNombres(){
            return nombres;
    }
    public void setNombres(String nombres){
        this.nombres=nombres;
    }
    public String getApellidos(){
            return apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    public int getEdad(){
            return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
}
    

