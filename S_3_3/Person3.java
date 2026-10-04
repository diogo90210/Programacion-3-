import java.util.Scanner;

public class Person3 {
    
    private String name;
    private float weightInKg;
    private float heightInCm;

    public Person3() {
        this.name = "Unknown";
        this.weightInKg = 0.0f;
        this.heightInCm = 0.0f;
        }

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
        
    public float getIMC(float weightInKg, float heightInCm){   
        if (this.heightInCm <= 0 || this.weightInKg <= 0){
            System.out.println("Atencion incorret values of weight or height");
            return 0.0f;
        }    
        float heightInMeters = this.heightInCm / 100.0f;

        return this.weightInKg / (heightInMeters * heightInMeters);
    }

    public static void main (String arg[]){
        Scanner scanner = new Scanner(System.in);
        Person3[] personas = new Person3[3];

        for (int i = 0; i<3; i++){
            personas[i] = new Person3();
            System.out.println("\n--- Fecha da persona" + (i+1) + "---");

            System.out.println("Name: ");
            personas[i].setName(scanner.nextLine());

            System.out.println("Weight: ");
            personas[i].setweightInKg(Float.parseFloat(scanner.nextLine()));

            System.out.println("Height: ");
            personas[i].setheightInCm(Float.parseFloat(scanner.nextLine()));
        }

        Person3 maisAlto = personas[0];
        Person3 maisPesado = personas[0];

        for (int i = 0; i<3; i++){
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
