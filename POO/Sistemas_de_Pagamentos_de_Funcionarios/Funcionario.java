abstract class Funcionario{

    private String nome;
    private double salario_base;

    public Funcionario(String nome, double salario_base){

        if (nome == null || nome.trim().isEmpty()) { 
            throw new IllegalAccessException("O nome não pode ser vazio!");
        }

        if (salario_base <= 0) {
            throw new IllegalArgumentException("O salário não pode ser menor ou igual a zero");
        }
        this.nome = nome;
        this.salario_base = salario_base;
    }

    public Funcionario(String nome){
        this.nome = nome;
    }

    public Funcionario(Double salario_base){
        this.salario_base = salario_base;
    }

    public String getNome(){
        return nome;
    }

    public double getSalario_base(){
        return salario_base;
    }

    abstract void calcular_salario_final();

    public void exibir_informacoes_de_funcionario(){
        System.out.println("\n==== INFORMAÇÕES DE FUNCIONÁRIOS ====");
        System.out.println("Nome do Funcionário: " +nome);
        System.out.println("Salário base: " +salario_base);
        System.out.println("Salário total: " +calcular_salario_final(););
    }
}