package S_7_3.controller;
import java.util.Collection;

import S_7_3.model.BibliotecaModel;
import S_7_3.model.LibroModel;
import S_7_3.view.View;

public class BibliotecaController {

    public BibliotecaModel bibliotecaModel;
    public View view;

    public BibliotecaController(BibliotecaModel bibliotecaModel, View view) {
        this.bibliotecaModel = bibliotecaModel;
        this.view = view;
    }

    public void init (){
        view.displayMenu();
    }

    public boolean agregarLibro(String titulo, String autor, String ISBN){
        LibroModel libroModel = new LibroModel(titulo, autor, ISBN);
        return bibliotecaModel.agregarLibro(libroModel);
    }

    public boolean eliminarLibro(String ISBN){
        return bibliotecaModel.eliminarLibro(ISBN);
    }

    public LibroModel buscarLibro(String ISBN){
        return bibliotecaModel.buscarLibro(ISBN);
    }

    public Collection<LibroModel> getLibros() {
        return bibliotecaModel.getLibros();
    }

}
