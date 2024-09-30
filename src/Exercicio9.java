import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int contagemPares = 0;

        // Preenchendo a matriz 4x4 com números fornecidos pelo usuário
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                // Verificando se o número é par
                if (matriz[i][j] % 2 == 0) {
                    contagemPares++;
                }
            }
        }

        // Exibindo a quantidade de números pares na matriz
        System.out.println("A quantidade de números pares na matriz é: " + contagemPares);
    }
}
