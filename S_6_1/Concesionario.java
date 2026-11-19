package S_6_1;
import java.util.ArrayList;


public class Concesionario {
    
    private ArrayList<Coche> stock = new ArrayList<>() ;

    public void addCoche(Coche coche) {
        stock.add(coche);
    }

    public void mostrarStock() {
        if (stock.isEmpty()) {
            System.out.println("No hay coches en stock.");
        } else {
            for (Coche coche : stock) {
                System.out.println(coche);
            }
        }
    }

    public Coche getCoche(String matricula) {
        for (Coche coche : stock) {
            if (coche.getMatricula().equals(matricula)) {
                return coche;
            }
        }
        return null;
    }

        public void removeCoche(String matricula) {
        Coche existe = getCoche(matricula);
        if (existe != null) {
            stock.remove(existe);
        }
    }
}
     /*private Coche[] stock;
    private int numCoches;

    public Concesionario(int capacidadMaxima) {
        this.stock = new Coche[capacidadMaxima];
        this.numCoches = 0;
    }

    // CREATE
    public boolean anadirCoche(Coche coche) {
        if (numCoches >= stock.length) {
            return false; // Array lleno
        }
        if (buscarPorMatricula(coche.getMatricula()) != null) {
            return false; // Matrícula duplicada
        }
        stock[numCoches] = coche;
        numCoches++;
        return true;
    }

    // READ (devolve apenas os carros ocupados)
    public Coche[] getStock() {
        Coche[] activos = new Coche[numCoches];
        for (int i = 0; i < numCoches; i++) {
            activos[i] = stock[i];
        }
        return activos;
    }

    // READ (procura individual)
    public Coche buscarPorMatricula(String matricula) {
        for (int i = 0; i < numCoches; i++) {
            if (stock[i].getMatricula().equalsIgnoreCase(matricula)) {
                return stock[i];
            }
        }
        return null;
    }

    // UPDATE
    public boolean actualizarPrecio(String matricula, double nuevoPrecio) {
        Coche c = buscarPorMatricula(matricula);
        if (c != null) {
            c.setPrecio(nuevoPrecio);
            return true;
        }
        return false;
    }

    // DELETE (desloca os elementos seguintes uma posição para a esquerda)
    public boolean eliminarCoche(String matricula) {
        for (int i = 0; i < numCoches; i++) {
            if (stock[i].getMatricula().equalsIgnoreCase(matricula)) {
                for (int j = i; j < numCoches - 1; j++) {
                    stock[j] = stock[j + 1];
                }
                stock[numCoches - 1] = null;
                numCoches--;
                return true;
            }
        }
        return false;
    }
} */