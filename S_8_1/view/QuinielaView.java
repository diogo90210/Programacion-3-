package S_8_1.view;
import S_8_1.controller.*;
import S_8_1.model.*;
import java.util.Scanner;
import java.util.ArrayList;

public class QuinielaView {

    private QuinielaController quinielaController;
    private Scanner scanner = new Scanner(System.in);

    public QuinielaView () {
    }

    public void setQuinielaController (QuinielaController quinielaController){
        this.quinielaController = quinielaController;
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void displayMenu() {
        int option;
        do {
            System.out.println("Apresentacion de Quinileas");
            System.out.println("1. Introduza os resultados");
            System.out.println("2. Ver resultados");
            System.out.println("3. Salir");
            System.out.println("Escolha a sua opção");
            option = scanner.nextInt();
            scanner.nextLine();


            switch(option){
                case 1: 
                    introduzaOsResultados();
                    break;
                case 2:
                    mostrarQuiniela();
                    break;
                case 3: 
                    System.out.println("Saliendo...");
                    break;
                }
            } while(option != 3);
        }

        public void introduzaOsResultados (){
            ArrayList<Partido> partidos = quinielaController.getPartidos();
            if(partidos.isEmpty()){
                System.out.println("Não foram encontradas partidas");
                return ;
            }

            for (Partido p : partidos){
                System.out.println("Partido" + p.getEquipoLocal() + "vs" + p.getEquipoVisitante());
                System.out.println("Goles" + p.getEquipoLocal() + ": ");
                int golesLocal = Integer.parseInt(scanner.nextLine().trim());
                System.out.println("Goles" + p.getEquipoVisitante() + ": ");
                int golesVisitante = Integer.parseInt(scanner.nextLine().trim());

                p.setGoles(golesLocal, golesVisitante);
            }
        }

        public void mostrarQuiniela() {
            ArrayList<Partido> partidos = quinielaController.getPartidos();
            if(partidos.isEmpty()){
                System.out.println("Não foram encontradas partidas");
                return ;
            }
            System.out.println("Resultados da jornada");
            for (Partido p : partidos) {
            System.out.println(p);
        }
        }
}