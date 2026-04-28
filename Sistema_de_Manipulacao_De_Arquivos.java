import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.Buffer;
import java.util.Scanner;

public class Sistema_de_Manipulacao_De_Arquivos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome_do_arquivo = "Arquivo.txt";
        File arquivo = new File(nome_do_arquivo);

        while (true) {
            System.out.println("\n==== Manipulação de Arquivo ====");
            System.out.println("1 - CRIAR ARQUIVO");
            System.out.println("2 - ESCREVER NO ARQUIVO");
            System.out.println("3 - LER ARQUIVO");
            System.out.println("4 - ALTERAR ARQUIVO");
            System.out.println("5 - REMOVER ARQUIVO");
            System.out.println("6 - SAIR DO SISTEMA");
            System.out.println();
            System.out.println("Digite a opção desejada: ");
            int opcao_desejada = sc.nextInt();

            try {
                opcao_desejada = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite apenas números válidos!!");
                continue;
            }

            switch (opcao_desejada) {
                case 1:
                    criar_arquivos(nome_do_arquivo);
                    break;
                case 2:
                    System.out.println("Digite o texto desejado: ");
                    String texto = sc.nextLine();
                    escrever_no_Arquivo(nome_do_arquivo, texto);
                    break;
                case 3:
                    Ler_arquivos(nome_do_arquivo);
                    break;
                case 4:
                    System.out.println("Digite um novo conteúdo: ");
                    String novo_texto_digitado = sc.nextLine();
                    alter_Arquivo(nome_do_arquivo, novo_texto_digitado);
                    break;
                case 5:

                    break;
                case 6:

                    break;
                default:
                    break;
            }
        }
    }

        // ==================================
        // MÉTODOS
        // ==================================

        public static void criar_arquivos(String nome_do_arquivo) {
            try{
                File arquivo = new File(nome_do_arquivo);

                if (arquivo.createNewFile()) {
                    System.out.println("Arquivo foi criado com Sucesso!!");
                } else {
                    System.out.println("Arquivo já esxiste!!");
                }

            } catch (IOException e){
                System.out.println("Erro ao criar Arquivo: " + e.getMessage());
            }
        }

        public static void escrever_no_Arquivo(String nome_do_arquivo, String texto){
            try{
                FileWriter escrita = new FileWriter(nome_do_arquivo, true);
                Writer.write(texto +"\n");
                Writer.close();
                
                System.out.println("Erro ao escrever: " e.getMessage());
            } catch (IOException e){
                System.out.println("Erro ao escrever: " + e.getMessage());
            }
        }

        public static void Ler_arquivos(String nome_do_arquivo){
            try{
                File arquivo = new File(nome_do_arquivo);

                if (!arquivo.exists()) {
                    System.out.println("Arquivo não existe!!");
                    return;
                }

                BufferedReader reader = new BufferedReader(new FileReader(arquivo));

                String linha;

                System.out.println("\n=== Conteúdo do Arquivo ===");
                while ((linha = reader.readLine()) != null) {
                    System.out.println(linha);
                }

                reader.close();
            }
        }

}