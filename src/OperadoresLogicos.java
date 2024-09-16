public class OperadoresLogicos {
    public static void main(String[] args) {
        // Declaração de variáveis booleanas
        boolean cond1 = true;
        boolean cond2 = false;
        boolean cond3 = true;

        // Utilizando operadores lógicos AND (&&) e OR (||)
        boolean resultadoAND = cond1 && cond2 && cond3;
        boolean resultadoOR = cond1 || cond2 || cond3;

        // Exibindo os resultados das combinações no console
        System.out.println("Resultado AND (cond1 && cond2 && cond3): " + resultadoAND);
        System.out.println("Resultado OR (cond1 || cond2 || cond3): " + resultadoOR);
    }
}
