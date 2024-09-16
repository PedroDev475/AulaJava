public class CastingExplicito {
    public static void main(String[] args) {
        // Declarando uma variável do tipo double com valor fracionado
        double valorDouble = 42.99;

        // Casting explícito de double para int
        int valorInt = (int) valorDouble;

        // Exibindo os dois valores
        System.out.println("Valor double: " + valorDouble);
        System.out.println("Valor int (após casting explícito): " + valorInt);
    }
}
