package modelo;

import java.util.ArrayList;

public class Refugio {
    
    private double precioAlimento;
    private ArrayList<Animal> stock = new ArrayList<>();

    public Refugio() {
        this.precioAlimento = 3.0;
    }

    public boolean addAnimal (Animal animal){
        if (buscarAnimal(animal.getDNI()) != null) {
            return false;
        }
        stock.add(animal);
        return true;
    }

    public Animal buscarAnimal(String DNI) {
        for (Animal animal : stock) {
            if (animal.getDNI().equalsIgnoreCase(DNI)) {
                return animal;
            }
        }
        return null;
    }

    public ArrayList<Animal> getStock() {
        return stock;
    }



    public void removeAnimal (String DNI){
        Animal existe = null;
        for (Animal animal : stock) {
            if (animal.getDNI().equals(DNI)) {
                existe = animal;
                break;
            }
        }
        if (existe != null) {
            stock.remove(existe);
        }
    }

    public void setPrecioAlimento (double precioAlimento){
        this.precioAlimento = precioAlimento;
    }

    public double getPrecioAlimento(){
        return precioAlimento;
    }
}
