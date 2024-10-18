
    import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

    public class Exercicio1AULA8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Criando um arquivo representado pela classe File
            File arquivo = new File("alunos.txt");

            try {
                // Criando o FileWriter para escrever no arquivo
                FileWriter escritor = new FileWriter(arquivo);

                // Loop para pegar 5 nomes de alunos
                for (int i = 1; i <= 5; i++) {
                    System.out.print("Digite o nome do aluno " + i + ": ");
                    String nome = scanner.nextLine();

                    // Escrevendo o nome no arquivo e adicionando uma nova linha
                    escritor.write(nome + "\n");
                }

                // Fechando o FileWriter
                escritor.close();
                System.out.println("Os nomes foram salvos com sucesso no arquivo " + arquivo.getName());
            } catch (IOException e) {
                // Tratamento de exceção caso haja problemas ao criar ou abrir o arquivo
                System.out.println("Ocorreu um erro ao escrever no arquivo.");
                e.printStackTrace();
            } finally {
                // Fechando o scanner
                scanner.close();
            }
        }
    }


