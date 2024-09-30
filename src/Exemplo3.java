
    import java.util.Scanner;

    public class Exemplo3 {
        public static void main(String[] args) {
            int[] vetor = new int[3];
            Scanner scanner = new Scanner(System.in);
            String valorVetor = "vetor {";

            int posicao;
            for (posicao = 0; posicao < vetor.length; posicao++) {
                ;
                System.out.println("Digite o " + (posicao + 1) + " valor:");
                vetor[posicao] = scanner.nextInt();
                valorVetor += vetor[posicao] + ",";

            }
            valorVetor += "}";
            System.out.println(valorVetor);

            scanner.close();

         // Exemplo 4
            System.out.println("Digite a quantidade de vetores a serem preenchidos");

            int qtdValores = scanner.nextInt();
            vetor = new int[qtdValores];

            for (posicao = 0; posicao < vetor.length; posicao++) {
                System.out.println("Digite o" + (posicao + 1) + "valor");
                vetor[posicao] = scanner.nextInt();
                valorVetor += vetor[posicao];
                valorVetor += posicao < (vetor.length - 1) ? "," : "}";
            }
            System.out.println(valorVetor);

            scanner.close();

            }
        }
