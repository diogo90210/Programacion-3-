package S_6_3;

import java.util.HashMap;

public class Biblioteca {
    private HashMap<String, Libro> stock = new HashMap<>();

    public Biblioteca() {
    }

    public boolean agregarLibro(Libro libro) {
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
        for (Libro libro : stock.values()) {
            System.out.println(libro);
        }
    }

    public Libro buscarLibro(String ISBN) {
        return stock.get(ISBN); 
    }

    public boolean eliminarLibro(String ISBN) {
        return stock.remove(ISBN) != null;
    }
}