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
    
    public static Connection conector(){
        java.sql.Connection conexao = null;
        //iniciar o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        //nome, usuario, seha, ip...
        String url = "jdbc:mysql://ProjetoFerias:3306/dbprojetoferias";
        String user = "root";
        String password = "";
        //conexao com  o banco
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        }catch(Exception e){
            return null;
        }
    }
}