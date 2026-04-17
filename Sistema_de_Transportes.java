import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sistema_de_Transportes {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculo_Transpotes> Concessionaria = new ArrayList<>();

        System.out.println("\n=== CADASTRANDO VEÍCULOS ===");

        try{
            System.out.print("Digite o modelo: ");
            String modelo_veiculo = sc.nextLine();

            System.out.print("Digite o ano do veículo: ");
            int ano_veiculo = sc.nextInt();

            sc.nextLine();

            System.out.println("Qual categoria pertence? (1 - CARRO / 2 - MOTO)");
            int tipo = sc.nextInt();

        if (tipo == 1) {
            Carro_Transporte c1 = new Carro_Transporte(modelo_veiculo, ano_veiculo);
            Concessionaria.add(c1);
            System.out.println("Carro cadastrado com Sucesso!");
        } else if (tipo == 2) {
            Moto_Transporte m1 = new Moto_Transporte(modelo_veiculo, ano_veiculo);
            Concessionaria.add(m1);
            System.out.println("Moto cadastrado com Sucesso!");
        } else {
            System.out.println("Opção inválida!\nCadastro Cancelado");
        }

        } catch (InputMismatchException e){
            System.out.println("Erro: o ano deve ser preenchido com números inteiros");
        } catch (IllegalArgumentException e){
            System.out.println("Erro de Validação: " +e.getMessage());
        } catch (Exception e){
            System.out.println("Erro Inesperado: " +e.getMessage());
        }

        System.out.println("\n=== TABELA DE VEÍCULOS ===");
        if (Concessionaria.isEmpty()){
            System.out.println("Nenhum veículo foi cadastrado");
        } else {
        for (Veiculo_Transpotes v: Concessionaria){
            v.exibir_informacoes_veiculo();
            }
        }
        sc.close();
    }
}