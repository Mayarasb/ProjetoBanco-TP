/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;



/**
 *
 * @author Alunos
 */
public class Usuarios {
    private int numero_agencia;
    private int numero_conta;
    private String senha;
    private String Id;
    
    
    public Usuarios(int numero_agencia,int numero_conta, String senha,String Id){
    this.numero_agencia = numero_agencia;
    this.numero_conta = numero_conta;
    this.senha = senha;
    this.Id = Id;
            
    }

    public int getNumero_agencia() {
        return numero_agencia;
    }

    public void setNumero_agencia(int numero_agencia) {
        this.numero_agencia = numero_agencia;
    }

    public int getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(int numero_conta) {
        this.numero_conta = numero_conta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    
    
    public Usuarios (){
    }
    
    public String dadosSQLValues(){
        String dadosUsuarios;
        dadosUsuarios = "'" 
            + this.getId()+ "', '" 
            + this.getSenha() + "', '" 
            + this.getNumero_agencia() + "', '" 
            + this.getNumero_conta() + "'";
           
        return dadosUsuarios;
}
    public String alteraDadoSQLValues(){
            String dadosUsuarios;
            dadosUsuarios = 
            "ID = '" + this.getId() +  "'," +
            "SENHA = '" + this.getSenha()+ "'," +
            "NUM_AGE = '" + this.getNumero_agencia() + "'," +
            "NUM_CC'"  + this.getNumero_conta()+ "',";
            
            return dadosUsuarios;
        }
}