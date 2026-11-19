package S_7_2.view;
import java.util.Scanner;
import S_7_2.controller.AlmacenController;
import S_7_2.model.AlmacenModel;


public class AlmacenView {

    private AlmacenController controller;
    private Scanner scanner = new Scanner(System.in);

    public AlmacenView() {
    }

    public void setController(AlmacenController controller) {
    this.controller = controller;
}

    public void displayMenu() {
       int option; 
       do{
           System.out.println("\n--- GESTIÓN DE ALMACENES ---");
           System.out.println("1. Leer tabla de ventas");
           System.out.println("2. Leer tabla de precios");
           System.out.println("3. Calcular Ingresos Totales");
           System.out.println("4. Mostrar resultados");
           System.out.println("5. Salir");
           option = scanner.nextInt();
           scanner.nextLine();

           switch (option) {
               case 1:
                   leerTablaVentas();
                   break;
               case 2:
                   leerTablaPrecios();
                   break;
               case 3:
                   if(controller.calcularIngresos()) {
                       System.out.println("Cálculo de ingresos realizado con éxito.");
                   } else {
                       System.out.println("Error al calcular ingresos. Asegúrese de haber ingresado las tablas de ventas y precios.");
                   }
                   break;
               case 4:
                   if(controller.puedeMostrarResultados()) {
                       System.out.println("Los ingresos totales son: " + controller.getIngresosTotales());
                   } else {
                       System.out.println("Error: No se han calculado los ingresos.");
                   }
                   break;
                case 5:
                   System.out.println("Saliendo...");
                   break;
               default:
                   System.out.println("Opción no válida. Intente de nuevo.");
           }
       } while (option != 5);

    }

    private void leerTablaVentas() {
        int ventas [][] = new int [AlmacenModel.numAlmacen][AlmacenModel.numProductos];
        for (int i = 0; i < AlmacenModel.numAlmacen; i++) {
            for (int j = 0; j < AlmacenModel.numProductos; j++) {
                System.out.print("Ingrese las ventas del almacén " + (i + 1) + " del producto " + (j + 1) + ": ");
                ventas[i][j] = scanner.nextInt();
            }
        }
        controller.guardarVentas(ventas);
        System.out.println("Tabla de ventas guardada.");
    }

    public void leerTablaPrecios() {
        double precios[] = new double[AlmacenModel.numProductos];
        for (int j = 0; j < AlmacenModel.numProductos; j++) {
            System.out.print("Ingrese el precio del producto " + (j + 1) + ": ");
            precios[j] = scanner.nextDouble();
        }
        controller.guardarPrecios(precios);
        System.out.println("Tabla de precios guardada.");
    }
}
