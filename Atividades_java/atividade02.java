import java.util.Scanner;

public class atividade02 {

    public static void main(String[] args) {
        
        int num = 0;
        Scanner sc = new Scanner(System.in);

        while (num >= 0) {
            System.out.println("Continuando");
            num = sc.nextInt();
        }
        System.out.println("Encerrando");

        sc.close();

    }
    
}
