/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package DAO;
 
 
//import java.util.List;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
//import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
// import javax.swing.table.AbstractTableModel;
 
/**
*
* @author Prof. Corredato - Controle de conexão com o banco de dados
*/
public class connectDAO {
    Connection con;
    public Connection connectDB(){
        JOptionPane.showMessageDialog(null, "Inicia a classe para conexão com SQL SERVER!");
 
        String caminho = "jdbc:sqlserver://localhost:1433;databaseName=MOV_CONTA_CORRENTE;"
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
    
    public Clientes pesquisaClienteJFBD (String tabela, String pesquisaId){
         
        Clientes clienteReturn = new Clientes();
        String tabelaSGBD = "CLIENTES";
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
                     
                        clienteReturn.setid_cli(dados.getInt(1));
                        clienteReturn.setnome(dados.getString(2));
                        clienteReturn.setendereco(dados.getString(3));
                        clienteReturn.setnumero(dados.getString(4));
                        clienteReturn.setcomplemento(dados.getString(5));
                        clienteReturn.setbairro(dados.getString(6));
                        clienteReturn.setcidade(dados.getString(7));
                        clienteReturn.setuf(dados.getString(8));
                        clienteReturn.setcep(dados.getString(9));
                        clienteReturn.settelefone(dados.getString(10));
                        clienteReturn.setcpf(dados.getString(11));
                        clienteReturn.setdataNascimento(dados.getString(12));
                        clienteReturn.setcnpj(dados.getString(13));
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
    
    public Agencias pesquisaAgenciasJFBD (String tabela, String pesquisaId){
         
        Agencias agenciaReturn = new Agencias();
        String tabelaSGBD = "AGENCIAS";
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
                     
                        agenciaReturn.setNum_agencia(dados.getInt(1));
                        agenciaReturn.setNome(dados.getString(2));
                        agenciaReturn.setEndereco(dados.getString(3));
                        agenciaReturn.setNumero(dados.getString(4));
                        agenciaReturn.setComplemento(dados.getString(5));
                        agenciaReturn.setBairro(dados.getString(6));
                        agenciaReturn.setCidade(dados.getString(7));
                        agenciaReturn.setUf(dados.getString(8));
                        agenciaReturn.setCep(dados.getString(9));
                        agenciaReturn.setTelefone(dados.getString(10));
                       
                    }
                   
                con.close();
                   
                return agenciaReturn;
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
         
        return agenciaReturn;
    }
    
    public ContaCorrente pesquisaContaCorrenteJFBD(String tabela, String pesquisaId){
         
        ContaCorrente ContaCorrenteReturn = new ContaCorrente();
        String tabelaSGBD = "CONTACORRENTE";
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
                     
                     
                        ContaCorrenteReturn.setnum_agencia(dados.getInt(1));
                        ContaCorrenteReturn.setnum_conta(dados.getInt(2));
                        ContaCorrenteReturn.setid_cli(dados.getInt(3));
                        ContaCorrenteReturn.setsaldo(dados.getFloat(4));
                        
                       
                    }
                   
                con.close();
                   
                return ContaCorrenteReturn;
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
         
        return ContaCorrenteReturn;
    }
    
    public Historicos pesquisaHistoricosJFBD (String tabela, String pesquisaId){
         
        Historicos historicoReturn = new Historicos();
        String tabelaSGBD = "HISTORICOS";
        if(tabela.equals(tabelaSGBD)){
         
            con = connectDB();
             
            Statement stmt;
            try{
               stmt = con.createStatement();
               
               String sql = " SELECT * FROM " + tabela
               + " WHERE "+ pesquisaId;
               
                    try{                   
                        ResultSet dados;
                        dados = stmt.executeQuery(sql);
                        if (dados.next() == false){

                           JOptionPane.showMessageDialog(null, "nenhum registro foi " + "encontrado para essa pesquisa");

                    }
                    else {
                     
                        historicoReturn.setId_His(dados.getInt(1));
                        historicoReturn.setDesc_historico(dados.getString(2));
                        
                    }
                   
                con.close();
                   
                return historicoReturn;
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
         
        return historicoReturn;
    }
public Movimentacao pesquisaMovimentacaoJFBD (String tabela, String pesquisaId){
         
        Movimentacao movimentacaoReturn = new Movimentacao();
        String tabelaSGBD = "MOVIMENTACAO";
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
                     
                        movimentacaoReturn.setNum_age(dados.getInt(1));
                        movimentacaoReturn.setNum_conta(dados.getInt(2));
                        movimentacaoReturn.setData_mov(dados.getString(3));
                        movimentacaoReturn.setDocumento(dados.getString(4));
                        movimentacaoReturn.setDebito_credito(dados.getString(5));
                        movimentacaoReturn.setId_His(dados.getInt(6));
                        movimentacaoReturn.setCompl_His(dados.getString(7));
                        movimentacaoReturn.setValor(dados.getFloat(8));
                        movimentacaoReturn.setSaldo(dados.getFloat(9));
                                               
                    }
                   
                con.close();
                   
                return movimentacaoReturn;
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
         
        return movimentacaoReturn;
    }

public Usuarios pesquisaUsuarioJFBD (String tabela, String pesquisaId){
         
        Usuarios usuariosReturn = new Usuarios();
        String tabelaSGBD = "USUARIOS";
        if(tabela.equals(tabelaSGBD)){
         
            con = connectDB();
             
            Statement stmt;
            try{
               stmt = con.createStatement();
               
               String sql = " SELECT * FROM " + tabela
               + " WHERE "+ pesquisaId;
               
                    try{                   
                        ResultSet dados;
                        dados = stmt.executeQuery(sql);
                        if (dados.next() == false){

                           JOptionPane.showMessageDialog(null, "nenhum registro foi " + "encontrado para essa pesquisa");

                    }
                    else {
                     
                        usuariosReturn.setId(dados.getString(1));
                        usuariosReturn.setSenha(dados.getString(2));
                        usuariosReturn.setNumero_agencia(dados.getInt(3));
                        usuariosReturn.setNumero_conta(dados.getInt(4));
                        
                                               
                    }
                   
                con.close();
                   
                return usuariosReturn;
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
         
        return usuariosReturn;
    }
}
    
    
