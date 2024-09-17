import java.util.Scanner;

public class CalculoHorasExtras {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a quantidade de horas trabalhadas e o valor da hora normal
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o valor da hora normal: R$ ");
        double valorHoraNormal = scanner.nextDouble();

        // Variável para armazenar o valor a ser pago pelas horas extras
        double valorHorasExtras = 0;

        // Verifica se houve horas extras
        if (horasTrabalhadas > 40) {
            int horasExtras = horasTrabalhadas - 40;
            valorHorasExtras = horasExtras * (valorHoraNormal * 1.5); // Hora extra = 50% a mais
            System.out.printf("Você trabalhou %d horas extras.\n", horasExtras);
        } else {
            System.out.println("Nenhuma hora extra foi trabalhada.");
        }

        // Exibe o valor a ser pago pelas horas extras, se houver
        if (valorHorasExtras > 0) {
            System.out.printf("O valor a ser pago pelas horas extras é: R$ %.2f\n", valorHorasExtras);
        }

        // Fecha o scanner
        scanner.close();
    }
}
