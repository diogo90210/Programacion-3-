package modelo;

import java.util.Scanner;

public class App {
    public static void main(String [] args){

        Refugio refugio = new Refugio();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\nGESTIÓN DEL REFUGIO");
            System.out.println("1) Añadir un nuevo animal al refugio");
            System.out.println("2) Mostrar información de los animales");
            System.out.println("3) Añadir un nuevo animal al refugio");
            System.out.println("4) Modificar animal");
            System.out.println("5) Salir (se borrará toda la información)");
            System.out.print("Seleccione una opción (1-5): ");

        if (scanner.hasNextInt()) {
            opcion = scanner.nextInt();
            scanner.nextLine(); 
        } else {
            System.out.println("Por favor, introduzca un número válido.");
            scanner.next();
            continue;
        }

        switch (opcion) {
            case 1: 
                System.out.print("Introduza el nome del animal: ");
                String nombre = scanner.nextLine();
                System.out.println("Introduza el especie del animal: ");
                String especie = scanner.nextLine();
                System.out.print("Introduzca el nombre del cuidador: ");
                String nomCuidador = scanner.nextLine();
                System.out.print("Introduzca los apellidos del cuidador: ");
                String apeCuidador = scanner.nextLine();
                System.out.print("¿Tiene formación en cuidado animal? (Y/N): ");
                boolean formacion = scanner.nextLine().equalsIgnoreCase("Y");
                Cuidador cuidador = new Cuidador(nomCuidador, apeCuidador, formacion);
                System.out.println("Introduza el peso del animal: ");
                double peso = scanner.nextDouble();
                System.out.println("Introduza el consumo diario del animal: ");
                double consumoDiario = scanner.nextDouble();

                System.out.println("Introduza el DNI del animal: ");
                String DNI = scanner.nextLine();

                Animal nuevoAnimal = new Animal(nombre, especie , cuidador, peso, consumoDiario, DNI);
                if (refugio.addAnimal(nuevoAnimal)) {
                        System.out.println("Animal añadido al refugio.");
                        } else {
                            System.out.println("Error: ya existe un animal con ese DNI.");
                        }
                break;

            case 2: 
                if (refugio.getStock().isEmpty()) {
                    System.out.println("No hay animales en el refugio.");
                    } else {
                        for (Animal a : refugio.getStock()) {
                        System.out.println(a);
                        }
                    }
                break;

            case 3:

                System.out.print("DNI del animal que desea modificar: ");
                String dniBuscar = scanner.nextLine();
                Animal animal = refugio.buscarAnimal(dniBuscar);

                if (animal == null) {
                    System.out.println("Animal no encontrado.");
                    break;
                }

                System.out.print("Quieres mudar el peso del animal: Y/N ");
                if (scanner.nextLine().equalsIgnoreCase("Y")) {
                    System.out.print("Introduzca el nuevo peso (kg): ");
                    double nuevoPeso = Double.parseDouble(scanner.nextLine());
                    if (nuevoPeso > 0) {
                        animal.setPeso(nuevoPeso);
                        System.out.println("Peso actualizado.");
                    } else {
                        System.out.println("Error: el peso debe ser mayor que 0.");
                    }
                }   

                System.out.print("Quieres mudar el consumo diario del animal: Y/N ");
                if (scanner.nextLine().equalsIgnoreCase("Y")) {
                    System.out.print("Introduzca el nuevo consumo diario (kg): ");
                    double nuevoConsumo = Double.parseDouble(scanner.nextLine());
                    if (nuevoConsumo > 0) {
                        animal.setConsumoDiario(nuevoConsumo);
                        System.out.println("Consumo diario actualizado.");
                    } else {
                        System.out.println("Error: el consumo diario debe ser mayor que 0.");
                    }
                }
                break;

            case 4:
                System.out.print("Qual eres el DNI del animal que desea eliminar: ");
                String dniEliminar = scanner.nextLine();
                if (refugio.buscarAnimal(dniEliminar) != null) {
                    refugio.removeAnimal(dniEliminar);
                } else {
                    System.out.println("Animal no encontrado.");
                } 
                break;

                default:
                    System.out.println("Opción no válida. Seleccione entre 1 y 5.");
            }
        } while (opcion != 5);
        scanner.close();
    }  
}
