import java.util.Scanner;

public class EntradaDados {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Informe o nome:");
        String nome = sc.next();
        System.out.println("Informe sua idade:");
        int idade= sc.nextInt();

        System.out.println("Olá " +nome+ " sua idade é" +idade);

        // fechar o Scanner
        sc.close();
    }
}
