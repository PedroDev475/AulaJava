import java.util.Scanner;

public class EscolhaOperacao {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário insira dois números
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Solicita que o usuário escolha uma operação
        System.out.println("Escolha a operação: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int escolha = scanner.nextInt();

        // Variável para armazenar o resultado
        double resultado;

        // Utiliza switch para realizar a operação escolhida
        switch (escolha) {
            case 1:
                resultado = num1 + num2;
                System.out.printf("Resultado da soma: %.2f\n", resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.printf("Resultado da subtração: %.2f\n", resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.printf("Resultado da multiplicação: %.2f\n", resultado);
                break;
            case 4:
                // Verifica se o segundo número é zero para evitar divisão por zero
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.printf("Resultado da divisão: %.2f\n", resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Escolha inválida! Por favor, insira um número entre 1 e 4.");
                break;
        }

        // Fecha o scanner
        scanner.close();
    }
}
