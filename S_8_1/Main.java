package S_8_1;

import S_8_1.controller.QuinielaController;
import S_8_1.model.QuinielaModel;
import S_8_1.view.QuinielaView;

public class Main {
    public static void main(String[] args) {
        QuinielaModel model = new QuinielaModel();
        QuinielaView view = new QuinielaView();
        QuinielaController controller = new QuinielaController(model, view);

        view.setQuinielaController(controller);
        controller.init();
    }
}