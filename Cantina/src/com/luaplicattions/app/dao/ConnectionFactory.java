package com.luaplicattions.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

//classe responsável por gerenciar a abertura e o fechamento da conexão do BD com o programa
public class ConnectionFactory {
    //a variavel Drive recebe o objeto driver da biblioteca jdbc
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    //aqui virá a url do banco de dados conseguimos ela através do arquivo persistence.
    private static final String URL = "";
    //aqui vem o usuario que irá acessar o banco
    private static final String USER = "root";
    //aqui vem a senha do usuário do banco;
    private static final String PASS = "";
    
     //metodo do tipo Connection importado do pacote:
     //java.slq.Connection | abre a conexão com o BD
    public static Connection getConnection(){
        try {
                //vamos carregar aqui a classe do driver
                //esclher a opção circundar com try-catch
                Class.forName(DRIVER);

                //é um metodo estástico,então não precisa estanciar
                //escolher a sobrecarga com o url user e o password
                return DriverManager.getConnection(URL, USER, PASS);
            }catch (ClassNotFoundException | SQLException ex) {// foi feito um catch e depois transformado em multcatch
            //retorna e trata o erro se a conexão der errado
            //retorna e trata o erro se não for encontrada a classe
            
            throw new RuntimeException("erro na conexão: ", ex);
            //lança uma exceção para ser tratada em execução;
        } 
    }
    
    public static void closeConnection(Connection con){
        //se a conexão não estiver vazia (sendo usada)
        if (con != null){
            try {
                //feche a conexão
                con.close();
            } catch (SQLException ex) {
                //caso ela nõ consiga ser fechada lançar a exceção...
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
        //reutilizando o metodo criado anteriormente
        closeConnection(con);
        
        //fecha a conexão do stmt
        try {
            //verificado se o mtl for diferente de vazio eleirá fechar
            if(stmt != null){
                stmt.close();
            }  
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        closeConnection(con, stmt);
        
        try {
            if(rs != null){
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
