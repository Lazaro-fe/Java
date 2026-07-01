/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author 12726117090
 */
public class Tabela_de_Animais {
    
    public static void main (String[] args){
        
        Baleia jubarte = new Baleia("Baleia-jubarte", 12, 0, "Azul", "Mar", 23.4, "Mamífero", "Peixe, Plâncton, Anchovas e Anchovas");
        Peixe piraruquivis = new Peixe("Pirarucu", 6, 0, "Verde", "Água doce", 50, "Peixe de água doce");
        
        System.out.println("Nome do animal: " + jubarte.getNome());
        System.out.println("Alimento: " + jubarte.getAlimento());
        System.out.println("Característica: " + piraruquivis.getCaracteristica());
    }
}
