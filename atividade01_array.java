import java.util.Scanner;

public class atividade01_array {
    
    public static void main(String[] args) {
        
        int tamanho_do_cadastro = 30;
        String[] nomes = new String [tamanho_do_cadastro];
        Scanner sc = new Scanner(System.in);
        int op;

        int quant_nomes = 0;

        do{
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Alterar");
            System.out.println("4 - Remover");
            System.out.println();
            System.out.println("Informe a opção desejada: ");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    
                if (quant_nomes < tamanho_do_cadastro) {
                    System.out.println("Digite o nome desejado");
                    nomes[quant_nomes] = sc.nextLine();
                    quant_nomes++;
                    System.out.println("Nome cadastrado com Sucesso!! =)");
                } else {
                    System.out.println("A lista está cheia!!");
                }

                    break;
                case 2:

                    System.out.println("\nNomes Cadastrados:");
                    if (quant_nomes == 0) {
                        System.out.println("A Lista de nomes encotra-se vazia!");
                    } else {

                        for(int i=0; i < quant_nomes; i++) {
                            System.out.println("O nome: " +nomes[i]);
                        }
                    }

                    break;
                case 3:
                    
                    System.out.println("Qual nome você deseja alterar: ");
                    String nome_alter = sc.nextLine();

                    for (nomes[i].equalsIgnoreCase(nome_alter)) {
                        System.out.println("Digite novo nome: ");
                        nomes[i] = sc.nextLine();
                        System.out.println("Nome alterado com sucesso!!");
                    }

                    break;
                case 4:

                    System.out.println("Qual nome você deseja remover:");
                    String nome_remove = sc.nextLine();
                    
                    for (int i = 0; i < quant_nomes; i++) {
                        if (nomes[i].equalsIgnoreCase(nome_remove)) {
                            
                            for (int j = i; j < quant_nomes - 1; j++) {
                                nomes[j] = nomes [j+1];
                            }

                            nomes = [quant_nomes - 1] = null;
                    }
                        break;
                default:

                    System.out.println("\nOpção Inválida!");

                    break;
            }
        } while (op!=0);
        sc.close();
    }
}