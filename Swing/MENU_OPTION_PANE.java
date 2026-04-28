package Swing;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MENU_OPTION_PANE {
    
    public static void main(String[] args) {
        
        // Variável de controle do nosso loop (laço de repetição).
        // Enquanto for 'true', o menu continuará aparecendo.
        boolean executando = true;

        // Assim, ela não será "zerada" toda vez que o menu aparecer novamente.
        ArrayList<String> produtos = new ArrayList<>();

        // Inicia o loop principal do programa
        while (executando) {

            // JOptionPane.showInputDialog: Mostra uma janela com um campo de texto para o usuário digitar.
            // Aqui estamos usando para exibir o menu e capturar a opção digitada (1, 2 ou 3).
            String opcao = JOptionPane.showInputDialog(null, "Escolha um opção: \n1 - Cadastrar, \n2- Listar, \n3- Sair", "MENU PRINCIPAL", JOptionPane.QUESTION_MESSAGE);

            // Se o usuário clicar em "Cancelar" ou fechar a janela, a 'opcao' será null.
            if (opcao == null) {
                JOptionPane.showConfirmDialog(null, "Mensagem Cancelada!");
            }

            // O 'switch' analisa a 'opcao' digitada pelo usuário e executa o bloco correspondente.
            switch (opcao) {
                case "1": // Caso o usuário digite "1" (Cadastrar)
                
                // Pede ao usuário o nome do produto
                String produto = JOptionPane.showInputDialog(null, "Digite o nome do Produto: ", "Cadastro de Produto: ", JOptionPane.QUESTION_MESSAGE);

                // Verifica se o usuário cancelou (null) ou se deixou o texto vazio (trim().isEmpty())
                if (produto == null || produto.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Produto não Cadastrado!");
                } else {

                    // Se o texto for válido, adiciona o produto à nossa lista (ArrayList)
                    produtos.add(produto);

                    // Confirma o sucesso da operação
                    JOptionPane.showMessageDialog(null, "Produtos Cadastrado com Sucesso!!");
                }
                    break;
                case "2":

                    // .isEmpty() verifica se a lista está vazia
                    if (produtos.isEmpty()) {
                        JOptionPane.showConfirmDialog(null, "Lista Vazia!!");
                    } else {
                        // Prepara uma variável de texto (String) para guardar todos os produtos
                        String Lista = "\n== PRODUTOS CADASTRADOS ==";

                        // Loop 'for' que percorre todos os itens da lista do primeiro (0) ao último (.size())
                        for(int i = 0; i < produtos.size(); i++){
                            // Concatena (junta) o número do item, o nome dele, e pula uma linha (\n)
                            Lista += (i+1)+ "---" +produtos.get(i);
                        }

                        // Mostra a janela final com o texto montado contendo todos os produtos
                        JOptionPane.showMessageDialog(null, Lista, "Lista de Produtos", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case "3":
                    JOptionPane.showConfirmDialog(null, "Você escolheu Sair\nSaindo....");
                    executando=false;
                    break;
                default:

                    JOptionPane.showConfirmDialog(null, "Opção Inválida!!\nTente Novamente!!");
                    break;
            }
        }
    }
}