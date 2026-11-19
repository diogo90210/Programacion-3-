package S_7_2.controller;
import S_7_2.model.AlmacenModel;
import S_7_2.view.AlmacenView;

public class AlmacenController {

    private AlmacenModel model;
    private AlmacenView view;

    public AlmacenController(AlmacenModel model, AlmacenView view) {
        this.model = model;
        this.view = view;
    }

    public void init() {
        view.displayMenu();
    }

    public void guardarVentas(int[][] ventas) {
        model.setVentas(ventas);
    }

    public void guardarPrecios(double[] precios) {
        model.setPrecios(precios);
    }

    public boolean calcularIngresos() {
        return model.calcularIngresos();
    }

    public boolean puedeMostrarResultados() {
        return model.isCalculado();
    }

    public double getIngresosTotales() {
        return model.getIngresosTotales();
    }

}
