import java.io.File;
import java.io.IOException;

public class ExemploAULA8 {
    public static void main(String[] args) {

       File arquivo = new File("C:\\Users\\Aluno\\IdeaProjects\\AulaJava\\src\\arquivo.txt");
       if (arquivo.exists()) {
           System.out.println("aquivo existe");
       }else{
           try {
               if (arquivo.createNewFile()) {
                   System.out.println("arquivo criado com sucesso");
               }else{
                   System.out.println("falha ao criar o arquivo");
               }
           } catch (IOException e) {
               throw new RuntimeException(e);
           }
       }
    }

}
