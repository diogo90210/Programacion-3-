package S_7_1;
import S_7_1.controller.CalculatorController;
import S_7_1.model.Calculator;
import S_7_1.view.CalculatorView;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(calculator, view);
        
        view.setController(controller);
        controller.init();
    }
}
