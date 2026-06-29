/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacao_orientada_a_objetos;

/**
 *
 * @author 12726117090
 */
public class Carro {

    // Atributos
    private String cor;
    private String modelo;
    private int velocidade;
    
    // Construtor
    public Carro (String cor, String modelo){
        setCor(cor);
        this.modelo = modelo;
        this.velocidade = 0;
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
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the velocidade
     */
    public int getVelocidade() {
        return velocidade;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    public void acelerar(int incrementar){
        setVelocidade(getVelocidade() + incrementar);
    }
    
    public void frear(int decrementar){
        setVelocidade(getVelocidade() - decrementar);
    }
}
