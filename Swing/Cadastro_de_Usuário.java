package Swing;
import javax.swing.JOptionPane;

public class Cadastro_de_Usuário {
    
    public static void main(String[] args) {
        
        String nome_usuario = JOptionPane.showInputDialog(null, "Digite seu nome: ", "Entrada de dados", JOptionPane.QUESTION_MESSAGE);

        if (nome_usuario == null || nome_usuario.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Operação Cancelada!\nEncerrando...");
            return;
        }

        String idade_em_texto = JOptionPane.showInputDialog(null, "Digite sua idade: ");

        if (idade_em_texto == null || idade_em_texto.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Operação Cancelada!\nIdade digitada de forma inválida!!");
        }

        try{

            int idade = Integer.parseInt(idade_em_texto);
            
            String status;
            if (idade >= 18) {
                status = "Maior de Idade";
            } else {
                status = "Menor de Idade";
            }

            String Mensagem_final = "\n=== DADOS DO USUÁRIO ===" + "\nNome: " + nome_usuario + "\n IDADE: " + idade + " anos\n Status: " +status+ "!";

            JOptionPane.showConfirmDialog(null, Mensagem_final, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e){
            JOptionPane.showConfirmDialog(null, "Erro : Você deve digitar apenas números para idade ", "Erro de Digitação", JOptionPane.ERROR_MESSAGE);
        }
    }
}
