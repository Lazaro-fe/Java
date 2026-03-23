// package atividades;

import java.util.Scanner;
public class prova_01{
// Alunos: Diego Luis De Jesus Bras e Lázaro Ramos
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] aviao = new int[4];
        int[] assentos = new int[20]; 
        String[] passageiros = new String[20];

        int totalReservas = 0;
        int qtd = 0; 
        int opcao1;
   
        while (true) {
            System.out.println("\n=== Sweet Flight ===");
            System.out.println("1 - Cadastrar número do avião (máx.4)"); 
            System.out.println("2 - Reservar Avião");
            System.out.println("3 - Pesquisar Avião");
            System.out.println("4 - Sair");
            System.out.print ("Opção: ");
            opcao1 = sc.nextInt();
            sc.nextLine(); 

            if (opcao1 == 4) { 
                System.out.println("Saindo...");
                break;
            }

            switch (opcao1) {
                case 1: 
                    if (qtd == aviao.length) {
                        System.out.println("Lista cheia! Não é possível cadastrar mais avião.");
                        break;
                    }

                    System.out.print("Digite o numero do avião: ");
                    aviao[qtd] = sc.nextInt();

                    System.out.print("Digite a quantidade de assentos (máximo 20): ");
                    int assentosDigitados = sc.nextInt();
                    
                    if (assentosDigitados > 20 || assentosDigitados <= 0) {
                        System.out.println("Erro: Limite de assentos excedido ou inválido!");
                        break; 
                    }
                    
                    assentos[qtd] = assentosDigitados; 
                    qtd++;
                    
                    System.out.println("Avião registrado com sucesso!");
                    break;

                case 2: 
                    if (qtd == 0) {
                        System.out.println("Nenhum avião cadastrado.");
                        break;
                    }
                    if (totalReservas >= 20) {
                        System.out.println("Limite máximo de 20 reservas do sistema atingido!");
                        break;
                    }

                    System.out.println("\n--- Aviões Disponíveis ---");
                    for (int i = 0; i < qtd; i++) {
                        System.out.println("Avião: " + aviao[i] + " | Vagas: " + assentos[i]);
                    }

                    System.out.print("\nDigite o numero do avião para reservar: ");
                    int reserva = sc.nextInt();
                    sc.nextLine();
                    
                    boolean encontrado = false; 
                    for (int i = 0; i < qtd; i++) {
                       if (aviao[i] == reserva) {
                            encontrado = true;
                            if (assentos[i] > 0) {
                                
                                System.out.print("Informe o nome do passageiro: ");
                                String nome = sc.nextLine();
                                
                                passageiros[totalReservas] = nome; 
                                
                                assentos[i]--; 
                                totalReservas++;
                                
                                System.out.println("Reserva realizada com sucesso para o passageiro(a): " + nome);
                            } else {
                                System.out.println("Não há assentos disponíveis para este avião!");
                            }
                            break; 
                        }
                    }
                    
                    if (!encontrado) {
                        System.out.println("Este avião não existe!");
                    }
                    break;

                case 3: 
                    if (qtd == 0) {
                        System.out.println("Nenhum avião cadastrado.");
                        break;
                    }
                    System.out.println("\n=== Sweet Flight ===");
                    System.out.println("1 - Consultar avião");
                    System.out.println("2 - Consultar passageiros");
                    int opcao2 = sc.nextInt();
                    sc.nextLine();
                    
                    switch (opcao2) {
                        case 1:
                            System.out.println("--- Avião Cadastrados ---");
                            System.out.print("Digite o numero do avião para pesquisar: ");
                            int busca = sc.nextInt();

                            int posBusca = -1;
                            for (int i = 0; i < qtd; i++) {
                                if (aviao[i] == busca) { 
                                    posBusca = i;
                                    break;
                                }
                            }
                            if (posBusca == -1) {
                                System.out.println("Avião não encontrado.");
                            } else {
                                System.out.println("Encontrado: Avião " + aviao[posBusca] + " com " + assentos[posBusca] + " assentos disponíveis.");
                            }
                            break;
                            
                        case 2:
                            System.out.println("--- Passageiros Cadastrados ---");
                            for (int j = 0; j < totalReservas; j++) {
                                System.out.println("Passageiros: " + passageiros[j] + " | Avião:" + aviao[j]);
                            }
                            break;
                        default:
                            System.out.println("Opção inválida! Tente novamente.");
                            break;
                    }
                    break;
            }
        }
        
        sc.close();
    }
}