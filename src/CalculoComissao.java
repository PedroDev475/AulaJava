import java.util.Scanner;

public class CalculoComissao {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor das vendas
        System.out.print("Digite o valor das vendas: R$ ");
        double valorVendas = scanner.nextDouble();

        // Variável para armazenar o valor da comissão
        double comissao;

        // Calcula a comissão com base no valor das vendas
        if (valorVendas < 1000) {
            comissao = valorVendas * 0.05; // 5% de comissão
        } else if (valorVendas <= 5000) {
            comissao = valorVendas * 0.10; // 10% de comissão
        } else {
            comissao = valorVendas * 0.15; // 15% de comissão
        }

        // Exibe o valor da comissão
        System.out.printf("O valor da comissão é: R$ %.2f\n", comissao);

        // Fecha o scanner
        scanner.close();
    }
}
