package S_7_2.model;

public class AlmacenModel {
    public static final int numAlmacen = 5;
    public static final int numProductos = 2;
  
    public int [][] ventas = new int[numAlmacen][numProductos];
    public double [] precios = new double[numProductos];
    public double ingresosTotales;

    private boolean ventasLeidas = false;
    private boolean preciosLeidos = false;
    private boolean calculado = false;

    public void setVentas(int [][] ventas ){
        this.ventas = ventas;
        ventasLeidas = true;
        calculado = false;
    }

    public void setPrecios(double [] precios){
        this.precios = precios;
        preciosLeidos = true;
        calculado = false;
    }

    public boolean calcularIngresos(){
        if(!ventasLeidas || !preciosLeidos) {
            return false;
        }


        double total = 0;
        for (int i = 0; i < numAlmacen; i++) {
            for (int j = 0; j < numProductos; j++) {
                total += ventas[i][j] * precios[j];
            }
        }
        this.ingresosTotales = total;
        calculado = true;
        return true;
    }

    public boolean isCalculado() {
        return calculado;
    }

    public double getIngresosTotales() {
        return ingresosTotales;
    }

}
