import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int num = scanner.nextInt();
        int fatorial = 1;

        do {
            fatorial *= num;
            num--;
        } while (num > 1);

        System.out.println("O fatorial é: " + fatorial);
        scanner.close();
    }
}
