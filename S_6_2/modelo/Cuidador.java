package modelo;

public class Cuidador {
    
    private String nombre;
    private String apellidos;
    private boolean formacion;

    public Cuidador(String nombre, String apellidos, boolean formacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.formacion = formacion;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellidos;
    }

    public boolean isFormacion() {
        return formacion;
    }
}
