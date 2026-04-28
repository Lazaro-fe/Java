import java.util.Scanner;

public class Calculo_de_Posto {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.print("Digite o nome do posto de gasolina: ");
            String nome_de_posto = sc.nextLine();
        }

        for(int h = 0; h < 3; h++){
            System.out.print("Quanto custa o valor da gasolina: R$ ");
            double valor_de_gasolina = sc.nextDouble();
        }
    }
}
