import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Por favor, insira um valor entre 0 e 10.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("A nota válida inserida é: " + nota);
        scanner.close();
    }
}
// Contagem de números pares e ímpares
import java.util.Scanner;

