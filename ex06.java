import java.util.Scanner;

public class ex06 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número: ");
        int numero = sc.nextInt();

        System.out.println("");

        for (int i=1; i<=10; i++) {
            System.out.println(numero+ "x" +i+ " =" +(numero*i));
        }

        sc.close();
    }
}
