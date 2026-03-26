// package atividades;
public class Funcionarios {
    private String nome_funcionario;
    private int idade;
    private double salario_funcionario;

    public Funcionarios(String nome_funcionario, int idade, double salario_funcionario){
        this.nome_funcionario = nome_funcionario;
        this.idade = idade;
        this.salario_funcionario = salario_funcionario;
    }

    public String getNome_de_funcionario(){
        return nome_funcionario;
    }

    public int getIdade(){
        return idade;
    }

    public double getSalario_de_funcionario(){
        return salario_funcionario;
    }

    public void setNome_de_funcionario(String nome_de_funcionario){
        this.nome_funcionario = nome_de_funcionario;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setSalario_de_funcionarios(double salario_funcionario){
        this.salario_funcionario = salario_funcionario;
    }

    public void exibirInfor(){
        System.out.println("Nome de funcionário: "+nome_funcionario);
        System.out.println("Idade: "+idade);
        System.out.println("Salário de Funcionário: "+salario_funcionario);
    }
}
