// package atividades;
import java.util.Scanner;

public class cinco {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: "); // Realizando a tabuada de um número especifico
        int numero = sc.nextInt();

        System.out.println("");

        for(int i=1; i<=10; i++) {
            System.out.println(numero+ "x" +i+ "=" +(numero*i));
        }

        sc.close();
    }
}
