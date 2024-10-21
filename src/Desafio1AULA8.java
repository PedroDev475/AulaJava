import java.io.*;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Desafio1AULA8 {
    public static void main(String[] args) throws IOException {
        File arquivo = new File("C:\\Users\\Aluno\\IdeaProjects\\AulaJava\\src\\arquivo.txt");
        int caracter = 0;
        if (arquivo.exists()) {
            System.out.println("Faça seu cadastro ");
            String linha = "ID:1;Nome:Pedro;Idade:25;Email:pedro@gmail123.com";
            String[]tokens = linha.split(";");
            for (String token : tokens){
                System.out.println(token);
                Scanner scanner = new Scanner(System.in);

                String[][] matriz = new String[4][4];
                matriz[0][0] = "Nome";
                matriz[1][1] = "Idade";
                matriz[2][2] =  "Email";
                matriz[3][3] =  "ID";
                System.out.println(" [0][3]:" + matriz [0][3]);




            }

            }


            try {
                if (arquivo.exists()) {
                    FileReader fileReader = new FileReader(arquivo);
                    while ((caracter = fileReader.read()) != -1)
                        System.out.print((char) caracter);

                } else {
                    arquivo.createNewFile();

                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {

                FileWriter writer = new FileWriter("C:\\Users\\Aluno\\IdeaProjects\\AulaJava\\src\\arquivo.txt");
               writer.write("Cadastro feito");
               writer.close();
               FileReader reader = new FileReader("C:\\Users\\Aluno\\IdeaProjects\\AulaJava\\src\\arquivo.txt");
               int character;
               while ((character = reader.read())!= -1){
                   System.out.print((char)character);
               }
               reader.close();
            } catch (IOException e) {
                e.printStackTrace();

            }



        }
    }






























































