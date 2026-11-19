package S_7_1.model;

public class Calculator {
    private int a;
    private int b;
    private int result;


    public void setNumbers (int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add () {
        return this.result = a + b;
    }

    public int getResult () {
        return this.result;
    }



}
