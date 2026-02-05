import java.util.Scanner;

public class questaocinco {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String senha_cadastrada = "1247til";
        
        System.out.println("Digite a senha: ");
        String senha = sc.nextLine();

        if (senha.equals(senha_cadastrada)) {
            System.out.println("Porta Aberta");
        } else {
            System.out.println("Porta Fechada");
        }

        sc.close();
    }
}
