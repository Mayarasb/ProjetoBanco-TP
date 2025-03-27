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
public class Clientes {
    private int id_cli;
    private String nome;
    private String cpf;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String data_nascimento;
    private String telefone;
    private String cnpj;
    private String sexo;
    
    
      public Clientes (int id_cli,String nome, String cpf, String endereco,String numero, 
            String complemento, String bairro, String cidade, String uf, String cep, String data_nascimento, 
            String telefone, String cnpj, String sexo){
          
          this.id_cli = id_cli;
          this.nome = nome;
          this.cpf = cpf;
          this.endereco = endereco;
          this.numero = numero;
          this.complemento = complemento;
          this.bairro = bairro;
          this.cidade = cidade;
          this.uf = uf;
          this.cep = cep;
          
         
          this.telefone = telefone;
          this.cnpj = cnpj;
          this.sexo = sexo;
          
      }
      
        public int getid_cli() { return id_cli; }
        public void setid_cli(int id_cli) { this.id_cli = id_cli; }
        
        public String getnome() { return nome; }
        public void setnome(String nome) { this.nome = nome; }
        
        public String getcpf() { return cpf; }
        public void setcpf(String cpf) { this.cpf = cpf; }
        
        public String getendereco() { return endereco; }
        public void setendereco(String endereco) { this.endereco = endereco; }
        
        public String getnumero() { return numero; }
        public void setnumero(String numero) { this.numero = numero; }
        
        public String getcomplemento() { return complemento; }
        public void setcomplemento(String complemento) { this.complemento = complemento; }
        
        public String getbairro() { return bairro; }
        public void setbairro(String bairro) { this.bairro = bairro; }
        
        public String getcidade() { return cidade; }
        public void setcidade(String cidade) { this.cidade = cidade; }
        
        public String getuf() { return uf; }
        public void setuf(String uf) { this.uf = uf; }
        
        public String getcep() { return cep; }
        public void setcep(String cep) { this.cep = cep; }
        
        public String getdataNascimento() { return data_nascimento; }
        public void setdataNascimento(String data_nascimento) { this.data_nascimento = data_nascimento; }
        
       
        
        public String gettelefone() { return telefone; }
        public void settelefone(String telefone) { this.telefone = telefone; }
        
        public String getcnpj() { return cnpj; }
        public void setcnpj(String cnpj) { this.cnpj = cnpj; }
        
        public String getsexo() { return sexo; }
        public void setsexo(String sexo) { this.sexo = sexo; }
        
        public Clientes(){
            
        }
        
        public String dadosSQLValues(){
        String dadosClientes;
        dadosClientes = 
            "'" + this.getid_cli() + "'" + "," +
            "'" + this.getnome()+ "'" + "," +
            "'" + this.getendereco()+ "'" + "," +
            "'" + this.getnumero()+ "'" + "," +
            "'" + this.getcomplemento() + "'" + "," +
            "'" + this.getbairro()+ "'" + "," +
            "'" + this.getcidade()+ "'" + "," +
            "'" + this.getuf() + "'" + "," +
            "'" + this.getcep()+ "'" + "," +
            "'" + this.gettelefone()+ "'" + "," +
            "'" + this.getcpf()+ "'" + "," +
            "'" + this.getdataNascimento()+ "'" + "," + 
            "'" + this.getcnpj()+ "'";
            // JOptionPane.showMessageDialog(null, "String de Insert " +dadosClientes);
        return dadosClientes;
}
        public String alteraDadoSQLValues(){
            String dadosClientes;
            dadosClientes = 
            "ID_CLI = '" + this.getid_cli() +  "'," +
            "NOME_CLI = '" + this.getnome()+ "'," +
            "ENDE_CLI = '" + this.getendereco() + "'," +
            "NUME_CLI = '"+ this.getnumero()+ "'," +
            "COMPL_CLI = '" + this.getcomplemento() +  "'," +    
            "BAIR_CLI = '" + this.getbairro()+ "'," + 
            "CIDA_CLI = '" + this.getbairro()+ "'," + 
            "UF_CLI = '" + this.getuf() + "'," + 
            "CEP_CLI = '" + this.getcep()+ "'," + 
            "FONE_CLI = '" + this.gettelefone()+ "'," + 
            "CPF_CLI = '" + this.getcpf()+ "'," + 
            "DATA_NASC = '" + this.getdataNascimento() + "'," + 
            "CNPJ_CLI = '"  + this.getcnpj()+ "'";
            
            return dadosClientes;
        }
   

}
