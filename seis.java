import java.util.Scanner;

public class seis {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        int num;

        do{
            System.out.println("===== Menu ======");
            System.out.println("0 - Sair");
            System.out.println("1 - Calcular");
            System.out.println("2 - Realizar Contagem Regressiva");
            System.out.println("");
            System.out.println("Informe a opção: ");

            op = sc.nextInt();
            switch ((op)) {
                case 1:
                    System.out.println("Digite um número");
                    num = sc.nextInt();
                    for(int i = 1; i <=10; i++){
                        
                    }
                    break;
                case 2:

                    break;
                default:
                    break;
            }
        }
    }
}