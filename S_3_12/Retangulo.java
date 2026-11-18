package S_3_12;

public class Retangulo {
    private float largura = 1;
    private float altura = 1;

    public Retangulo(float largura, float altura) {
        setLargura(largura);
        setAltura(altura);
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        if (largura > 0 && largura < 20) {
            this.largura = largura;
        } else {
            System.err.println("Largura deve ser positiva e menor que 20.");
        }
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (altura > 0 && altura < 20) {
            this.altura = altura;
        } else {
            System.err.println("Altura deve ser positiva e menor que 20.");
        }
    }

    public float calcularArea() {
        return largura * altura;
    }

    public float calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 4);
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
    }
}
