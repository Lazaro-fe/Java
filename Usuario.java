/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro_de_pessoas.Modelo;

/**
 *
 * @author aluno.den
 */
public class Usuario {

    private String Login;
    private String Senha;
    
    public Usuario (String Login, String Senha){
        this.Login = Login;
        this.Senha = Senha;
    }
    
    public String getLogin() {
        return Login;
    }
    
    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
}
