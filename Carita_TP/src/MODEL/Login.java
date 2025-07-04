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
public class Login {

    private String Id;
    private String nome;
    private String cpf;
    private String email;
    private String senha;

    public Login(String Id, String nome, String cpf, String email, String senha) {
        this.Id = Id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }
    
    

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            JOptionPane.showMessageDialog(null, "O nome é obrigatório.");
            return false;
        }
        if (nome.length() < 4) {
            JOptionPane.showMessageDialog(null, "O nome deve ter no mínimo 6 caracteres.");
            return false ;
        }
        this.nome = nome;
        return true;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean setCpf(String cpf) {
        
        
        
        if (cpf == null || cpf.isBlank()) {
            JOptionPane.showMessageDialog(null, "O CPF é obrigatório.");
            return false;
        }
        
        if (cpf.length() != 14) {
            JOptionPane.showMessageDialog(null, "O CPF deve conter 14 dígitos.");
            return false;
        }
        
        if (!cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
        JOptionPane.showMessageDialog(null, "Formato de CPF inválido. Use XXX.XXX.XXX-XX");
        return false;
    }

        this.cpf = cpf;
        return true;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email == null || email.isBlank()) {
            JOptionPane.showMessageDialog(null, "O e-mail é obrigatório.");
            return false;
        }
        if (!email.contains("@")) {
            JOptionPane.showMessageDialog(null, "O e-mail deve conter '@'.");
            return false;
        }
        if (temCaracterEspecialDuplicado(email)) {
            JOptionPane.showMessageDialog(null, "O e-mail contém caracteres especiais duplicados.");
            return false;
        }
        this.email = email;
        return true;
    }

    public String getSenha() {
        return senha;
    }

    public boolean setSenha(String senha) {
        if (senha == null || senha.isBlank() || senha.length() < 4) {
            JOptionPane.showMessageDialog(null, "A senha deve ter no mínimo 4 caracteres.");
            return false;
        }
        this.senha = senha;
        return true;
    }

    public String getId() {
        return Id;
    }

    public boolean setId(String Id) {
        if (Id == null || Id.isBlank() || Id.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O ID deve ser preenchido.");
            return false;
        }
        this.Id = Id;
        return true;
    }

    public Login (){
    }
    
    public String dadosSQLValues(){
        String dadosLogin;
        dadosLogin = "'" 
            + this.getId() + "', '"  
            + this.getNome()+ "', '" 
            + this.getCpf()+ "', '" 
            + this.getEmail()+ "', '" 
            + this.getSenha() +  "'";
            
           
        return dadosLogin;
}
    public String alteraDadoSQLValues(){
            String dadosLogin;
            dadosLogin = 
            "ID = '" + this.getId() +  "'," +
            "NOME = '" + this.getNome() +  "'," +        
            "CPF = '" + this.getCpf()+ "'," +
            "EMAIL = '" + this.getEmail()+ "'," +
            "SENHA ='"  + this.getSenha()+ "'";
            
            return dadosLogin;
        }

    private boolean temCaracterEspecialDuplicado(String email) {
        String especiais = "!@#$%¨&*()_+=|\\{}\\[\\]:;\"'<>,.?/~`-";
        for (int i = 0; i < email.length() - 1; i++) {
            char atual = email.charAt(i);
            char proximo = email.charAt(i + 1);
            if (especiais.indexOf(atual) != -1 && atual == proximo) {
                return true;
            }
        }
        return false;
    }
}

