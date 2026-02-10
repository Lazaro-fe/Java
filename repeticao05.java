import java.util.Scanner;

public class repeticao05 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int op = 0;
        while (op != 4 && op!=3 && op!=2 && op!=1) {
            System.out.println("=======Menu ========");
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - LISTAR");
            System.out.println("3 - REMOVER");
            System.out.println("4 - SAIR");

            System.out.println("Informe a opção escolhida: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("CADASTRO");
    
                    break;
                case 2:
                    System.out.println("LISTANDO");
    
                    break;
                case 3:
                    System.out.println("REMOVENDO");
    
                    break;
                case 4:
                    System.out.println("SAINDO");
    
                    break;
                default:
                    System.out.println("Opcão Inválida!");
                    break;
            }
        }
        sc.close();
    }
}
