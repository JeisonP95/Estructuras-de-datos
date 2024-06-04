package ejerclinkedlist;

public class Fraccion {

    private int numerador;
    private int denominador;

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return  "Fraccion= " + numerador + "/" + denominador ;
    }

}
