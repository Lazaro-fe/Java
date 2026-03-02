import java.util.Scanner;

public class questao4 {
    
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        double idade = sc.nextDouble();

        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }

        sc.close();
    }
}
