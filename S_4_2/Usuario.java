package S_4_2;

public class Usuario {

    private String name;
    private double weight;
    private double height;

    public Usuario (String name, double weight, double height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public double calculateIMC() {
        return weight / (height * height);
    }
    
    public static Usuario criarDoArray(String[] args) {
        if (args.length < 3) {
            throw new IllegalArgumentException(" You must introduce your name, weight and height");
        }
        String name = args[0];
        double weight = Double.parseDouble(args[1]);
        double height = Double.parseDouble(args[2]);
        
        return new Usuario(name, weight, height);
    }
    public static void main(String[] args) {
        if(args.length < 3){
            System.err.println("Error: You need to introduce your name, weight and height");
            return;
        }
        try{
        
        Usuario usuario = criarDoArray(args);
        double imc = usuario.calculateIMC();

        System.out.println("-------------------------------------------------");
            System.out.printf("| %-12s | %-8s | %-8s | %-6s |\n", "Name", "Weight(kg)", "Height(m)", "IMC");
            System.out.println("-------------------------------------------------");
            System.out.printf("| %-12s | %-8.1f | %-8.2f | %-6.2f |\n", usuario.name, usuario.weight, usuario.height, imc);
            System.out.println("-------------------------------------------------");
    } catch (NumberFormatException e){
        System.err.println("Error: the weight and heigth need to be valid numbers");
    } catch (Exception e) {
        System.err.println("Error" + e.getMessage());
    }
}
    
}
