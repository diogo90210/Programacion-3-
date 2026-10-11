package S_4_3;
import java.util.Scanner;

public class fruitStore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MORNING SETUP ===");
        System.out.print("Enter price per kg for Pears (€): ");
        double pearPrice = scanner.nextDouble();

        System.out.print("Enter price per kg for Apples (€): ");
        double applePrice = scanner.nextDouble();

        int customerCounter = 1;

        while (true) {
            System.out.println("\n--- NEW CUSTOMER (#" + customerCounter + ") ---");
            
            System.out.print("Enter kg of Apples to buy: ");
            double appleKg = scanner.nextDouble();

            System.out.print("Enter kg of Pears to buy: ");
            double pearKg = scanner.nextDouble();

            Fruit[] items = new Fruit[2];
            items[0] = new Fruit("Apples", appleKg, applePrice);
            items[1] = new Fruit("Pears", pearKg, pearPrice);

            double totalInvoice = 0.0;

            System.out.println("|-------------------------------------------------------|");
            System.out.println(String.format("| %-40s | %1d |", "Customer", customerCounter));
            System.out.println("|-------------------------------------------------------|");

            for (Fruit item : items) {
                double totalItemPrice = item.getTotalWithVAT();
                totalInvoice += totalItemPrice;

                System.out.println(String.format("| %-8s | %2.0f kg | price/Kg incl. VAT %-4.2f | %-5.2f € |",
                        item.getName(), item.getKilos(), item.getPriceWithVAT(), totalItemPrice));
            }

            System.out.println("|--------------------------------------------------|");
            System.out.println(String.format("| Total incl. VAT %-31.2f € |", totalInvoice));
            System.out.println("|---------------------------------------------------|");

            System.out.print("\nServe next customer? (y/n): ");
            String response = scanner.next();

            if (response.equalsIgnoreCase("n")) {
                System.out.println("Closing register for today. Goodbye!");
                break;
            }

            customerCounter++;
        }

        scanner.close();
    }
}

