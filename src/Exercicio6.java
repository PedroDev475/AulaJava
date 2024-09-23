import java.util.Scanner;

// Exibição dos primeiros 10 números da sequência de Fibonacci
public class Exercicio6 {
    public static void main(String[] args) {
        int a = 0, b = 1, contador = 0;

        while (contador < 10) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
            contador++;
        }
    }
}
// Validação de entrada de uma nota entre 0 e 10
import java.util.Scanner;

