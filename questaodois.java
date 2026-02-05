import java.util.Scanner;

public class questaodois {
    
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        double numero = sc.nextDouble();

        if (numero % 2 == 0) {
            System.out.println("O número" +numero+ "é par!");
        } else {
            System.out.println("O número " +numero+ "é impar!");
        }

        sc.close();
    }
}
