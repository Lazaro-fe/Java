import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciamento_de_Nomes{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        int opcao = 0;

        do{
            System.out.println("\n===== MENU DE CADASTRO DE PESSOAS =====");
            System.out.println("1 - CADASTRO DE NOME");
            System.out.println("2 - LISTAR NOMES");
            System.out.println("3 - ALTERAR NOME");
            System.out.println("4 - REMOVER NOME");
            System.out.println("5 - PESQUISAR NOME");
            System.out.println("6 - SAIR DO SISTEMA");

            System.out.println();
            System.out.println("Digite a opção desejada:");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    // CADASTRAR NOME
                    System.out.println("Digite um nome:");
                    nomes.add(sc.nextLine());
                    System.out.println("Nome cadastrado com sucesso!!");
                    
                    break;
                case 2:
                
                    // LISTAR NOME
                    System.out.println("=== OS NOMES CADASTRADOS ===");
                    if (nomes.isEmpty()) {
                        System.out.println("A LISTA ESTÁ VAZIA!!");
                    } else {
                        for(int i = 0; i < nomes.size(); i++){
                            System.out.println(i+ "--- nomes: " +nomes.get(i));
                        }
                    }
                        
                    break;
                case 3:
                    // ALTERAR NOME CADASTRADO
                    if (nomes.isEmpty()) {
                        System.out.println("A LISTA ESTÁ VAZIA!!\nCADASTRE UM NOME NA LISTA!!");
                    } else {
                        int alterar_nome;
                        boolean indice_valido = false;

                        do{
                            System.out.println("\nInforme o indice do nome que deseja alterar: ");
                            alterar_nome = sc.nextInt();
                            sc.nextLine(); // Limpando Buffer

                            if (alterar_nome < 0 || alterar_nome >= nomes.size()) {
                                System.out.println("Índice inválido!!\nTente novamente!!");
                            } else {
                                System.out.println("Digite o novo nome que será escolhido: ");
                                String novo_nome = sc.nextLine();
                                nomes.set(alterar_nome, novo_nome);
                                System.out.println("Nome alterado com sucesso!");
                                indice_valido = true; // Saindo do Loop
                            }
                        } while (!indice_valido);
                    }
                    break;
                case 4:
                    // REMOVER NOME CADASTRADO
                    if (nomes.isEmpty()) {
                        System.out.println("Lista Vazia!!\nCadastre um nome na lista!!");
                    } else{
                        int indice;
                        boolean indice_valido = false;

                        do{
                            System.out.println("Digite o indice do nome que deseja alterar: ");
                            indice = sc.nextInt();
                            sc.nextLine();

                            if (indice < 0 || indice >= nomes.size()) {
                                System.out.println("Índice inválido");
                            } else {
                                nomes.remove(indice);
                                System.out.println("Nome removido com sucesso!!");
                                indice_valido = true;
                            }
                        } while(!indice_valido);
                    }

                    break;
                case 5:

                    System.out.println("Digite o nome que deseja pesquisar: ");
                    String pesquisa = sc.nextLine();

                    if (nomes.contains(pesquisa)) {
                        System.out.println("Encontrado!\n O nome está na posição " +nomes.indexOf(pesquisa));
                    }else{
                        System.out.println("Nome não encontrado na Lista!!");
                    }

                    break;
                case 6:
                    System.out.println("Saindo do sistema.....");
                    
                    break;
                default:
                    System.out.println("Opção Inválida!!\nTente novamente!!");
                    break;
            }
        } while(opcao != 6);

        sc.close();
    }
}