import java.util.Scanner;

public class AvaliacaoDesempenho {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a avaliação de desempenho do funcionário
        System.out.print("Digite a avaliação de desempenho (1 a 5): ");
        int avaliacao = scanner.nextInt();

        // Utiliza a estrutura switch para exibir a mensagem de acordo com a avaliação
        switch (avaliacao) {
            case 1:
                System.out.println("Precisa melhorar");
                break;
            case 2:
                System.out.println("Abaixo da média");
                break;
            case 3:
                System.out.println("Média");
                break;
            case 4:
                System.out.println("Acima da média");
                break;
            case 5:
                System.out.println("Excelente");
                break;
            default:
                System.out.println("Avaliação inválida! Por favor, insira um número entre 1 e 5.");
                break;
        }

        // Fecha o scanner
        scanner.close();
    }
}
