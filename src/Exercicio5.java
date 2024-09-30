import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[3];

        // Armazenando 3 nomes no vetor de Strings
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = scanner.nextLine();
        }

        // Perguntando ao usuário qual nome deseja verificar
        System.out.print("Digite o nome que deseja verificar: ");
        String nomeVerificar = scanner.nextLine();

        // Verificando se o nome está presente no vetor
        boolean encontrado = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomeVerificar)) { // Ignorando maiúsculas/minúsculas na comparação
                encontrado = true;
                break;
            }
        }

        // Exibindo o resultado
        if (encontrado) {
            System.out.println("O nome '" + nomeVerificar + "' está presente no vetor.");
        } else {
            System.out.println("O nome '" + nomeVerificar + "' não está presente no vetor.");
        }
    }
}

