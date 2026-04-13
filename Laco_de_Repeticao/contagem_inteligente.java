// package Laco_de_Repeticao;
import java.util.Scanner;

public class contagem_inteligente {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
        int num_final;

        System.out.println("Digite o número que deve-se iniciar a contagem:");
        num = sc.nextInt();

        System.out.println("Digite o último número:");
        num_final = sc.nextInt();

        System.out.println("=================================");
        System.out.println("         INICIANDO CONTAGEM      ");
        System.out.println("=================================");
        
        // Primeiro jeito que fiz essa atividade, mas ocorre um erro ao colocar um número
        // Maior no inicio e o menor no final
        // for (int i = num; i>num_final; i--){
        //    System.out.println(i);
        // }

        if (num <= num_final) {
            while (num <= num_final) {
                System.out.println(num);
                num++;
            } 
        }
        else {
            while (num >= num_final) {
                System.out.println(num);
                num--;
            }
        }
        
        sc.close();
    }
}