package S_5_2;
import java.util.Arrays;
import java.util.Scanner;

public class OrderStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavras[] = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce la palabra " + (i + 1) + ": ");
            palavras[i] = scanner.nextLine();
        }

        Arrays.sort(palavras);

        System.out.println("Palabras ordenadas:");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }

        scanner.close();
    }

}
