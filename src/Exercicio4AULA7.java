//Função para converter graus celsius para fahrenhit
public class Exercicio4AULA7 {
    public static void main(String[] args) {
     double converter = converterCelciusParaFahrenhit (30);
        System.out.println(converter);
    }

    public static double converterCelciusParaFahrenhit (int i) {
        return 30 * 9/5 +32;
    }
}
