import java.util.Scanner;

public class atividade_revisional {
    
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        // Gerenciamento dos quartos (máximo 5)
        int[] quartos_disponiveis = new int[5];
        int[] camas_por_quarto_cadastrado = new int[5];

        // Gerenciamento de reservas feitas nos quartos
        int[] reserva_camas_disponíveis = new int[25];
        String[] nome_hospedes = new String[25];

        int total_de_reservas_disponiveis = 0; // Controla o limite de 25 reservas
        int quantidade_quartos = 0; // Controla o limite de 5 quartos
        int opcao;

        while (true) {
            System.out.println("============ SEJA BEM-VINDO ============");
            System.out.println("1 - Registrar números dos quartos");
            System.out.println("2 - Registrar a quantidade de quartos");
            System.out.println("3 - Reservar quarto");
            System.out.println("4 - Consultar reservas por quarto");
            System.out.println("5 - Consultar reservas por hóspede");
            System.out.println("6 - Encerrar Sistema");
            System.out.println();
            System.out.println("Digite a opção desejada");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpando Buffer

            switch (opcao) {
                case 1:
                    if (quantidade_quartos >= quartos_disponiveis.length) {
                        System.out.println("A lista de quartos está cheia!\nNão é possível cadastrar mais quartos");
                        break;
                    }

                    System.out.println("Digite o número do quarto que deseja cadastrar:");
                    quartos_disponiveis[quantidade_quartos] = sc.nextInt();
                    quantidade_quartos++;

                    System.out.println("Quartos cadastrados com sucesso!!");
                    break;
                case 2:
                    if (quantidade_quartos == 0) {
                        System.out.println("Já alcançou a quantidade de camas cadastradas nos quartos");
                        break;
                    }
                    System.out.println("\n --- Registro de Quartos disponíveis ---");
                    // Pede a quantidade de camas cadastradas para cada quarto que foi cadastrado
                    for (int i =0; i < quantidade_quartos; i++) {
                        System.out.println("Quarto" +quantidade_quartos+ "--> Quantidade de camas:");
                        camas_por_quarto_cadastrado[i] = sc.nextInt();
                    }

                    System.out.println("Camas cadastradas com sucesso!");
                    break;
                case 3:
                    if (total_de_reservas_disponiveis >= 25) {
                        System.out.println("\nLimite máximo de 25 de reservas no hotel!!\nTente outro momento!");
                        break;
                    }

                    System.out.println("Digite o número do quarto que deseja fazer a reserva:");
                    int numero_de_quarto = sc.nextInt();
                    sc.nextLine(); // Limpoar o Buffer

                    int indice_quarto = -1; // Variável para guardar a posição do quarto
                    
                    // Verifica se o quarto existe no sistema
                    for (int i=0; i < quantidade_quartos; i++) {
                        if (quartos_disponiveis[i] == numero_de_quarto) {
                            indice_quarto = i;
                            break;
                        }
                    }

                    if (indice_quarto == -1) {
                        System.out.println("Esse quarto não existe em nosso sistema!");
                    } else if (camas_por_quarto_cadastrado[indice_quarto] <= 0) {
                        System.out.println("Não há camas disponíveis nesse quarto!!");
                    } else {

                        System.out.println("Digite o nome de hóspedes:");
                        String nome = sc.nextLine();

                        nome_hospedes[total_de_reservas_disponiveis] = nome;
                        reserva_camas_disponíveis[total_de_reservas_disponiveis] = numero_de_quarto;

                        camas_por_quarto_cadastrado[indice_quarto]--;
                        total_de_reservas_disponiveis++;

                        System.out.println("Reserva realizada com sucesso!");
                    }
                    break;
                case 4:
                    System.out.println("Digite o número do quarto que deseja consultar:");
                    int quarto_consulta = sc.nextInt();

                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Saindo do Sistema...");
                    break;
                default:
                    System.out.println("Opção Inválida!\nTente novamente!");
                    break;
            }
        }
    }
}