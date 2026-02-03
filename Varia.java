import java.util.Locale;

public class Varia {
    public static void main (String [] args){
        double x = 10.35784;

        // Imprime o número puro (sempre com ponto, padrão do tipo double)
        System.out.println(x);

        // Imprime formatado com 2 casas decimais (usa a vírgula se seu PC estiver em PT-BR)
        System.out.printf("%.2f%n", x);

        // Imprime formatado com 4 casas decimais
        System.out.printf("%.4f%n", x);

        // Define o padrão americano (ponto para decimais)
        Locale.setDefault(Locale.US);

        // Imprime novamente com 4 casas, agora usando ponto
        System.out.printf("%.4f%n", x);

        System.out.println("RESULTADO =" +x+ "METROS");

        System.out.printf("RESULTADO = %2,f metros%n", x);

    }
}
