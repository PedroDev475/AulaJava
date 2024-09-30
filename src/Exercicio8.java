import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matriz = new double[2][2];

        // Preenchendo a matriz 2x2 com valores fornecidos pelo usuário
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        // Exibindo a soma dos valores de cada linha
        for (int i = 0; i < 2; i++) {
            double somaLinha = 0;
            for (int j = 0; j < 2; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.printf("A soma dos valores da linha %d é: %.2f\n", i + 1, somaLinha);
        }
    }
}

