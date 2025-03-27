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
public class Agencias {
    
        private int num_agencia;
        private String nome;
        private String endereco;
        private String numero;
        private String complemento;
        private String bairro;
        private String cidade;
        private String uf;
        private String cep;
        private String telefone;
        
    
        public Agencias( int num_agencia,String nome,String endereco,String numero,String complemento,String bairro,
                String cidade,String uf,String cep,String telefone){
            this.num_agencia = num_agencia;
            this.nome = nome;
            this.endereco = endereco;
            this.numero = numero;
            this.complemento = complemento;
            this.bairro = bairro;
            this.cidade = cidade;
            this.uf = uf;
            this.cep = cep;
            this.telefone = telefone;
           
        }

    public int getNum_agencia() { return num_agencia;}
    public void setNum_agencia(int num_agencia){
        if (num_agencia <= 0) {
            JOptionPane.showMessageDialog(null, "Número da agência deve ser maior que zero.");
            return;
        }
        this.num_agencia = num_agencia;
    }
    
     

    public String getNome() {return nome;}
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome não pode ser vazio.");
            return;
        }
        this.nome = nome;
    }

    public String getEndereco() {return endereco;}
   public void setEndereco(String endereco) {
        if (endereco == null || endereco.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Endereço não pode ser em branco ou nulo!");
            return;
        }
        this.endereco = endereco;
    }
   

    public String getNumero() {return numero;}
    public void setNumero(String numero) {this.numero = numero;}

    public String getComplemento() {return complemento;}
    public void setComplemento(String complemento) {this.complemento = complemento;}
      
    public String getBairro() { return bairro;}
    public void setBairro(String bairro)  {
        if (bairro == null || bairro.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bairro não pode ser vazio.");
            return;
        }
        this.bairro = bairro;
    }
    

    public String getCidade() {return cidade;}
    public void setCidade(String cidade){
        if (cidade == null || cidade.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cidade não pode ser vazia.");
            return;
        }
        this.cidade = cidade;
    }
    
    public String getUf() {return uf;}
    public void setUf(String uf) {
        if (uf == null || uf.length() != 2) {
            JOptionPane.showMessageDialog(null, "UF deve ter exatamente 2 caracteres.");
            return;
        }
        this.uf = uf.toUpperCase(); // Armazenar em maiúsculas
    }

    public String getCep() {return cep;}
    public void setCep(String cep) { this.cep = cep; }
        
    
    
   
    public String getTelefone() {return telefone;}
    public void setTelefone(String telefone)  { this.telefone = telefone; }
        

                 
    public Agencias(){
    }     
     
      public String dadosSQLValues(){
        String dadosAgencias;
        dadosAgencias = 
            "'" + this.getNum_agencia() + "'" + "," +
            "'" + this.getNome()+ "'" + "," +
            "'" + this.getEndereco()+ "'" + "," +
            "'" + this.getNumero()+ "'" + "," +
            "'" + this.getComplemento()+ "'" + "," +
            "'" + this.getBairro()+ "'" + "," +
            "'" + this.getCidade() + "'" + "," +
            "'" + this.getUf()+ "'" + "," +
            "'" + this.getCep()+ "'" + "," +
            "'" + this.getTelefone()+ "'";
        return dadosAgencias;
}
      public String alteraDadoSQLValues(){
            String dadosAgencias;
            dadosAgencias = 
            "NUM_AGE = '" + this.getNum_agencia() +  "'," +
            "NOME_AGE = '" + this.getNome()+ "'," +
            "ENDE_AGE = '" + this.getEndereco() + "'," +
            "NUME_AGE = '"+ this.getNumero()+ "'," +
            "COMPL_AGE = '" + this.getComplemento() +  "'," +    
            "BAIR_AGE = '" + this.getBairro()+ "'," + 
            "CIDA_AGE = '" + this.getCidade()+ "'," + 
            "UF_AGE = '" + this.getUf() + "'," + 
            "CEP_AGE = '" + this.getCep()+ "'," + 
            "FONE_AGE = '"  + this.getTelefone()+"'";
            
            return dadosAgencias;
        }
      

}
