package S_8_1.model;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class QuinielaModel {

    private ArrayList<Partido> partidos = new ArrayList<>();

    public QuinielaModel() {
        this.partidos = new ArrayList<>();
    }

    public boolean cargarPartidos() {
        Path ruta = Paths.get(System.getProperty("user.home"), "Documents", "datos", "equipos.txt");

        if (!Files.exists(ruta)) {
            return false;
        }

        try {
            List<String> lineas = Files.readAllLines(ruta, StandardCharsets.UTF_8);
            partidos.clear();
            for (String linea : lineas) {
                Partido p = Partido.fromDelimitedString(linea, "-");
                if (p != null) {
                    partidos.add(p);
                }
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }  
}
