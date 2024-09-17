import java.util.Scanner;

public class ClassificacaoProduto {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o código do produto
        System.out.print("Digite o código do produto (1 - Eletrônicos, 2 - Alimentos, 3 - Vestuário): ");
        int codigoProduto = scanner.nextInt();

        // Utiliza a estrutura switch para classificar o produto
        switch (codigoProduto) {
            case 1:
                System.out.println("Categoria: Eletrônicos");
                break;
            case 2:
                System.out.println("Categoria: Alimentos");
                break;
            case 3:
                System.out.println("Categoria: Vestuário");
                break;
            default:
                System.out.println("Código inválido! Por favor, insira um código entre 1 e 3.");
                break;
        }

        // Fecha o scanner
        scanner.close();
    }
}
