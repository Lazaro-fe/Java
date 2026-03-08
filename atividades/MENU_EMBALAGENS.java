// package atividades;
import java.util.Scanner;

public class MENU_EMBALAGENS {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int men = 0;
        while (men != 4) {
            System.out.println("====== MENU =====");
            System.out.println("1 - Caixa de Papelão");
            System.out.println("2 - Sacola Plástica");
            System.out.println("3 - Embalagem de vidro");
            System.out.println("4 - Sair");
            
            System.out.println("Digite a opção deseja:");
            men = sc.nextInt();

            switch (men) {
                case 1:
                    System.out.println("Ideal para transporte e armazenamento");
                    break;
                case 2:
                    System.out.println("Leve e prática, mas pouco sustentável");
                    break;
                case 3:
                    System.out.println("Resistente e Reutilizável");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente!!");
                    break;
            }
        }
        sc.close();
    }
}
