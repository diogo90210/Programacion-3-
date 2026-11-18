package S_4_5;

import java.util.Scanner;

public class Quinela {

    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Partido [] partidos = {
            new Partido("Levante", "Las Palmas"),
            new Partido("Real Madrid", "Barcelona"),
            new Partido("Betis", "Sevilla"),
            new Partido("Real Sociedad", "Athletic Club"),
            new Partido("Villarreal", "Valencia"),
            new Partido("Getafe", "Rayo Vallecano"),
            new Partido("Celta de Vigo", "Deportivo Alavés"),
            new Partido("Osasuna", "Mallorca"),
            new Partido("Girona", "Espanyol"),
            new Partido("Valladolid", "Leganés"),
            new Partido("Racing Santander", "Real Oviedo"),
            new Partido("Sporting Gijón", "Real Zaragoza"),
            new Partido("Málaga", "Granada"),
            new Partido("Tenerife", "Elche"),
            new Partido("Atlético de Madrid", "Salamanca CF")
        };

        for(int i = 0; i < partidos.length; i++){

            System.out.println("Introduce el número de goles del equipo local: " + partidos[i].getEquipoLocal());
            int golesLocal = Integer.parseInt(scanner.nextLine());

            System.out.println("Introduce el número de goles del equipo visitante: " + partidos[i].getEquipoVisitante());
            int golesVisitante = Integer.parseInt(scanner.nextLine());

            partidos[i].setResultado(golesLocal, golesVisitante);
        }

        int ancho = 10;
        for (Partido partido : partidos) {
            if (partido.getEquipoLocal().length() > ancho) {
                ancho = partido.getEquipoLocal().length();
            }
            if (partido.getEquipoVisitante().length() > ancho) {
                ancho = partido.getEquipoVisitante().length();
            }
        }

        String separador = "+" + "-".repeat(ancho + 2) + "+" + "-".repeat(ancho + 2) + "+---+";
        String formatoFila = "| %-" + ancho + "s | %-" + ancho + "s | %s |%n";

        System.out.println("\nQUINIELA");
        System.out.println(separador);
        System.out.printf(formatoFila, "LOCAL", "VISITANTE", "R");
        System.out.println(separador);

        for (Partido partido : partidos) {
            System.out.printf(formatoFila, partido.getEquipoLocal(), partido.getEquipoVisitante(), partido.getVencedor());
        }
        System.out.println(separador);
        scanner.close();
    }
}
