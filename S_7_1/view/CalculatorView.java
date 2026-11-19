package S_7_1.view;
import S_7_1.controller.*;
import java.util.Scanner;

public class CalculatorView {
    private CalculatorController controller;
    private Scanner scanner = new Scanner(System.in);

    public CalculatorView() {
    }

    public void setController(CalculatorController controller) {
        this.controller = controller;
    }

    public void displayMenu() {
        int option;

        do{
            System.out.println("\n--- MENÚ SUMA MVC ---");
            System.out.println("1. Leer los números");
            System.out.println("2.- Calcular la suma");
            System.out.println("3. Mostrar el resultado");
            System.out.println("4.- Salir");
            System.out.print("Elige una opción: ");
            option = scanner.nextInt();
            scanner.nextLine(); 


            switch (option) {
                case 1 -> leerNumeros();
                case 2 -> controller.addNumbers();
                case 3 -> System.out.println("El resultado es: " + controller.getResult());
                case 4 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida");
            }
        } while (option != 4);

    }

    public void leerNumeros() {
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();
        controller.getNumbers(a, b);
    }
}
