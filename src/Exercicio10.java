import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int maior = Integer.MIN_VALUE; // Inicializando com o menor valor possível de um inteiro

        // Preenchendo a matriz 3x3 com números fornecidos pelo usuário
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                // Encontrando o maior valor
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        // Exibindo o maior valor armazenado na matriz
        System.out.println("O maior valor na matriz é: " + maior);
    }
}

