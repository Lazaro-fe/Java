import java.util.Scanner;

public class MENU_CANETAS {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int can = 0;

        while (can != 4) {
            System.out.println("===== MENU DE CANETAS =====");
            System.out.println("1 - CANETA ESFEROGRÁFICA");
            System.out.println("2 - CANETA DE GEL");
            System.out.println("3 - CANETA TINTEIRO");
            System.out.println("4 - SAIR");

            System.out.println("Informe a opção escolhida: ");
            can = sc.nextInt();

            switch (can) {
                case 1:
                    System.out.println("Caneta Esferográfica: Econômica e de longa duração.");
                    break;
                case 2:
                    System.out.println("Caneta de Gel: Tinta mais pigmentada e escrita suave.");
                    break;
                case 3:
                    System.out.println("Caneta Tinteiro: Clássica e elegante, usada para caligrafia.");
                    break;
                case 4:
                    System.out.println("Saindo!!");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
        sc.close();
        
    }
}