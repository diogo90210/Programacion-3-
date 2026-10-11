package S_4_3;

public class Fruit {

    private String name;
    private double kilos;
    private double priceWithoutVAT;
    
    private static final double VAT = 1.06; 

    public Fruit(String name, double kilos, double priceWithoutVAT) {
        this.name = name;
        this.kilos = kilos;
        this.priceWithoutVAT = priceWithoutVAT;
    }

    public double getPriceWithVAT() {
        return priceWithoutVAT * VAT;
    }

    public double getTotalWithVAT() {
        return getPriceWithVAT() * kilos;
    }

    public String getName() {
        return name;
    }

    public double getKilos() {
        return kilos;
    }

    public void setKilos(double kilos) {
        this.kilos = kilos;
    }

    public void setPriceWithoutVAT(double priceWithoutVAT) {
        this.priceWithoutVAT = priceWithoutVAT;
    }
}

