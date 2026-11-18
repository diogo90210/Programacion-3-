package S_3_11;

public class DNI {
    private String numero;
    private char letra;

    public DNI(String numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    private char calcularLetra(String numero) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int num = Integer.parseInt(numero);
        return letras.charAt(num % 23);
    }

    public String getNumero() {
        return numero;
    }

    public char getLetra() {
        return letra;
    }
}
