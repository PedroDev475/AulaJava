import java.util.Scanner;

public class ExerciciosAula6 {
    public static void main(String[] args) {




                Scanner scanner = new Scanner(System.in);
                int[] numeros = new int[5];
                int soma = 0;

                // Armazenando 5 números inteiros
                for (int i = 0; i < 5; i++) {
                    System.out.print("Digite o " + (i + 1) + "º número: ");
                    numeros[i] = scanner.nextInt();
                    soma += numeros[i]; // Somando os elementos
                }

                // Exibindo o resultado
                System.out.println("A soma dos elementos é: " + soma);
            }
        }
