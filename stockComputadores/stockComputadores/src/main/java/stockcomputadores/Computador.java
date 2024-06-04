package stockcomputadores;

public class Computador {

    private String serial;
    private String marca;
    private int capacidadAlmacenamiento;
    private int capacidadRAM;
    private String procesador;

    public Computador(String serial, String marca, int capacidadAlmacenamiento, int capacidadRAM, String procesador) {
        this.serial = serial;
        this.marca = marca;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.capacidadRAM = capacidadRAM;
        this.procesador = procesador;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public int getCapacidadRAM() {
        return capacidadRAM;
    }

    public void setCapacidadRAM(int capacidadRAM) {
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
        return "Serial: " + serial + ", Marca: " + marca + ", Capacidad de Almacenamiento: " + capacidadAlmacenamiento
                + "GB, Capacidad RAM: " + capacidadRAM + "GB, Procesador: " + procesador;
    }
}
