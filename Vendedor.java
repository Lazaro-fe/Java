class Vendedor extends Funcionario implements Bonificacao{

    public Vendedor(String nome, double salario_base){
        super(nome, salario_base);
    }

    @Override
    public double calcular_bonus(){
        return 500.00;
    }

    @Override
    public double calcular_salario_final(){
        return getSalario_base() + calcular_bonus();
    }

    public void exibir_informacoes_de_funcionario(){
        System.out.println("Cargo: Vendedor");
        super.exibir_informacoes_de_funcionario();
    }
}