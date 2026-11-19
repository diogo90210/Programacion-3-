package S_7_3.model;

import java.util.Collection;
import java.util.HashMap;

public class BibliotecaModel {
    private HashMap<String, LibroModel> stock = new HashMap<>();

    public BibliotecaModel() {
    }

    public Collection<LibroModel> getLibros() {
        return stock.values();
    }

    public boolean agregarLibro(LibroModel libro) {
        if (stock.containsKey(libro.getISBN())) {
            return false;
        }
        stock.put(libro.getISBN(), libro);
        return true;
    }

    public void mostrarCatalogo() {
        if (stock.isEmpty()) {
            System.out.println("El catálogo está vacío.");
            return;
        }
        for (LibroModel libro : stock.values()) {
            System.out.println(libro);
        }
    }

    public LibroModel buscarLibro(String ISBN) {
        return stock.get(ISBN); 
    }

    public boolean eliminarLibro(String ISBN) {
        return stock.remove(ISBN) != null;
    }
}