/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author 12726117090
 */
public class Animal {
    
    String nome;
    double comprimento;
    int numero_de_patas;
    String cor;
    String ambiente;
    double velocidade;
    
    public Animal(String nome, double comprimento, int numero_de_patas, String cor, String ambiente, double velocidade){
        this.nome = nome;
        this.comprimento = comprimento;
        this.numero_de_patas = numero_de_patas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the comprimento
     */
    public double getComprimento() {
        return comprimento;
    }

    /**
     * @param comprimento the comprimento to set
     */
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    /**
     * @return the numero_de_patas
     */
    public int getNumero_de_patas() {
        return numero_de_patas;
    }

    /**
     * @param numero_de_patas the numero_de_patas to set
     */
    public void setNumero_de_patas(int numero_de_patas) {
        this.numero_de_patas = numero_de_patas;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the ambiente
     */
    public String getAmbiente() {
        return ambiente;
    }

    /**
     * @param ambiente the ambiente to set
     */
    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    /**
     * @return the velocidade
     */
    public double getVelocidade() {
        return velocidade;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    
    public void exibir_dados(){
        System.out.print("Nome: " + getNome());
        System.out.print("Comprimento: " + getComprimento());
        System.out.print("Número de patas: " + getNumero_de_patas());
        System.out.print("Cor: " + getCor());
        System.out.print("Ambiente: " + getAmbiente());
        System.out.print("Velocidade: " + getVelocidade());
    }
}
