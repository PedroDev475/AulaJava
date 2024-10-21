import java.util.Scanner;

public class DesafioAULA6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite a quantidade de pessoas a serem cadastradas");
        int qtdPesssoas = scanner.nextInt();
        scanner.nextLine();
        String [] cabecalho = {"ID","Nome","Telefone","Email , Informaçao"};
        String[][] matrizCadastro =  new String[qtdPesssoas+1 ][4];
        matrizCadastro[0] = cabecalho;

        System.out.println("Preeencha os dados a seguir: ");

        for (int linhas = 0; linhas <   matrizCadastro.length ; linhas++) {
            System.out.println("ID - ");
            matrizCadastro[linhas] [0]=scanner.nextLine();
            System.out.println("Nome - ");
            matrizCadastro[linhas] [1]=scanner.nextLine();
            System.out.println("Telefone - ");
            matrizCadastro[linhas] [2]=scanner.nextLine();
            System.out.println("Email - ");
            matrizCadastro[linhas] [3]=scanner.nextLine();


        }
        for (int linhas = 0; linhas <matrizCadastro.length; linhas++) {
            System.out.println(matrizCadastro[linhas][0]+"\t"+matrizCadastro[linhas][1]+
                    "\t\t\t"+matrizCadastro[linhas][2]+"\t\t\t"+matrizCadastro[linhas][3]);

        }

    }
}
