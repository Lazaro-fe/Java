/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro_de_pessoas.Dao;

import com.mycompany.cadastro_de_pessoas.Modelo.Pessoa;
import com.mycompany.cadastro_de_pessoas.conexao_de_banco.conexao_de_banco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author aluno.den
 */
public class Pessoa_dao {
    
    public void inserir(Pessoa pessoa){
        
        String sql= "INSERT INTO pessoa(nome,idade) VALUES (?, ?)";
        try (Connection conn = conexao_de_banco.conectar();
                PreparedStatement state = conn.prepareStatement(sql)){
            state.setString(1, pessoa.getNome());
            state.setInt(2, pessoa.getIdade());
            state.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<Pessoa> listar(){
        ArrayList<Pessoa> lista  = new ArrayList<>();
        String sql = "SELECT*FROM pessoa";
        try (Connection conn = conexao_de_banco.conectar();
                Statement srate = conn.createStatement();
                ResultSet rs = srate.executeQuery(sql)){
            while(rs.next()){
                Pessoa p = new Pessoa(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getInt("idade")
                );
                lista.add(p);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return lista;
    }
    
    
    public void atualizar (Pessoa pessoa){
        String sql = "UPDATE pessoa set nome= ?, idade=?";
        try(Connection conn = conexao_de_banco.conectar();
                PreparedStatement stateme = conn.prepareStatement(sql)){
            stateme.setString(1, pessoa.getNome());
            stateme.setInt(2, pessoa.getIdade());
            stateme.setInt(3, pessoa.getId());
            stateme.execute();
            
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public void remover(int id){
        String sql = "DELETE FROM pessoa WHERE id = ?";
        try(Connection conn = conexao_de_banco.conectar();
                PreparedStatement stat = conn.prepareStatement(sql)){
                stat.setInt(1, id);
                stat.executeUpdate();    
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<Pessoa> buscar_por_nome (String nome){
        ArrayList<Pessoa> lista_pessoa = new ArrayList<>();
        String sql = "SELECT * FROM pessoa WHERE nome LIKE ?";
        try (Connection conn = conexao_de_banco.conectar();
                PreparedStatement stat = conn.prepareStatement(sql)){
            stat.setString(1, nome);
            try (ResultSet rs = stat.executeQuery()){
                while (rs.next()){
                    Pessoa p = new Pessoa(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getInt("idade")
                    );
                    lista_pessoa.add(p);
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return lista_pessoa;
    }    
}