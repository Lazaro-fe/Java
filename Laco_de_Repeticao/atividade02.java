// package Laco_de_Repeticao;
import java.util.Scanner;

public class atividade02 {

    public static void main(String[] args) {
        
        int num = 0;
        Scanner sc = new Scanner(System.in);

        while (num >= 0) { // Se um número for maior ou igual a 0, o sistema continuara rodando, se não encerrará
            System.out.println("Continuando");
            num = sc.nextInt();
        }
        System.out.println("Encerrando");

        sc.close();

    }
    
}
