import java.util.Scanner;

public class do_while{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int op;


        do{
            System.out.println("1-cadastrar");
            System.out.println("2-Listar");
            System.out.println("3-Remover");
            System.out.println("4-Sair");
            System.out.println("Informe a opção: ");

            op=sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("cadastrar");
                    break;
                case 2:
                        System.out.println("listar");
                        break;
                    case 3:
                        System.out.println("Remover");
                        break;
                    case 4:
                        System.out.println("Sair");
                        break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }while(op!=4);
        sc.close();
    }
}