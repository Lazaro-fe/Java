import java.util.Scanner;

public class codigo_com {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Constantes que definem os limites do sistema
        final int MAX_ONIBUS = 4;
        final int MAX_RESERVAS = 20;

        // VETORES DA FROTA: Armazenam os dados dos ônibus
        int qtdOnibus = 0; // Quantidade atual de ônibus cadastrados
        int[] numerosOnibus = new int[MAX_ONIBUS]; // Guarda o ID/número de cada ônibus
        int[] assentosDisponiveis = new int[MAX_ONIBUS]; // Guarda os assentos livres de cada ônibus

        // VETORES DE RESERVAS: Armazenam os dados das passagens (arrays paralelos)
        String[] nomesPassageiros = new String[MAX_RESERVAS]; // Guarda o nome do cliente
        int[] onibusDaReserva = new int[MAX_RESERVAS]; // Guarda em qual ônibus o cliente (do mesmo índice) vai
        int totalReservas = 0; // Contador de quantas reservas já foram feitas

        // Flags de controle de fluxo do sistema
        boolean frotaRegistrada = false;
        boolean assentosRegistrados = false;

        int opc;

        // Loop principal do programa: continua rodando até o usuário escolher a opção 6
        do {
            System.out.println("\n===== Gestão de Reservas de Ônibus =====");
            System.out.println("1 - Registrar número dos ônibus");
            System.out.println("2 - Registrar assentos disponíveis por ônibus");
            System.out.println("3 - Reservar passagem");
            System.out.println("4 - Consultar reservas por ônibus");
            System.out.println("5 - Consultar reservas por passageiro");
            System.out.println("6 - Encerrar");
            System.out.print("Escolha: ");

            // Validação de entrada: impede que o programa feche com erro se o usuário digitar letras
            while (!sc.hasNextInt()) {
                System.out.print("Digite um número válido: ");
                sc.next(); // descarta a entrada inválida do buffer
            }
            opc = sc.nextInt();
            sc.nextLine(); // Limpa o "Enter" (\n) do buffer do Scanner

            // Estrutura de decisão para o menu
            switch (opc) {
                case 1: {
                    // --- OPÇÃO 1: CADASTRAR A FROTA ---
                    System.out.print("Informe a quantidade de ônibus (máx. " + MAX_ONIBUS + "): ");
                    while (!sc.hasNextInt()) {
                        System.out.print("Digite um número válido: ");
                        sc.next();
                    }
                    qtdOnibus = sc.nextInt();
                    sc.nextLine();

                    // Verifica se a quantidade está dentro do limite permitido
                    if (qtdOnibus < 1 || qtdOnibus > MAX_ONIBUS) {
                        System.out.println("Quantidade inválida! Deve ser entre 1 e " + MAX_ONIBUS + ".");
                        qtdOnibus = 0;
                        frotaRegistrada = false;
                        assentosRegistrados = false;
                        break;
                    }

                    // Lê o número (ID) de cada ônibus
                    for (int i = 0; i < qtdOnibus; i++) {
                        System.out.print("Número do ônibus [" + (i + 1) + "]: ");
                        while (!sc.hasNextInt()) {
                            System.out.print("Digite um número válido: ");
                            sc.next();
                        }
                        numerosOnibus[i] = sc.nextInt();
                        sc.nextLine();
                    }

                    // Zera os assentos sempre que a frota for recadastrada (evita lixo de memória)
                    for (int i = 0; i < MAX_ONIBUS; i++) {
                        assentosDisponiveis[i] = 0;
                    }

                    // Limpa também as reservas antigas caso a frota mude
                    totalReservas = 0;
                    for (int i = 0; i < MAX_RESERVAS; i++) {
                        nomesPassageiros[i] = null;
                        onibusDaReserva[i] = 0;
                    }

                    frotaRegistrada = true;
                    assentosRegistrados = false; // Exige que os assentos sejam registrados novamente
                    System.out.println("Frota registrada com sucesso!");
                    break;
                }

                case 2: {
                    // --- OPÇÃO 2: REGISTRAR ASSENTOS ---
                    // Exige que a frota exista antes de registrar assentos
                    if (!frotaRegistrada) {
                        System.out.println("Registre primeiro os ônibus (opção 1).");
                        break;
                    }

                    // Pede a quantidade de assentos para cada ônibus cadastrado na opção 1
                    for (int i = 0; i < qtdOnibus; i++) {
                        int ass;
                        while (true) {
                            System.out.print("Assentos disponíveis para o ônibus " + numerosOnibus[i] + ": ");
                            while (!sc.hasNextInt()) {
                                System.out.print("Digite um número válido: ");
                                sc.next();
                            }
                            ass = sc.nextInt();
                            sc.nextLine();

                            // Não permite cadastro de ônibus com assentos negativos
                            if (ass < 0) {
                                System.out.println("Quantidade inválida! Assentos não podem ser negativos. Tente novamente.");
                            } else {
                                break;
                            }
                        }
                        assentosDisponiveis[i] = ass;
                    }

                    assentosRegistrados = true;
                    System.out.println("Assentos registrados com sucesso!");
                    break;
                }

                case 3: {
                    // --- OPÇÃO 3: FAZER UMA RESERVA ---
                    // Validações iniciais (se frota existe, se assentos existem e se há espaço no vetor)
                    if (!frotaRegistrada || !assentosRegistrados) {
                        System.out.println("Registre frota (1) e assentos (2) antes de reservar.");
                        break;
                    }
                    if (totalReservas >= MAX_RESERVAS) {
                        System.out.println("Limite máximo de " + MAX_RESERVAS + " reservas atingido!");
                        break;
                    }

                    System.out.print("Informe o número do ônibus para reservar: ");
                    while (!sc.hasNextInt()) {
                        System.out.print("Digite um número válido: ");
                        sc.next();
                    }
                    int numBus = sc.nextInt();
                    sc.nextLine();

                    // Busca linear para encontrar a posição (índice) do ônibus digitado
                    int idx = -1;
                    for (int i = 0; i < qtdOnibus; i++) {
                        if (numerosOnibus[i] == numBus) {
                            idx = i;
                            break;
                        }
                    }

                    // Se não encontrou o ônibus
                    if (idx == -1) {
                        System.out.println("Este ônibus não existe!");
                        break;
                    }

                    // Verifica se ainda há vagas neste ônibus específico
                    if (assentosDisponiveis[idx] <= 0) {
                        System.out.println("Não há assentos disponíveis para este ônibus!");
                        break;
                    }

                    // Pede o nome do passageiro e garante que não seja uma string em branco
                    String nome;
                    while (true) {
                        System.out.print("Nome do passageiro: ");
                        nome = sc.nextLine().trim();
                        if (nome.isEmpty()) {
                            System.out.println("Nome não pode ficar vazio. Tente novamente.");
                        } else {
                            break;
                        }
                    }

                    // Efetivação da reserva
                    nomesPassageiros[totalReservas] = nome; // Salva o nome
                    onibusDaReserva[totalReservas] = numBus; // Salva em qual ônibus ele vai
                    totalReservas++; // Aumenta o contador geral de reservas
                    assentosDisponiveis[idx]--; // Desconta uma vaga do ônibus escolhido

                    System.out.println("Reserva realizada com sucesso!");
                    break;
                }

                case 4: {
                    // --- OPÇÃO 4: CONSULTAR RESERVAS POR ÔNIBUS ---
                    if (!frotaRegistrada) {
                        System.out.println("Registre primeiro os ônibus (opção 1).");
                        break;
                    }

                    System.out.print("Informe o número do ônibus para consulta: ");
                    while (!sc.hasNextInt()) {
                        System.out.print("Digite um número válido: ");
                        sc.next();
                    }
                    int consultaBus = sc.nextInt();
                    sc.nextLine();

                    // Verifica se o ônibus buscado existe na frota
                    int idxConsulta = -1;
                    for (int i = 0; i < qtdOnibus; i++) {
                        if (numerosOnibus[i] == consultaBus) {
                            idxConsulta = i;
                            break;
                        }
                    }

                    if (idxConsulta == -1) {
                        System.out.println("Este ônibus não existe!");
                        break;
                    }

                    // Percorre o vetor de reservas buscando pessoas que vão neste ônibus
                    boolean encontrou = false;
                    System.out.println("Reservas para o ônibus " + consultaBus + ":");
                    for (int i = 0; i < totalReservas; i++) {
                        if (onibusDaReserva[i] == consultaBus) {
                            System.out.println("- " + nomesPassageiros[i]);
                            encontrou = true; // Marca que achou pelo menos 1 pessoa
                        }
                    }
                    if (!encontrou) {
                        System.out.println("Não há reservas realizadas para este ônibus!");
                    }

                    // Mostra quantas vagas ainda sobram
                    System.out.println("Assentos restantes para o ônibus " + consultaBus + ": " + assentosDisponiveis[idxConsulta]);
                    break;
                }

                case 5: {
                    // --- OPÇÃO 5: CONSULTAR RESERVAS POR PASSAGEIRO ---
                    if (totalReservas == 0) {
                        System.out.println("Não há reservas no sistema.");
                        break;
                    }

                    // Pede o nome do passageiro, não aceitando espaços em branco
                    String nomeConsulta;
                    while (true) {
                        System.out.print("Informe o nome do passageiro: ");
                        nomeConsulta = sc.nextLine().trim();
                        if (nomeConsulta.isEmpty()) {
                            System.out.println("Nome não pode ficar vazio. Tente novamente.");
                        } else {
                            break;
                        }
                    }

                    // Busca o nome do passageiro no vetor (ignorando maiúsculas/minúsculas)
                    boolean achou = false;
                    System.out.println("Reservas do passageiro \"" + nomeConsulta + "\":");
                    for (int i = 0; i < totalReservas; i++) {
                        if (nomesPassageiros[i] != null && nomesPassageiros[i].equalsIgnoreCase(nomeConsulta)) {
                            System.out.println("- Ônibus " + onibusDaReserva[i]);
                            achou = true; // Marca que o passageiro tem pelo menos uma reserva
                        }
                    }
                    if (!achou) {
                        System.out.println("Não há reservas realizadas para este passageiro!");
                    }
                    break;
                }

                case 6:
                    // --- OPÇÃO 6: ENCERRAR ---
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;

                default:
                    // Captura qualquer número digitado fora das opções do menu
                    System.out.println("Opção inválida!");
            }

        } while (opc != 6);

        // Fecha o scanner para evitar vazamento de recursos (resource leak)
        sc.close();
    }
}