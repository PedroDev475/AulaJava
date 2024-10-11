import java.io.FileWriter;
import java.io.IOException;

public class Exemplo2AULA8 {
    public static void main(String[] args) {
        try {


            FileWriter fileWriter = new FileWriter("C:\\Users\\Aluno\\IdeaProjects\\AulaJava");
            fileWriter.write("Texto a ser gravado no arquivo");
            fileWriter.close();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
