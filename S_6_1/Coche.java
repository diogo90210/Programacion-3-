package S_6_1;

public class Coche {
    private String marca;
    private String modelo;
    private int año;
    private double precio;
    private String matricula;

    public Coche(String marca, String modelo, int año, double precio, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public double getPrecio() {
        return precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override 
    public String toString() {
        return String.format("Coche{" + "marca='%s', modelo='%s', año=%d, precio=%.2f, matricula='%s'}", marca, modelo, año, precio, matricula);
    }
}
