package Swing;
import javax.swing.JOptionPane;

public class Caixa_de_Confirmação {
    
    public static void main(String[] args) {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar: ", "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showConfirmDialog(null, "Você escolheu SIM", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showConfirmDialog(null, "Você escolheu NÃO", "Resultado", JOptionPane.WARNING_MESSAGE);
        }
    }
}
