import java.util.Scanner;

public class Calculo_de_Posto {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma_dos_precos = 0; // Defino a soma dos preços como 0, pois ele irá somar o números digitados e acumula-los
        int quantida_de_postos= 3;

        // Peço ao usuário que digite o valor da gasolina
        for(int h = 0; h < 3; h++){
            System.out.print("Quanto custa o valor da gasolina: R$ ");
            double valor_de_gasolina = sc.nextDouble();

            sc.nextLine();
            
            // Realizará a soma dos valores da gasolina nos postos
            soma_dos_precos = soma_dos_precos +  valor_de_gasolina;
        }

        // Faz a média de preços de gasolna, pegando a soma dos preços dos postos e dividindo-as pela quantidade de postos
        double media_de_precos = soma_dos_precos / quantida_de_postos;

        // Mostrando o resultado da média
        System.out.println("=== MÉDIA DO PREÇO DA GASOLINA ===");
        System.out.println("Média de preços: R$ " + media_de_precos);

        // Fechamento de scanner
        sc.close();
    }
}
