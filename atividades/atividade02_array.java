// package atividades;
import java.util.Scanner;

public class atividade02_array {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String [] carros = new String[10];

        for (int i = 0; i<carros.length; i++){
            System.out.println();
            System.out.println("Informe os nomes de carros:");
            carros[i] = sc.nextLine();
        }

        System.out.println("======= Nomes de carros cadastrados são: =======");
        System.out.println();

        for(int i=0; i<carros.length; i++){
            System.out.println(carros[i]);
        }

        sc.close();
    }
}