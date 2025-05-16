/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Usuario {

    private String Id;
    private String nome;
    private String cpf;
    private String email;
    private String senha;

    public Usuario(String Id, String nome, String cpf, String email, String senha) {
        this.Id = Id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        if (Id == null || Id.isBlank()) {
            JOptionPane.showMessageDialog(null, "O ID deve ter no mínimo 4 caracteres.");
            return;
        }
        this.Id = Id;
    }

    public Usuario (){
    }
    
    public String dadosSQLValues(){
        String dadosUsuario;
        dadosUsuario = "'" 
            + this.getNome()+ "', '" 
            + this.getCpf()+ "', '" 
            + this.getEmail()+ "', '" 
            + this.getSenha() + "', '" 
            + this.getId() + "'";
           
        return dadosUsuario;
}
    public String alteraDadoSQLValues(){
            String dadosUsuarios;
            dadosUsuarios = 
            "ID = '" + this.getId() +  "'," +
            "CPF = '" + this.getCpf()+ "'," +
            "EMAIL = '" + this.getEmail()+ "'," +
            "SENHA ='"  + this.getSenha()+ "',";
            
            return dadosUsuarios;
        }
}

