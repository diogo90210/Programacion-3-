package S_4_1;

public class Calculater {
    
    public static void main (String [] args ) {
        if (args.length != 2) {
            System.err.println("Error: You need to introduce 2 numbers");
            return;
        }
        try {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
        
            double result = a + b;
            System.out.println(a + "+" + b + "=" + result);
        
        } catch (NumberFormatException e) {
            System.err.println("Error: You must introduce a valid number");
        }
        }

}
