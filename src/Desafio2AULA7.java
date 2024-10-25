import java.io.OptionalDataException;
import java.util.Scanner;

public class Desafio2AULA7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cabecalho = {"ID", "NOME", "TELEFONE", "E-MAIL"};
        String[][] mCadastro = {null};
        int opcao;
        do {
            System.out.println("ESCOLHA UMA OPÇÃO:");
            System.out.println("1 - PARA CADASTRA USUÁRIO");
            System.out.println("2 - PARA EXIBIR USUÁRIO");
            System.out.println("3 - PARA ATUALIZAR USUÁRIO");
            System.out.println("4 - PARA DELETAR USUÁRIO");
            System.out.println("5 - PARA SAIR");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    mCadastro = exibirCadastro(cabecalho);
                    break;
                case 2:
                    exibirCadastro(cabecalho);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("DIM DO PROGRAMA");
                    scanner.close();
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA");
                    break;
            }
        } while (opcao != 5);
        exibirCadastro(cabecalho);
        exibirCadastro(cabecalho);
    }

    private static String[][] exibirCadastro(String[] cabecalho) {
        Scanner sacaner = new Scanner(System.in);
        System.out.print("\nQUANTAS PESSOAS VC DESEJA CADASTRAR NO SISTEMA:\t");
        int pessoasDoSistema = 0;
        String[][] mCadastro = new String[pessoasDoSistema + 1][cabecalho.length];
        mCadastro[0] = cabecalho;
        int linhas = 0;

        double[][] matrizCadastro = new double[0][];
        for (int Linhas = 0; linhas < matrizCadastro.length; linhas++) {
            double[][] novaMatriz = new double[0][];
            for (int colunas = 0; colunas < matrizCadastro[0].length; colunas++)
                novaMatriz[linhas][colunas] = matrizCadastro[linhas][colunas];
        
        }

            System.out.println("\nPREENCHA OS DADOS A SEGUIR:\t");
        for (linhas = 1; linhas < mCadastro.length; linhas++) {
            for (int colunas = 0; colunas < cabecalho.length; colunas++) {
                System.out.println(cabecalho[colunas] + ":");
                mCadastro[linhas][colunas] = sacaner.nextLine();
            }
        }

        return mCadastro;
    }
}
    


