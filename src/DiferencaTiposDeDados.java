public class DiferencaTiposDeDados {
    public static void main(String[] args) {
        // Declaração de uma variável do tipo short e atribuição de um valor
        short valorShort = 120;

        // Casting implícito: short para int (automático)
        int valorInt = valorShort;

        // Casting explícito: short para byte (manual)
        byte valorByte = (byte) valorShort;

        // Exibindo os valores no console
        System.out.println("Valor short: " + valorShort);
        System.out.println("Valor int (após casting implícito): " + valorInt);
        System.out.println("Valor byte (após casting explícito): " + valorByte);
    }
}

