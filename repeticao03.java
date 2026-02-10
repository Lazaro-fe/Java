import java.util.Scanner;

public class repeticao03 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x = 0;

        while (x != 10) {
            System.out.println("Digite o número 10 para encerrar: ");
            x = sc.nextInt();
        }
        System.out.println("Programa Encerrado!!");

        sc.close();
    }
}
