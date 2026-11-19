package S_8_2.model;

import java.util.Locale;

public class Fatura {
    private String concepto;
    private double descuento;
    private String fecha;
    private double importe;
    private String nif;
    private String nombreCliente;
    private String direccion;
    private double iva;

    public Fatura (String concepto, double descuento, String fecha, double importe, String nif, String nombreCliente, String direccion, double iva){
        this.concepto = concepto;
        this.descuento = descuento;
        this.fecha = fecha;
        this.importe = importe;
        this.nif = nif;
        this.nombreCliente = nombreCliente;
        this.direccion = direccion;
        this.iva = iva;
    }

    public static Fatura fromDelimitedString(String linea, String delimiter) {
        if (linea == null || linea.isBlank()) {
            return null;
        }
        String[] tokens = linea.split(delimiter);
        if (tokens.length != 8) {
            return null;
        }
        try {
            String concepto = tokens[0].trim();
            double descuento = Double.parseDouble(tokens[1].trim());
            String fecha = tokens[2].trim();
            double importe = Double.parseDouble(tokens[3].trim());
            String nif = tokens[4].trim();
            String nombreCliente = tokens[5].trim();
            String direccion = tokens[6].trim();
            double iva = Double.parseDouble(tokens[7].trim());
            return new Fatura (concepto, descuento, fecha, importe, nif, nombreCliente, direccion, iva);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public double getValorMinimoFatura () {
        return importe * (1 - descuento) * (1 + iva);
    } 

    public String getNif (){
        return this.nif;
    }

    public String getNombreCliente (){
        return this.nombreCliente;
    }

    public String getConcepto () {
        return this.concepto;
    }

    public String getFecha () {
        return this.fecha;
    }

    public String toDelimitedString(String delimiter) {
        return String.format(Locale.ENGLISH, "%s%s%.2f%s%s%s%.2f%s%s%s%s%s%s%s%.2f%s%.2f",
                concepto, delimiter, descuento, delimiter, fecha, delimiter,
                importe, delimiter, nif, delimiter, nombreCliente, delimiter,
                direccion, delimiter, iva, delimiter, getValorMinimoFatura());
    }

    @Override
    public String toString() {
        return String.format("%-15s | %-20s | Total: %.2f €", nif, nombreCliente, getValorMinimoFatura());
    }


    
}
