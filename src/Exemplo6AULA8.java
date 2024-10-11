


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo6AULA8 {

    public static  void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("src\\arquivo.txt");
            BufferedWriter bufferedWriteriter = new BufferedWriter(fileWriter);
            BufferedWriter bufferedWriter = new BufferedWriter(e);


        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}



