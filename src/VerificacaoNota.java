import java.util.Scanner;

public class VerificacaoNota {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a nota do aluno
        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        // Verifica se o aluno foi aprovado, está em recuperação ou reprovado
        if (nota >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (nota >= 5) {
            System.out.println("Aluno em recuperação.");
        } else {
            System.out.println("Aluno reprovado.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
