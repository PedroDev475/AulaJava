import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] caracteres = new char[6];

        // Armazenando 6 caracteres
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o " + (i + 1) + "º caractere: ");
            caracteres[i] = scanner.next().charAt(0);
        }

        // Perguntando ao usuário uma letra
        System.out.print("Digite uma letra para verificar se está no vetor: ");
        char letra = scanner.next().charAt(0);

        // Verificando se a letra está presente no vetor
        boolean encontrada = false;
        for (char c : caracteres) {
            if (c == letra) {
                encontrada = true;
                break;
            }
        }

        if (encontrada) {
            System.out.println("A letra '" + letra + "' está presente no vetor.");
        } else {
            System.out.println("A letra '" + letra + "' não está presente no vetor.");
        }
    }
}

