package S_8_1.model;

public class Partido {
    private String equipoLocal;
    private String equipoVisitante;
    private int golesLocal;
    private int golesVisitante;
    private String resultado;

    public Partido(String equipoLocal, String equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.resultado = "-";
    }

    public static Partido fromDelimitedString(String linea, String delimiter) {
        if (linea == null || linea.isBlank()) {
            return null;
        }
        String[] tokens = linea.split(delimiter);
        if (tokens.length != 2) {
            return null;
        }
        return new Partido(tokens[0].trim(), tokens[1].trim());
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setGoles(int golesLocal, int golesVisitante) {
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.resultado = getVencedor(); 
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getResultado() {
        return resultado;
    }

    public String getVencedor(){
        if(golesLocal > golesVisitante){
            return "1";
        } else if(golesVisitante > golesLocal){
            return "2";
        } else {
            return "X";
        }
    }

    @Override
    public String toString() {
        return equipoLocal + " vs " + equipoVisitante + " -> [" + resultado + "]";
    }
}
