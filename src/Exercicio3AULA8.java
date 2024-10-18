
    import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

    public class Exercicio3AULA8 {
        public static void main(String[] args) {
            // Definir os caminhos dos arquivos de origem e destino
            String arquivoOrigem = "alunos.txt";
            String arquivoDestino = "backup_alunos.txt";

            // Tentar abrir o arquivo de origem e o arquivo de destino
            try (BufferedReader leitor = new BufferedReader(new FileReader(arquivoOrigem));
                 BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoDestino))) {

                String linha;

                // Ler cada linha do arquivo de origem e escrever no arquivo de destino
                while ((linha = leitor.readLine()) != null) {
                    escritor.write(linha);
                    escritor.newLine();  // Adicionar uma nova linha após escrever cada linha
                }

                System.out.println("Arquivo copiado com sucesso!");

            } catch (IOException e) {
                // Tratar exceções caso ocorra um erro de leitura ou escrita
                System.out.println("Erro ao copiar o arquivo: " + e.getMessage());
            }
        }
    }


