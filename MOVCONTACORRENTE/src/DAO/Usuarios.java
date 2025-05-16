/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import javax.swing.JOptionPane;


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
        if (numero_agencia <= 0) {
            JOptionPane.showMessageDialog(null, "Número da agência deve ser maior que zero.");
            return;
        }
        this.numero_agencia = numero_agencia;
    }

    public int getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(int numero_conta) {
        if (numero_conta <= 0) {
            JOptionPane.showMessageDialog(null, "Número da conta deve ser maior que zero.");
            return;
        }
        this.numero_conta = numero_conta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha == null || senha.isBlank() || senha.length() < 4) {
            JOptionPane.showMessageDialog(null, "A senha deve ter no mínimo 4 caracteres.");
            return;
        }
        this.senha = senha;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        if (Id == null || Id.isBlank() || Id.length() < 4) {
            JOptionPane.showMessageDialog(null, "O ID deve ter no mínimo 4 caracteres.");
            return;
        }
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