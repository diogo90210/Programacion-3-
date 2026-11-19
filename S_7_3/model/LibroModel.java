package S_7_3.model;

public class LibroModel {
    private String titulo;
    private String autor;
    private String ISBN;

    public LibroModel(String titulo, String autor, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo='" + titulo + '\'' + ", autor='" + autor + '\'' + ", ISBN='" + ISBN + '\'' + '}';
    }
}
