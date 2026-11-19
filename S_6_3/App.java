package S_6_3;
import java.util.Scanner;

public class App {

    public static void main(String [] Args){
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Agregar libro");
            System.out.println("2. Mostrar catálogo");
            System.out.println("3. Buscar libro");
            System.out.println("4. Eliminar libro");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ISBN del libro: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    Libro libro = new Libro(isbn, titulo, autor);
                    if (biblioteca.agregarLibro(libro)) {
                        System.out.println("Libro agregado exitosamente.");
                    } else {
                        System.out.println("El libro ya existe.");
                    }
                    break;
                case 2:
                    biblioteca.mostrarCatalogo();
                    break;
                case 3:
                    System.out.print("Ingrese el ISBN del libro a buscar: ");
                    String isbnBuscar = scanner.nextLine();
                    Libro libroEncontrado = biblioteca.buscarLibro(isbnBuscar);
                    if (libroEncontrado != null) {
                        System.out.println("Libro encontrado: " + libroEncontrado);
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el ISBN del libro a eliminar: ");
                    String isbnEliminar = scanner.nextLine();
                    if (biblioteca.eliminarLibro(isbnEliminar)) {
                        System.out.println("Libro eliminado exitosamente.");
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        scanner.close();
    }

}

