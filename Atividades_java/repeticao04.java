import java.util.Scanner;

public class repeticao04 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String resp = "sim";

        while (resp.equalsIgnoreCase("sim")) {
            System.out.println("Continuando Processo!!");

            System.out.println("Deseja continuar sim/não ?");
            resp = sc.nextLine();
        }
        
        System.out.println("Processo Encerrado!!");

        sc.close();
    }
}