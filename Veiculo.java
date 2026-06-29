/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacao_orientada_a_objetos;

/**
 *
 * @author 12726117090
 */
public class Veiculo {
    
    public static void main(String [] args){
        
        Carro meuCarro = new Carro("Vermelho", "sEDAN");
        
        meuCarro.acelerar(50);
        System.out.println("Velocidade atual : " +meuCarro.getVelocidade());
        
        meuCarro.frear(25);
        System.out.println("Velocidade atual : " +meuCarro.getVelocidade());
        
        System.out.println("A cor do carro é : " + meuCarro.getCor());
    }
}
