/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro_de_pessoas.controle;

import com.mycompany.cadastro_de_pessoas.Dao.Pessoa_dao;
import com.mycompany.cadastro_de_pessoas.Modelo.Pessoa;
import java.util.ArrayList;
/**
 *
 * @author aluno.den
 */
public class Pessoa_Controle {
    
    private Pessoa_dao dao = new Pessoa_dao();
    
    public void Cadastrar(String nome, int idade){
        Pessoa p = new Pessoa(nome, idade);
        dao.inserir(p);
    }
    
    public ArrayList<Pessoa> lista_de_pessoa(){
        return dao.listar();
    }
    
    public void atualizar(int id, String nome, int idade){
        Pessoa p = new Pessoa(id, nome, idade);
        dao.atualizar(p);
    }
    
    public void remover(int id){
        dao.remover(id);
    }
    
    public ArrayList<Pessoa> buscar_por_nome (String nome){
        return dao.buscar_por_nome(nome);
    }
}
