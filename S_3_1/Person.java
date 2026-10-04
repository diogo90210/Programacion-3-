import java.util.Scanner;

public class Person {
    
    private String name;
    private float weightInKg;
    private float heightInCm;

    

    public String getName() {
        return this.name;
        }
        public void setName(String name) {
        this.name = name;
        }

    public float getweightInKg() {
        return this.weightInKg;
        }
        public void setweightInKg(float weightInKg) {
        this.weightInKg = weightInKg;
        }
            
    public float getheightInCm() {
        return this.heightInCm;
        }
        public void setheightInCm(float heightInCm) {
        this.heightInCm = heightInCm;
        }        

    public static void main (String arg[]){
        Scanner scanner = new Scanner(System.in);
        Person[] personas = new Person[3];

        for (int i = 0; i < 3; i++){
            personas[i] = new Person();
            System.out.println("\n--- Fecha da persona" + (i+1) + "---");

            System.out.println("Name: ");
            personas[i].setName(scanner.nextLine());

            System.out.println("Weight: ");
            personas[i].setweightInKg(Float.parseFloat(scanner.nextLine()));

            System.out.println("Height: ");
            personas[i].setheightInCm(Float.parseFloat(scanner.nextLine()));
        }

        Person maisAlto = personas[0];
        Person maisPesado = personas[0];

        for (int i = 0; i < 3; i++){
            if(personas[i].getheightInCm() > maisAlto.getheightInCm()){
                maisAlto = personas[i];
            }
            if(personas[i].getweightInKg() > maisPesado.getweightInKg()){
                maisPesado = personas[i];
            }
        }


        System.out.println("Persona mais Alta: " + maisAlto.getName() + "Mede: " + maisAlto.getheightInCm() + " cm");
        System.out.println("Persona mais Pesada:" + maisPesado.getName() + "Pesa:" + maisPesado.getweightInKg() + " kg");

        scanner.close();
    }
}
