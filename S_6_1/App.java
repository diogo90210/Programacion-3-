package S_6_1;

import java.util.Scanner;

public class App {
    public static void main(String [] args){
        Concesionario concesionario = new Concesionario();
        //Concesionario concesionario = new Concesionario(10);
        Scanner scanner = new Scanner(System.in);
        int option;

        do{
            System.out.println("Menu");
            System.out.println("1. Añadir coche");
            System.out.println("2. Listar Coche");
            System.out.println("3. Modificar Coche");
            System.out.println("4. Eliminar Coche");
            System.out.println("5. Salir");
            option = scanner.nextInt();

            switch (option) {
            case 1 ->{
                System.out.println("Introduce la marca del coche:");
                String marca = scanner.next();
                System.out.println("Introduce el modelo del coche:");
                String modelo = scanner.next();
                System.out.println("Introduce el año del coche:");
                int año = scanner.nextInt();
                System.out.println("Introduce el precio del coche:");
                double precio = scanner.nextDouble();
                System.out.println("Introduce la matrícula del coche:");
                String matricula = scanner.next();

                Coche coche = new Coche(marca, modelo, año, precio, matricula);
                concesionario.addCoche(coche);
            }
            case 2 -> {
                System.out.println("Lista de coches en stock:");
                concesionario.mostrarStock();
            }
            case 3-> {
                System.out.println("Introduce la matrícula del coche a modificar:");
                String matricula = scanner.next();
                Coche coche = concesionario.getCoche(matricula);
                if (coche != null) {
                    System.out.println("Introduce el nuevo precio del coche:");
                    double nuevoPrecio = scanner.nextDouble();
                    coche.setPrecio(nuevoPrecio);
                    System.out.println("Precio modificado con éxito.");
                } else {
                    System.out.println("Coche no encontrado.");
                }
            }
            case 4 -> {
                System.out.println("Introduce la matrícula del coche a eliminar:");
                String matricula = scanner.next();
                concesionario.removeCoche(matricula);
            }
            case 5 -> System.out.println("Saliendo del programa...");
        } 
    } while (option != 5);
        scanner.close();
    }
}
