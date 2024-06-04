
package Main;


public class Fraccion {
    
    
    private int numerador;
    private int deominador;

    public Fraccion(int numerador, int deominador) {
        this.numerador = numerador;
        this.deominador = deominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDeominador() {
        return deominador;
    }

    public void setDeominador(int deominador) {
        this.deominador = deominador;
    }

    @Override
    public String toString() {
        return "Fraccion{" + "numerador=" + numerador + ", deominador=" + deominador + '}';
    }
    
    
    
}
