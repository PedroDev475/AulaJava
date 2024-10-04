public class Exemplo2AULA7 {
    public static void main(String[] args) {
        ExemploAULA7.funcaoSemParametrosSemRetorno();

        funcaoComParametrosSemRetorno(5,"teste");
    }
    static void funcaoComParametrosSemRetorno(int parametro1,String parametro2){
        System.out.println("parametro1 =" + parametro1);
        System.out.println("parametro2 =" + parametro2);
    }
}
