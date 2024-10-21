import java.util.Scanner;

public class Desafio2Flexivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite a quantidade de pessoas a serem cadastradas");
        int qtdPesssoas = scanner.nextInt();
        scanner.nextLine();
        String [] cabecalho = {"ID","Nome","Telefone"};
        String[][] matrizCadastro =  new String[qtdPesssoas+1 ][cabecalho.length];
        matrizCadastro[0] = cabecalho;

        System.out.println("Preeencha os dados a seguir: ");

        for (int linhas = 1; linhas <   matrizCadastro.length ; linhas++) {
            for (int colunas = 0; colunas < cabecalho.length; colunas++) {
                System.out.println(cabecalho[colunas]+": ");
                matrizCadastro[linhas] [colunas]=scanner.nextLine();

            }

        }
        cadastarusuario()
        String tabela ="";
        for (int linhas = 0; linhas <matrizCadastro.length; linhas++) {
            for (int colunas = 0; colunas < cabecalho.length; colunas++) {
                tabela += matrizCadastro[linhas][colunas];
                tabela += colunas == 0 ? "\t" : "\t\t\t";

            }
            tabela += "\n";
        }
        System.out.println(tabela);

        }

    private static void cadastarusuario() {
    }

}




