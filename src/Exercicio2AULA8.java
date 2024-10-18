
    import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

    public class Exercicio2AULA8 {
        public static void main(String[] args) {
            // Definir o caminho do arquivo
            String caminhoArquivo = "alunos.txt";

            // Tentar abrir e ler o arquivo
            try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))) {
                String linha;
                System.out.println("Lista de alunos:");

                // Ler cada linha do arquivo até o final
                while ((linha = leitor.readLine()) != null) {
                    System.out.println(linha);
                }

            } catch (IOException e) {
                // Tratar exceção caso o arquivo não seja encontrado ou outro erro de I/O
                System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            }
        }
    }


