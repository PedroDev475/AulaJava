import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] valores = new boolean[8];
        int contagemTrue = 0;

        // Armazenando 8 valores booleanos
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite true ou false para a posição " + (i + 1) + ": ");
            valores[i] = scanner.nextBoolean();

            // Contando quantos valores true foram inseridos
            if (valores[i]) {
                contagemTrue++;
            }
        }

        // Exibindo o resultado
        System.out.println("O número de valores true inseridos foi: " + contagemTrue);
    }
}


