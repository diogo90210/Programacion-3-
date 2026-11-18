package S_4_5;

public class Partido {
    private String equipoLocal;
    private String equipoVisitante;
    private int golesLocal;
    private int golesVisitante;

    public Partido(String equipoLocal, String equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setResultado(int golesLocal, int golesVisitante) {
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    public String getResultado() {
        return String.format("%s %d - %d %s", equipoLocal, golesLocal, golesVisitante, equipoVisitante);
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
}
