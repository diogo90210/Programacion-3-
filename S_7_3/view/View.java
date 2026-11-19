package S_7_3.view;

import S_7_3.model.LibroModel;
import S_7_3.controller.BibliotecaController;

import java.util.Collection;
import java.util.Scanner;

public class View {

    int opcion;
    private BibliotecaController bibliotecaController;
    private Scanner scanner = new Scanner(System.in);

    public View() {
    }

    public void setBibliotecaController(BibliotecaController bibliotecaController) {
        this.bibliotecaController = bibliotecaController;
    }

    public void displayMenu() {
    do {
        System.out.println("Seleccione una opción");
        System.out.println("1. Agregar libro");
        System.out.println("2. Eliminar libro");
        System.out.println("3. Buscar libro");
        System.out.println("4. Mostrar catálogo");
        System.out.println("5. Salir");
        opcion = scanner.nextInt();
        scanner.nextLine();

    switch (opcion) {
        case 1:
            agregarLibro();
            break;
        case 2:
            eliminarLibro();
            break;
        case 3:
            buscarLibro(); 
            break;
        case 4:
            mostrarCatalogo();
            break;
        case 5:
            System.out.println("Saliendo...");
            break;
        default:
            System.out.println("Opción no válida.");
        }
    }
    while (opcion != 5);
    }   
    

    private void agregarLibro() {
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        if (bibliotecaController.agregarLibro(titulo, autor, isbn)) {
            System.out.println("Libro agregado correctamente.");
        } else {
            System.out.println("Error: Ya existe un libro con ese ISBN.");
        }
    }

    private void eliminarLibro() {
        System.out.print("ISBN del libro a eliminar: ");
        String isbn = scanner.nextLine();
        if (bibliotecaController.eliminarLibro(isbn)) {
            System.out.println("Libro eliminado.");
        } else {
            System.out.println("No se encontró ningún libro con ese ISBN.");
        }
    }

    private void buscarLibro() {
        System.out.print("ISBN del libro a buscar: ");
        String isbn = scanner.nextLine();
        LibroModel libro = bibliotecaController.buscarLibro(isbn);
        if (libro != null) {
            System.out.println(libro);
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    private void mostrarCatalogo() {
        Collection<LibroModel> libros = bibliotecaController.getLibros();
        if (libros.isEmpty()) {
            System.out.println("El catálogo está vacío.");
        } else {
            for (LibroModel libro : libros) {
                System.out.println(libro);
            }
        }
    }
}
