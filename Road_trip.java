import java.util.Scanner;

public class Road_trip {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Constantes que definem os limites do sistema
        final int maximo_de_onibus = 4;
        final int maximo_de_reservas = 20;

        // VETORES DA FROTA: Armazenam a quantidade de ônibus da frota
        int quantidade_de_onibus = 0; // Controla a quantidade de ônibus cadastrados
        int[] numeros_de_onibus = new int[maximo_de_onibus]; // Guarda o ID dos ônibus registrados
        int[] numero_de_assentos_disponiveis = new int[maximo_de_reservas]; // Guarda a quantidade de assentos disponíveis

        // VETORES DAS RESERVAS: Armazenam a quantidade de reservas que serão realizadas
        String[] nome_dos_passageiros = new String[maximo_de_reservas]; // Guarda o nome do cliente
        int[] reservas_de_onibus = new int[maximo_de_reservas]; // Guarda o número do ônibus que o passageiro escolheu
        int total_de_reservas_realizadas = 0; // Guarda a quantidade de reservas feitas

        // flags de controle do sitemas
        boolean frotas_resgistradas = false;
        boolean assentos_registrados = false;

        int opcao;

        // LOOP DO-WHILE serve para que o MENU continue repetindo até o usuário digitar o número 6
        do{
            System.out.println("============= SEJA BEM-VINDO A ROAD TRIP ============");
            System.out.println();
            System.out.println("============= MENU DE CADASTRO RODOVIÁRIO ============");
            System.out.println("1 - CADASTRO DE ÔNIBUS");
            System.out.println("2 - REGISTRAR A QUANTIDADE DE ASSENTOS DISPONÍVEIS");
            System.out.println("3 - RESERVAR PASSAGEM");
            System.out.println("4 - CONSULTAR POR ÔNIBUS");
            System.out.println("5 - CONSULTAR POR PASSAGEIRO");
            System.out.println("6 - ENCERRAR PROGRAMA");
            System.out.println();
            System.out.println("Digite a opção que deseja: ");

            // Validação de entrada: impede que o sistema feche, se o usuário digitar uma letra ou palavra
            while (!sc.hasNextInt()) {
                System.out.println("Digite um número válido:");
                sc.next(); // Descarta a entrada de forma inválida do buffer
            }

            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o "ENTER" do Buffer do Scanner
        }
    }
}