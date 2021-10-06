/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dal;

import java.sql.*;

/**
 *
 * @author gui
 */
public class ModuloConexao {
    
    private static ModuloConexao instancia;
    
    private ModuloConexao(){
        java.sql.Connection conexao = null;
        //iniciar o driver
        String driver = "com.mysql.jdbc.Driver";
        //nome, usuario, seha, ip...
        String url = "jdbc:mysql://localhost:3306/dbprojetoferias";
        String user = "root";
        String password = "";
        //conexao com  o banco
        
    }
    
    public static synchronized ModuloConexao getInstance(){
        if (instancia == null){
            instancia = new ModuloConexao();
        }
        return instancia;
    }
    
    public void conectar(){
        System.out.print("conectado");
    }
    public void desconectar(){
        
    }
}