import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "Pedro", digitada="";
        while (nome.equals (digitada)) {
            System.out.println("Digite seu nome");
            digitada = scanner.next();
        }
            System.out.println("Parabens esse é seu nome");

        }

    }




