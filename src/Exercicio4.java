import java.util.Scanner;
public class Exercicio4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double[] notas = new double[4];
            double soma = 0.0;

            // Armazenando 4 notas
            for (int i = 0; i < 4; i++) {
                System.out.print("Digite a " + (i + 1) + "ª nota: ");
                notas[i] = scanner.nextDouble();
                soma += notas[i]; // Somando as notas
            }

            // Calculando e exibindo a média
            double media = soma / 4;
            System.out.printf("A média das notas é: %.2f\n", media);
        }
    }



