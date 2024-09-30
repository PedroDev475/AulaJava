import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][2];
        String valorMatriz = "matriz {";

        for (int linha = 0; linha < matriz.length; linha++){



            valorMatriz += "\t{";

            linha = 0;
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o valor da posição [" + linha + "," + coluna + "] =");
                matriz[linha][coluna] = scanner.nextInt();

                valorMatriz += matriz[linha][coluna];
                valorMatriz += coluna < matriz[linha].length - 1 ? "," : "}";

            }
            valorMatriz += linha < (matriz[linha].length - 1) ? ",\n": "\n";

            System.out.println(valorMatriz);

        }




    }
    }
