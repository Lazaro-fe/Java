package Swing;
import javax.swing.JOptionPane;

public class Caixa_de_Entrada {
    
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        JOptionPane.showInputDialog(null, "Olá," +nome, "Message", JOptionPane.PLAIN_MESSAGE);
    }
}
