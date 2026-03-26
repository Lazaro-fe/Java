import java.util.ArrayList;
import java.util.Scanner;

public class ArL04 {
    

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
                    for(int i = 0; i < 5; i++){
                        System.out.println("Cadastre um nome: "+(i+1));
                        nomes.add(sc.nextLine());
                    }
                    
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
                    int alterar_dados;
                    do{
                        System.out.println("\nInforme o nome que deja alterar: ");
                        alterar_dados = sc.nextInt();
                        sc.nextLine();

                        if (alterar_dados < 0 || alterar_dados >= nomes.size()) {
                            System.out.println("Indice Inválido!! \nTente Novamente!!");
                        }

                    } while (alterar_dados < 0 || alterar_dados >= nomes.size());

                    break;
                case 4:
                    // REMOVER NOME CADASTRADO
                    int indice;
                    do{
                        System.out.println("Informe o nome que deseja remover: ");
                        indice = sc.nextInt();

                        if (indice < 1 || indice >= 1) {
                            System.out.println("Indice inválido!!");
                        }

                    }while (indice < 1 || indice >= 1);

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