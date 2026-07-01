/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author 12726117090
 */
public class Peixe extends Animal {

    private String caracteristica;
    
    public Peixe(String nome, double comprimento, int numero_de_patas, String cor, String ambiente, double velocidade, String caracteristica){
        super(nome, comprimento, numero_de_patas, cor, ambiente, velocidade);
        this.caracteristica = caracteristica;
    }
    
    /**
     * @return the caracteristica
     */
    public String getCaracteristica() {
        return caracteristica;
    }

    /**
     * @param caracteristica the caracteristica to set
     */
    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    
    @Override
    public void exibir_dados(){
        System.out.println("Características: " +getCaracteristica());
    }
}
