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

                    for(int j = 0; j < quantidade; j++) {
                        System.out.println("Número Ônibus ["+(j+1)+"]:");

                        while (!sc.hasNextInt()) {
                            System.out.println("Digite um número válido: ");
                            sc.next();
                        }
                        numeros_de_onibus[j] = sc.nextInt();
                        sc.nextLine();

                        total_de_reservas = 0;
                        for(int i = 0; i < max_reservas; i++){
                            nomes_passageiros[i] = null;
                            onibus_reservado[i] = 0;
                        }

                        onibus_registrado = true;
                        assentos_reservados = false;
                        System.out.println("Frota registrada com sucesso!!");
                        break;
                    }

                case 2:

                    if(!onibus_registrado){
                        System.out.println("Registre o ônibus para seguir adiante!!");
                        break;
                    }

                    for(int  i = 0; i < quantidade; i++){
                        System.out.println("Informe a quantidade de assentos disponíveis para cada ônibus ["+(i+1)+"]: ");
                        while (!sc.hasNextInt()) {
                            System.out.println("Digite um número válido: ");
                            sc.next();
                        }
                        numeros_de_assentos_disponiveis[i] = sc.nextInt();
                        sc.nextLine();

                        if (numeros_de_assentos_disponiveis[i] < 1) {
                            System.out.println("Quantidade de assentos inválida!\nDeve ser maior que 0.");
                            numeros_de_assentos_disponiveis[i] = 0;
                            assentos_reservados = false;
                            break;
                        }

                        assentos_reservados = true;
                        System.out.println("Assentos registrados com sucesso!!");
                    }

                    break;
                case 3:

                    if (!assentos_reservados || !onibus_registrado) {
                        System.out.println("Registe os ônibus e os assentos disponíveis para seguir adiante!!");
                        break;
                    }

                    if (total_de_reservas >= max_reservas) {
                        System.out.println("Número máximo de" +max_reservas+ "reservas atingido!!");
                        break;
                    }

                    System.out.println("Informe o número do ônibus para reserva:");
                    while (!sc.hasNextInt()) {
                        System.out.println("Digite um número válido: ");
                        sc.next();
                    }
                    
                    int numero_onibus = sc.nextInt();
                    sc.nextLine();

                    int indice_onibus = -1;
                    for (int i = 0; i < quantidade; i++) {
                        if (numeros_de_onibus[i] == numero_onibus) {
                            indice_onibus = i;
                            break;
                        }
                    }

                    if (indice_onibus == -1) {
                        System.out.println("Ônibus não encontrado!!");
                        break;
                    }

                    if (numeros_de_assentos_disponiveis[indice_onibus] <= 0) {
                        System.out.println("Não há assentos disponíveis para o ônibus selecionado!!");
                        break;
                    }

                    String nome_passageiros;
                    while (true) {
                        System.out.println("Informe o nome do passageiro para reserva:");
                        nome_passageiros = sc.nextLine().trim();

                        if (nome_passageiros.isEmpty()) {
                            System.out.println("O nome do passageiro não pode estar vazio!!\nTente Novamente!!");
                        } else {
                            break;
                        }
                    }

                    nomes_passageiros[total_de_reservas] = nome_passageiros;
                    onibus_reservado[total_de_reservas] = numero_onibus;
                    total_de_reservas++;
                    numeros_de_assentos_disponiveis[indice_onibus]--;
                    System.out.println("Reserva realizado com sucesso!!!");
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