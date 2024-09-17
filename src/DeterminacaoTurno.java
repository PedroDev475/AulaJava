import java.util.Scanner;

public class DeterminacaoTurno {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a hora atual do dia (formato 24 horas)
        System.out.print("Digite a hora atual (0 a 23): ");
        int hora = scanner.nextInt();

        // Verifica em qual turno a hora se encaixa
        if (hora >= 5 && hora < 12) {
            System.out.println("Manhã");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Tarde");
        } else if (hora >= 18 && hora < 22) {
            System.out.println("Noite");
        } else if ((hora >= 22 && hora <= 23) || (hora >= 0 && hora < 5)) {
            System.out.println("Madrugada");
        } else {
            System.out.println("Hora inválida! Por favor, insira um valor entre 0 e 23.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
class avaliacaodesempenho {
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
