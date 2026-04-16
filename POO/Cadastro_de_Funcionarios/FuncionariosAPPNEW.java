package Cadastro_de_Funcionarios;
// package POO;
import java.util.Scanner;

public class FuncionariosAPPNEW {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Funcionarios fun1 = new Funcionarios(null, 0, 0);
        Funcionarios fun2 = new Funcionarios(null, 0, 0);
        Funcionarios fun3 = new Funcionarios(null, 0, 0);

        Funcionarios_gerente fung1 = new Funcionarios_gerente(null, 0, 0, 0);
        Funcionarios_gerente fung2 = new Funcionarios_gerente(null, 0, 0, 0);
        Funcionarios_gerente fung3 = new Funcionarios_gerente(null, 0, 0, 0);

        // Funcionário 1
        System.out.println();
        System.out.println("Digite o nome do funcionário: ");
        fun1.setNome_de_funcionario(sc.nextLine());
        System.out.println("Digite a idade do funcionário: ");
        fun1.setIdade(sc.nextInt());
        System.out.println("Digite o sálario do funcionário: ");
        fun1.setSalario_de_funcionarios(sc.nextDouble());
        sc.nextLine();

        // Funcionário 2
        System.out.println();
        System.out.println("Digite o nome do funcionário: ");
        fun2.setNome_de_funcionario(sc.nextLine());
        System.out.println("Digite a idade do funcionário: ");
        fun2.setIdade(sc.nextInt());
        System.out.println("Digite o sálario do funcionário: ");
        fun2.setSalario_de_funcionarios(sc.nextDouble());
        sc.nextLine();

        // Funcionário 3
        System.out.println();
        System.out.println("Digite o nome do funcionário: ");
        fun3.setNome_de_funcionario(sc.nextLine());
        System.out.println("Digite a idade do funcionário: ");
        fun3.setIdade(sc.nextInt());
        System.out.println("Digite o sálario do funcionário: ");
        fun3.setSalario_de_funcionarios(sc.nextDouble());
        sc.nextLine();

        // Gerente 1
        System.out.println();
        System.out.println("Digite o nome do Gerente: ");
        fung1.setNome_de_funcionario(sc.nextLine());
        System.out.println("Digite a idade do Gerente: ");
        fung1.setIdade(sc.nextInt());
        System.out.println("Digite o sálario do Gerente: ");
        fung1.setSalario_de_funcionarios(sc.nextDouble());
        System.out.println("Digite o bônus de venda: ");
        fung1.setBonus_venda(sc.nextDouble());
        sc.nextLine();

        // Gerente 2
        System.out.println();
        System.out.println("Digite o nome do Gerente: ");
        fung2.setNome_de_funcionario(sc.nextLine());
        System.out.println("Digite a idade do Gerente: ");
        fung2.setIdade(sc.nextInt());
        System.out.println("Digite o sálario do Gerente: ");
        fung2.setSalario_de_funcionarios(sc.nextDouble());
        System.out.println("Digite o bônus de venda: ");
        fung2.setBonus_venda(sc.nextDouble());
        sc.nextLine();

        // Gerente 3
        System.out.println();
        System.out.println("Digite o nome do Gerente: ");
        fung3.setNome_de_funcionario(sc.nextLine());
        System.out.println("Digite a idade do Gerente: ");
        fung3.setIdade(sc.nextInt());
        System.out.println("Digite o sálario do Gerente: ");
        fung3.setSalario_de_funcionarios(sc.nextDouble());
        System.out.println("Digite o bônus de venda: ");
        fung3.setBonus_venda(sc.nextDouble());
        sc.nextLine();


        System.out.println("========= TABELAS DE FUNCIONÁRIOS E GERENTES ========= ");

        System.out.println();

        // FUNCIONÁRIO
        System.out.println("O NOME DOS FUNCIONÁRIOS: " +fun1.getNome_de_funcionario()+ "--- A IDADE DO FUNCIONÁRIO É: " +fun1.getIdade()+ "--- O SÁLARIO DO FUNCIONÁRIO: " +fun1.getSalario_de_funcionario());
        System.out.println("O NOME DOS FUNCIONÁRIOS: " +fun2.getNome_de_funcionario()+ "--- A IDADE DO FUNCIONÁRIO É: " +fun2.getIdade()+ "--- O SÁLARIO DO FUNCIONÁRIO: " +fun2.getSalario_de_funcionario());
        System.out.println("O NOME DOS FUNCIONÁRIOS: " +fun3.getNome_de_funcionario()+ "--- A IDADE DO FUNCIONÁRIO É: " +fun3.getIdade()+ "--- O SÁLARIO DO FUNCIONÁRIO: " +fun3.getSalario_de_funcionario());

        // GERENTE
        System.out.println("O NOME DO GERENTE: " +fung1.getNome_de_funcionario()+ "--- A IDADE DO GERENTE: " +fung1.getIdade()+ "--- O SÁLARIO DO FUNCIONÁRIO É: " +fung1.getSalario_de_funcionario()+ "--- O BÔNUS É DE : R$" +fung1.getBonus_venda());
        System.out.println("O NOME DO GERENTE: " +fung2.getNome_de_funcionario()+ "--- A IDADE DO GERENTE: " +fung2.getIdade()+ "--- O SÁLARIO DO FUNCIONÁRIO É: " +fung2.getSalario_de_funcionario()+ "--- O BÔNUS É DE : R$" +fung2.getBonus_venda());
        System.out.println("O NOME DO GERENTE: " +fung3.getNome_de_funcionario()+ "--- A IDADE DO GERENTE: " +fung3.getIdade()+ "--- O SÁLARIO DO FUNCIONÁRIO É: " +fung3.getSalario_de_funcionario()+ "--- O BÔNUS É DE : R$" +fung3.getBonus_venda());

        sc.close();
    }
}