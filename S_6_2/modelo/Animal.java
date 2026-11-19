package modelo;

public class Animal {
    
    private String nombre;
    private String especie;
    private Cuidador cuidador;
    private double peso;
    private double consumoDiario;
    private String DNI;


    public Animal(String nombre, String especie, Cuidador cuidador, double peso, double consumoDiario, String DNI) {
        this.nombre = nombre;
        this.especie = especie;
        this.cuidador = cuidador;
        this.peso = peso;
        this.consumoDiario = consumoDiario;
        this.DNI = DNI;
    }
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public Cuidador getCuidador() {
        return cuidador;
    }

    public double getPeso() {
        return peso;
    }

    public double getConsumoDiario(){
        return consumoDiario;
    }

    public String getDNI() {
        return DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setCuidador(Cuidador cuidador) {
        this.cuidador = cuidador;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setConsumoDiario(double consumoDiario) {
        this.consumoDiario = consumoDiario;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

}