import java.util.Scanner;

public class Road_trip {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Define uma constante de número inteiro
        final int max_onibus = 4;
        final int max_reservas = 20;

        // Frotas de ônibus
        int quantidade = 0;
        int[] numeros_de_onibus = new int[max_onibus];
        int[] numeros_de_assentos_disponiveis = new int[max_onibus];

        // Reservas
        String[] nomes_passageiros = new String[max_reservas];
        int[] onibus_reservado = new int[max_reservas];
        int total_de_reservas = 0;

        boolean onibus_registrado = false;
        boolean assentos_reservados = false;

        int opcao;

        do{
            System.out.println("\n============== ROAD TRIP ============== ");
            System.out.println("1 - Cadastrar ônibus");
            System.out.println("2 - Registar assentos disponíveis por ônibus");
            System.out.println("3 - Reservar passagem");
            System.out.println("4 - Consultar ônibus");
            System.out.println("5 - Consultar passageiro");
            System.out.println("6 - Sair");
            System.out.println();
            System.out.println("Digite a opção que deseja:");

            // Leitura de forma segura do número inteiro
            while (!sc.hasNextInt()) {
                System.out.println("Digite um número válido: ");
                sc.next(); // Descarta entrada inválida
            }
            opcao = sc.nextInt();
            sc.nextLine(); // Limpando Buffer

            switch (opcao) {
                case 1:
                    
                    System.out.println("Informe a quantidade de ônibus (max" +max_onibus+ "):");
                    while (!sc.hasNextInt()) {
                        System.out.println("Digite um número válido:");
                        sc.next();
                    }
                    quantidade = sc.nextInt();
                    sc.nextLine();

                    if (quantidade < 1 || quantidade > max_onibus) {
                        System.out.println("Quantidade inválida!\nDeve ser entre 1 e " +max_onibus+".");
                        quantidade = 0;
                        onibus_registrado = false;
                        assentos_reservados = false;
                        break;
                    }

                    for(int i = 0; i < quantidade; i++) {
                        System.out.println("Número Ônibus ["+(i+1)+"]:");

                        while (!sc.hasNextInt()) {
                            System.out.println("Digite um número válido: ");
                            sc.next();
                        }
                    }

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção Inválida!1\nTente novamente!!");
                    break;
            }
        } while (opcao != 6);
        sc.close();
    }
}