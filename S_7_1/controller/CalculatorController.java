package S_7_1.controller;

import S_7_1.model.Calculator;
import S_7_1.view.CalculatorView;


public class CalculatorController {
    private Calculator calculator;
    private CalculatorView view;

    public CalculatorController(Calculator calculator, CalculatorView view) {
        this.calculator = calculator;
        this.view = view;
    }

    public void getNumbers (int a, int b){
        calculator.setNumbers(a, b);
    }

    public void addNumbers () {
        calculator.add();
    }

    public int getResult(){
        return calculator.getResult();
    }

    public void init() {
    view.displayMenu();
}

}
