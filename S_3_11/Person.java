package S_3_11;

import java.util.Scanner;

public class Person {
    
    private String name = "name1";
    private DNI dni;
    private float weightInKg = 0.0f;
    private float heightInCm = 0.0f;

    public Person() {
        this.name = "Unknown";
        this.weightInKg = 0.0f;
        this.heightInCm = 0.0f;
        this.dni = new DNI("00000000");
        }

    public Person(String name, String numeroDNI, float weightInKg, float heightInCm) {
        this.name = name;
        this.dni = new DNI(numeroDNI);
        this.weightInKg = weightInKg;
        this.heightInCm = heightInCm;
    }

    public String getName() {
        return this.name;
        }

    public void setName(String name) {
        this.name = name;
    }

    public DNI getDNI() {
        return this.dni;
    }

    public void setDNI(DNI dni) {
        this.dni = dni;
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
        
    public float getIMC(){   
        if (this.heightInCm <= 0 || this.weightInKg <= 0){
            System.err.println("Atencion incorret values of weight or height");
            return 0.0f;
        }    
        float heightInMeters = this.heightInCm / 100.0f;
        return this.weightInKg / (heightInMeters * heightInMeters);
    }

    public static void main (String arg[]){
        Scanner scanner = new Scanner(System.in);
        Person[] personas = new Person[3];

        for (int i = 0; i<3; i++){
            personas[i] = new Person();
            System.out.println("\n--- Fecha da persona" + (i+1) + "---");

            System.out.println("Name: ");
            personas[i].setName(scanner.nextLine());

            System.out.println("DNI: ");
            personas[i].setDNI(new DNI(scanner.nextLine()));

            System.out.println("Weight: ");
            personas[i].setweightInKg(Float.parseFloat(scanner.nextLine()));

            System.out.println("Height: ");
            personas[i].setheightInCm(Float.parseFloat(scanner.nextLine()));
        }

        Person maisAlto = personas[0];
        Person maisPesado = personas[0];

        for (int i = 0; i<3; i++){
            System.out.printf("%s (DNI: %s-%c) -> IMC de %s: %.2f%n", personas[i].getName(), personas[i].getDNI().getNumero(), personas[i].getDNI().getLetra(), personas[i].getName(), personas[i].getIMC());
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

