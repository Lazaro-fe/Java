import java.util.ArrayList;
import java.util.Scanner;

public class Sistema_de_Pagamentos_de_Funcionarios {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner("System.in");
        ArrayList<Funcionario> tabela_de_funcionarios = new ArrayList<>();

        int total_de_funcinarios_para_cadastrar = 2;

        System.out.println("\n===== SISTEMA DE CADASTRO DE FUNCIONÁRIOS =====");

        while (tabela_de_funcionarios.size() < total_de_funcinarios_para_cadastrar) {
            System.out.println("\nCadastro de Funcionários: " + tabela_de_funcionarios + 1 + "/" +total_de_funcinarios_para_cadastrar);
        }
    }
}
