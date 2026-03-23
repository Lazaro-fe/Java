// package atividades;

public class Pessoa {
    
    private String nome;
    private int idade;


        // CONSTRUTOR
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;


    } 

    // METÓDO ACESSADOR
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    // METÓDO MODIFICADOR
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}