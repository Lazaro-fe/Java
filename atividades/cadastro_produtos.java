// package atividades;
import java.util.Scanner;

public class cadastro_produtos {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String [] nomes_produtos = new String[5];
        int[] quantidade_produtos = new int[5];

        int quant = 0; // Controla a quantidade de produtos cadastrados
        int opcao;

        do {
            System.out.println("\n============= CADASTRO DE PRODUTOS (STRING + INT) =============");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Pesquisar Produto (por nome)");
            System.out.println("4 - Alterar Produto(por nome)");
            System.out.println("5 - Remover Produto(por nome)");
            System.out.println("6 - Sair do Sistema");
            System.out.println("Opção:");
            sc.nextLine(); // Limpar Buffer

            opcao = sc.nextInt();

            switch (opcao) {
                case 1: // Cadastro de Produtos
                    
                    if (quant == nomes_produtos.length) {
                        System.out.println("Lista cheia!! Não é possível cadastrar novos produtos!");
                        break;
                    }

                    System.out.println("Digite o nome do produto:");
                    nomes_produtos[quant] = sc.nextLine();

                    System.out.println("Digite a quantidade do produto em estoque: ");
                    quantidade_produtos[quant] = sc.nextInt();

                    quant++;
                    System.out.println("Produto cadastrado com succeso!!");
                    break;

                case 2: // Listar Produtos
                    
                    if (quant == 0) {
                        System.out.println("Nenhum Produto Cadastrado...");
                        break;
                    }

                    System.out.println("\nDados dos Produtos Cadastrados:");
                    for (int i = 0; i < quant; i++) {
                        System.out.println("Nome do Produto: " + nomes_produtos+ "---" + "Quantidade de produtos presentes em estoque: " + quantidade_produtos);

                    }
                    break;

                case 3: // Pesquisar Produto

                    if (quant == 0) {
                        System.out.println("Nenhum Cadastro identificado...");
                        break;
                    }

                    System.out.println("Digite o nome para pesquisar: ");
                    String busca = sc.nextLine();

                    int posbusca = -1;
                    for (int i = 0; i < quant; i++) {
                        if (nomes_produtos[i].equalsIgnoreCase(busca)) {
                            posbusca = i;
                            break;
                        }
                    }

                    if (posbusca == -1) {
                        System.out.println("Pessoa não encontrada...");
                    } else {
                        System.out.println("Encontrado: " +nomes_produtos[posbusca] + "----" + "Quantidade de produtos: " +quantidade_produtos[posbusca]);
                    }

                    break;

                case 4: // Alterar produto

                    if (quant == 0) {
                        System.out.println("Nenhum cadastro....");
                        break;
                    }

                    System.out.println("Digite o nome do produto para alterar: ");
                    String nome_alterar = sc.nextLine();

                    int posalteracao = -1;
                    for (int i = 0; i< quant; i++) {
                        if (nomes_produtos[i].equalsIgnoreCase(nome_alterar)) {
                            posalteracao = i;
                            break;
                        }
                    }

                    if (posalteracao == -1) {
                        System.out.println("Pessoa não encontrada....");
                    } else {
                        System.out.println("Novo Nome: ");
                        String novo_nome_produto = sc.nextLine();

                        System.out.println("Nova idade: ");
                        int nova_quantidade = sc.nextInt();
                        sc.nextLine();

                        nomes_produtos [posalteracao] = novo_nome_produto;
                        quantidade_produtos [posalteracao] = nova_quantidade;

                        System.out.println("Alterado com Sucesso!");
                    }
                    
                    break;

                case 5: // REMOVER PRODUTO

                    if (quant == 0) {
                        System.out.println("Nenhum Cadastro disponível...");
                        break;
                    }

                    System.out.println("Digite o produto que deseja remover: ");
                    String nome_remover = sc.nextLine();

                    int posremove = -1;
                    for (int i = 0; i<quant; i++) {
                        if (nomes_produtos[i].equalsIgnoreCase(nome_remover)) {
                            posremove = i;
                            break;
                        }
                    }

                    if (posremove == -1) {
                        System.out.println("Pessoa não encontrada...");
                    } else {
                        // Desloca para esquerda para não deixar um buraco
                        for (int i = posremove; i<quant -1; i++) {
                            nomes_produtos[i] = nomes_produtos[i+1];
                            quantidade_produtos[i] = quantidade_produtos [i+1];
                        }

                        // Limpa última posição (opcional)

                        nomes_produtos[quant - 1] = null;
                        quantidade_produtos[quant -1] = 0;

                        quant--;

                        System.out.println("Removido com Sucesso!!");
                    }
                    
                    break;

                case 6:
                    
                    System.out.println("Encerrando o sistema...");
                    break;
                
                default:

                    System.out.println("Opção Inválida! Escolha um número entre 1 e 6!!");    

                    break;
            }
        } while (opcao != 6);
        sc.close();
    }
}