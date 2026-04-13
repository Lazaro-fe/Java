// package Laco_de_Repeticao;
import java.util.Scanner;

public class MENU_MOCHILAS {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mochi = 0;
        while(mochi !=  4){
            System.out.println("========== MENU DE MOCHILAS ==========");
            System.out.println("1 - MOCHILA ESCOLAR");
            System.out.println("2 - MOCHILA DE VIAGEM");
            System.out.println("3 - MOCHILA ESPORTIVA");
            System.out.println("4 - SAIR");
            System.out.println();

            System.out.println("Digite a opção de mochila desejada:");
            mochi = sc.nextInt();

            switch (mochi) {
                case 1:
                    System.out.println("Compacta e ideal para estudantes");
                    break;
                case 2:
                    System.out.println("Espaçosa, ideal para longas jornadas ");
                    break;
                case 3:
                    System.out.println("Leve, resistente e ergonômica");
                    break;
                case 4:
                    System.out.println("Saindo do Sistema!!\n Tente Novamente!!");
                    break;
                default:
                    System.out.println("Opção Inválida!\n Renicie o sistema novamente!!");
                    break;
            }
        }
        sc.close();
    }
}
