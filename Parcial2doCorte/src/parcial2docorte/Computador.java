
package parcial2docorte;


public class Computador {
    private int serial;
    private String marca;
    private String capacidadAlmacenamiento;
    private String capacidadRAM;
    private String procesador;

    public Computador(int serial, String marca, String capacidadAlmacenamiento, String capacidadRAM, String procesador) {
        this.serial = serial;
        this.marca = marca;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.capacidadRAM = capacidadRAM;
        this.procesador = procesador;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(String capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public String getCapacidadRAM() {
        return capacidadRAM;
    }

    public void setCapacidadRAM(String capacidadRAM) {
        this.capacidadRAM = capacidadRAM;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    

   
    
    @Override
    public String toString() {
        return "Computador{" + "serial=" + serial + ", marca=" + marca + ", capacidadAlmacenamiento=" + capacidadAlmacenamiento + ", capacidadRAM=" + capacidadRAM + ", procesador=" + procesador + '}';
    }
    
    
    
    
    
    
    
}
