package S_7_2;

import S_7_2.controller.AlmacenController;
import S_7_2.model.AlmacenModel;
import S_7_2.view.AlmacenView;

public class main {
    public static void main (String[] args) {
        AlmacenModel model = new AlmacenModel();
        AlmacenView view = new AlmacenView();
        AlmacenController controller = new AlmacenController(model, view);

        view.setController(controller);
        controller.init();
    }
}