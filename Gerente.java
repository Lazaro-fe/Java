class Gerente extends Funcionario implements Bonificacao{

    public Gerente(String nome, double salario_base){
        super(nome, salario_base);
    }

    @Override
    public double calcular_bonus(){
        return 1000.00;
    }

    @Override
    public double calcular_salario_final(){
        return getSalario_base() + calcular_bonus();
    }

    public void exibir_informacoes_de_funcionario() {
        System.out.println("Cargo: Gerente");
        super.exibir_informacoes_de_funcionario();
    }
}