package Variaveis_Basicas;
import java.util.Scanner;

public class Atividade_01 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("Digite o número: ");
        numero1 = sc.nextInt();

        System.out.println("Digite um número: ");
        numero2 = sc.nextInt();

        int soma = numero1 + numero2;

        System.out.println("\n=== RESULTADOS ===");
        System.out.println("1° númro: " +numero1);
        System.out.println("2° númro: " +numero2);
        System.out.println("Soma de números: " +soma);

        sc.close();
    }
}
