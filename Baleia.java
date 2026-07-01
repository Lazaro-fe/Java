/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author 12726117090
 */
public class Baleia extends Animal{

    private String tipo_de_animal;
    private String alimento;
    
    public Baleia(String nome, double comprimento, int numero_de_patas, String cor, String ambiente, double velocidade, String tipo_de_animal, String alimento){
        super(nome, comprimento, numero_de_patas, cor, ambiente, velocidade);
        this.tipo_de_animal = tipo_de_animal;
        this.alimento = alimento;
    }
    
    
    /**
     * @return the tipo_de_animal
     */
    public String getTipo_de_animal() {
        return tipo_de_animal;
    }

    /**
     * @param tipo_de_animal the tipo_de_animal to set
     */
    public void setTipo_de_animal(String tipo_de_animal) {
        this.tipo_de_animal = tipo_de_animal;
    }

    /**
     * @return the alimento
     */
    public String getAlimento() {
        return alimento;
    }

    /**
     * @param alimento the alimento to set
     */
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    
    public void exibir_dados(){
        System.out.println("Tipo de animal: " +getTipo_de_animal());
        System.out.println("Alimento: " +getAlimento());
    }
}
