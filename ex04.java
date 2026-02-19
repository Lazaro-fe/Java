import java.util.Scanner;

public class ex04 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=3; i++){
            System.out.println("Informe o número" );
            int num = sc.nextInt();
            System.out.println("Numero é: " +num);
        }
        sc.close();
    }
}
