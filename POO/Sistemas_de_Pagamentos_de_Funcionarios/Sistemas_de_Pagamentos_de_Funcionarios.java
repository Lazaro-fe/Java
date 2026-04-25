package Sistemas_de_Pagamentos_de_Funcionarios;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sistemas_de_Pagamentos_de_Funcionarios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("\n====== Sistema de Pagamentos de Funcionários ======");
        int funcionarios_cadastrados = 0;

        while (funcionarios_cadastrados < 2) {
            try{
                System.out.print("Digite o nome do funcionário: ");
                String nome = sc.next();

                System.out.print("Digite o salário base desse funcionário: ");
                double salario_base = sc.nextDouble();
                
                sc.nextLine();

                System.out.println("Escolha em que cargo deseja cadastra-ló");
                System.out.println("1 - Vendedor");
                System.out.println("2 - Gerente");
                System.out.println("Digite a opção desejada: ");
                int opcao_de_cadastro = sc.nextInt();

                sc.nextLine();


                Funcionario func = null;

                if (opcao_de_cadastro == 1) {
                    System.out.println();
                    func = new Vendedor(nome, salario_base);
                } else if (opcao_de_cadastro == 2) {
                    System.out.println();
                    func = new Gerente(nome, salario_base);
                } else {
                    System.out.println("Digite uma opção válida entre 1 e 2!\nTente Novamente!");
                    continue;
                }

                funcionarios.add(func);
                System.out.println("Funcionário cadastrado com sucesso!");
                funcionarios_cadastrados++;

                }catch (InputMismatchException e){
                    System.out.println("Erro de entrada: Você digitou caracteres inválidos onde um número era esperado.");
                    sc.nextLine();
                } catch (IllegalArgumentException e){
                    System.out.println("Erro de validação: " +e.getMessage());
                } catch (Exception e) {
                    System.out.println("Ocorreu um erro inesperado: " +e.getMessage());
                }
        }

        sc.close();

        System.out.println("\n==== RESULTADO DA FOLHA DE PAGAMENTO ====");
        for(Funcionario f : funcionarios){
            f.exibir_informacoes_de_funcionario();
        }
    }
}