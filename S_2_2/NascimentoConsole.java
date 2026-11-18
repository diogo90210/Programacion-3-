package S_2_2;

import java.io.Console;

public class NascimentoConsole {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.err.println("Erro: Consola não disponível. Executa este programa a partir de um terminal!");
            return;
        }

        String anoNascStr = console.readLine("Digite o seu ano de nascimento: ");
        int anoNascimento = Integer.parseInt(anoNascStr);

        String anoAtualStr = console.readLine("Digite o ano atual: ");
        int anoAtual = Integer.parseInt(anoAtualStr);

        int idade = anoAtual - anoNascimento;
        console.printf("A sua idade é: %d anos.%n", idade);
    }
}