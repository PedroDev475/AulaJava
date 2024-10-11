import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo5AULA8 {
    public static  void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("src\\arquivo.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Texto a ser gravado no arquivo buffer");
            bufferedWriter.close();
        } catch (IOException e){
            throw new RuntimeException(e);

        }
    }
}


