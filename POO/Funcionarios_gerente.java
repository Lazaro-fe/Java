// package POO;
public class Funcionarios_gerente extends Funcionarios{ 
    private double bonus_venda;
    
    public Funcionarios_gerente(String Nome_de_funcionario, int Idade, double Salario_de_funcionario, double bonus_venda){
        super(Nome_de_funcionario, Idade, Salario_de_funcionario);
        this.bonus_venda = bonus_venda;
    }

    public double getBonus_venda(){
        return bonus_venda;
    }
    
    public void setBonus_venda(double bonus_venda){
        this.bonus_venda = bonus_venda;
    }

    public void exibirInfor(){
        System.out.println("Bônus de Venda: " +bonus_venda);
    }
}
