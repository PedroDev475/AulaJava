import java.util.Scanner;

public class DescontoCompra {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor da compra
        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        // Variável para armazenar o valor final após possível desconto
        double valorFinal;

        // Verifica se o valor da compra é maior que R$100
        if (valorCompra > 100) {
            // Aplica 10% de desconto
            valorFinal = valorCompra * 0.90;
            System.out.println("Desconto de 10% aplicado.");
        } else {
            // Sem desconto
            valorFinal = valorCompra;
            System.out.println("Sem desconto.");
        }

        // Exibe o valor final a ser pago
        System.out.printf("O valor final a ser pago é: R$ %.2f\n", valorFinal);

        // Fecha o scanner
        scanner.close();
    }
}
