package S_7_3;

import S_7_3.controller.BibliotecaController;
import S_7_3.model.BibliotecaModel;
import S_7_3.view.View;

public class App {
    public static void main(String[] args) {
        BibliotecaModel model = new BibliotecaModel();
        View view = new View();
        BibliotecaController controller = new BibliotecaController(model, view);

        view.setBibliotecaController(controller);
        controller.init();
    }
}