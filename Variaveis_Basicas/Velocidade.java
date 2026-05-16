package Variaveis_Basicas;
import java.util.Scanner;

public class Velocidade {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double velocidade_km_por_h;

        // O usuário deve digitar a velocidade em km/h
        System.out.print("Digite uma velocidade em km/h : ");
        velocidade_km_por_h = sc.nextDouble();

        // Nessa etapa será realizada a conversão de km/h para m/s
        double conversao_de_kmh_por_ms = velocidade_km_por_h / 3.6;

        System.out.println("\n=== CONVERSÃO DE KM/H PARA M/S");
        System.out.println("Velocidade em KM/H: " + velocidade_km_por_h);
        System.out.println("Velcoidade em M/S: " +conversao_de_kmh_por_ms);
        sc.close();
    }
}
