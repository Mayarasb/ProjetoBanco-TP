/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import MODEL.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class connectDAO {

    Connection con;
    public Connection connectDB(){
        JOptionPane.showMessageDialog(null, "Inicia a classe para conexão com SQL SERVER!");
 
        String caminho = "jdbc:sqlserver://localhost:1433;databaseName=USUARIOS;"
                + "encrypt=true;trustServerCertificate=true;"; 
        String usuario = "sa";
        String senha = ".";
        try {
            con = DriverManager.getConnection(caminho, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
        }
        return con;
        // con.close();
    }

 public void insereRegistroJFBD(String tabela, String strDados){
        
        con = connectDB();
        Statement stmt;
        
        try{
            stmt = con.createStatement();
            
            String sql = "INSERT INTO dbo."+tabela+" "+ "VALUES("+ strDados+")";
            JOptionPane.showMessageDialog(null, "String de Insert " +sql);
            
            try{
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Inclusão executada com sucesso!");
            } catch (SQLException erro){
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
            }
              con.close();     
        }catch (SQLException ex){
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
 }
 
 public void alteraRegistroJFBD (String tabela, String strDados, String pesquisaId){
        
        con = connectDB();
        {
           Statement stmt;
           try{
               stmt = con.createStatement();
               String sql = "Update dbo." + tabela
               + " SET " + strDados
               + " WHERE "+pesquisaId + ";";
               JOptionPane.showMessageDialog(null, "String de Update " +sql);
                                        
                    try{
                        stmt.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null, "Inclusão executada com sucesso!");
                    } 
                    catch (SQLException erro){
                        JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                        JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                        JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
                    }
                    con.close();     
            }
            catch (SQLException ex){
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
 
  public void excluiRegistroJFBD(String tabela, String pesquisaId){
        
        con = connectDB();
        {
           Statement stmt;
           try{
               stmt = con.createStatement();
               String sql = "delete from dbo." + tabela
                + " WHERE "+pesquisaId + ";";
               JOptionPane.showMessageDialog(null, "String de Update " +sql);
                                        
                    try{
                        stmt.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null, "Inclusão executada com sucesso!");
                    } 
                    catch (SQLException erro){
                        JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                        JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                        JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
                    }
                    con.close();     
            }
            catch (SQLException ex){
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
  
  public Usuario pesquisaUsuarioJFBD (String tabela, String pesquisaId){
         
        Usuario clienteReturn = new Usuario();
        String tabelaSGBD = "USUARIOS";
        if(tabela.equals(tabelaSGBD)){
         
            con = connectDB();
             
            Statement stmt;
            try{
               stmt = con.createStatement();
               
               String sql = "SELECT * FROM " + tabela
               + " WHERE "+ pesquisaId;
                
                    try{                   
                        ResultSet dados;
                        dados = stmt.executeQuery(sql);
                        if (dados.next() == false){

                           JOptionPane.showMessageDialog(null, "nenhum registro foi " + "encontrado para essa pesquisa");

                    }
                    else {
                     
                        clienteReturn.setId(dados.getString(1));
                        clienteReturn.setNome(dados.getString(2));
                        clienteReturn.setCpf(dados.getString(3));
                        clienteReturn.setEmail(dados.getString(4));
                        clienteReturn.setSenha(dados.getString(5));
                        
                    }
                   
                con.close();
                   
                return clienteReturn;
                }catch (SQLException erro){
                    JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                    JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                    JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
                }
               
            con.close();
            }catch (SQLException ex){
                Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE,null, ex);
            }
    
        }
         
        return clienteReturn;
    }
  
  public List<Usuario> consultaRegistroUsuarioBD () {
      
        con = connectDB();
        
        List<Usuario> usuarios = new ArrayList<>();
        
        Statement stmt;
        
        try{
            stmt = con.createStatement();
            String sql= "SELECT * FROM USUARIOS";
            
            try{
                 ResultSet dados = stmt.executeQuery(sql);
                 JOptionPane.showMessageDialog(null, "Select executado com sucesso!");
                 int i = 0;
                 while (dados.next()) {
                     if (i==0)
                     {
                         i++;
                          Usuario Tela_Usuario = new Usuario(
                         
                         "ID",
                         "NOME",
                         "CPF",
                         "EMAIL",
                         "SENHA");

                         usuarios.add(Tela_Usuario);
                    }

                    Usuario Tela_Usuario = new Usuario (
                        dados.getString("ID"),
                        dados.getString("NOME"),
                        dados.getString("CPF"),
                        dados.getString("EMAIL"),
                        dados.getString("SENHA")
                    );
                    usuarios.add(Tela_Usuario);
                }
                    con.close();
                    return usuarios;

             }catch (SQLException erro){
                    JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                    JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                    JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
                }
               
            con.close();
            }catch (SQLException ex){
                Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE,null, ex);
            }
            return null;
        }
}