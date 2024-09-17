import java.util.Scanner;

public class VerificacaoAcesso {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário insira a idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Verifica se o usuário tem idade suficiente para acessar o sistema
        if (idade >= 18) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado. Você deve ter 18 anos ou mais.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
