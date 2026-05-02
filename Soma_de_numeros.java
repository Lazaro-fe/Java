import java.util.Scanner;

public class Soma_de_numeros {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma_de_num = 0;

        for(int i = 0; i < 2; i++){
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            soma_de_num += numero;
        }

        System.out.println("=== SOMA DE NÚMEROS ===");
        System.out.println("Soma dos números: " +soma_de_num);
        sc.close();
    }
}
