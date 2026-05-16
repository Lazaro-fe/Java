import java.util.Scanner;

public class Soma_de_numeros {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma_de_num = 0; // Crio essa variável para guardar a soma dos números

        // Crio o laço de repetição para não precisar criar dois sysout
        // Defino a quantidade de vezes o laço irá rodar
        for(int i = 0; i < 2; i++){
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            // Realizar a soma dos números
            soma_de_num += numero;
        }

        System.out.println("=== SOMA DE NÚMEROS ===");
        System.out.println("Soma dos números: " +soma_de_num);
        sc.close();
    }
}
