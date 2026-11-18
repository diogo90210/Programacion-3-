package S_2_1;
import java.util.Scanner;

public class Nascimento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua data de nascimento (dd/mm/aaaa): ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Digite a data atual (dd/mm/aaaa): ");
        String dataAtual = scanner.nextLine();

        calcularIdade(dataNascimento, dataAtual);
        scanner.close();
    }

    public static void calcularIdade(String dataNascimento, String dataAtual) {
        String[] partesNascimento = dataNascimento.split("/");
        String[] partesAtual = dataAtual.split("/");

        int diaNascimento = Integer.parseInt(partesNascimento[0]);
        int mesNascimento = Integer.parseInt(partesNascimento[1]);
        int anoNascimento = Integer.parseInt(partesNascimento[2]);

        int diaAtual = Integer.parseInt(partesAtual[0]);
        int mesAtual = Integer.parseInt(partesAtual[1]);
        int anoAtual = Integer.parseInt(partesAtual[2]);

        int idade = anoAtual - anoNascimento;

        if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
            idade--;
        }

        System.out.println("Sua idade é: " + idade + " anos.");
    }
}
