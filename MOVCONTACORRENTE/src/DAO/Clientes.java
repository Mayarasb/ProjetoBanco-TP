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
  
    
    
      public Clientes (int id_cli,String nome, String cpf, String endereco,String numero, 
            String complemento, String bairro, String cidade, String uf, String cep, String data_nascimento, 
            String telefone, String cnpj){
          
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
          
          
      }
      
     public int getid_cli() { return id_cli; }
    public void setid_cli(int id_cli) {
        if (id_cli <= 0) {
            JOptionPane.showMessageDialog(null, "ID do cliente deve ser maior que zero.");
            return;
        }
        this.id_cli = id_cli;
    }

    public String getnome() { return nome; }
    public void setnome(String nome) {
        if (nome == null || nome.isBlank() || nome.length() < 4) {
            JOptionPane.showMessageDialog(null, "Nome deve ter no mínimo 4 caracteres.");
            return;
        }
        this.nome = nome.trim();
    }

    public String getcpf() { return cpf; }
    public void setcpf(String cpf) {
        if (cpf == null || cpf.isBlank() || cpf.length() != 11) {
            JOptionPane.showMessageDialog(null, "CPF deve ter exatamente 11 dígitos.");
            return;
        }
        this.cpf = cpf.trim();
    }

    public String getendereco() { return endereco; }
    public void setendereco(String endereco) {
        if (endereco == null || endereco.isBlank() || endereco.length() < 4) {
            JOptionPane.showMessageDialog(null, "Endereço deve ter no mínimo 4 caracteres.");
            return;
        }
        this.endereco = endereco.trim();
    }

    public String getnumero() { return numero; }
    public void setnumero(String numero) {
        if (numero == null || numero.isBlank()) {
            JOptionPane.showMessageDialog(null, "Número não pode ser vazio.");
            return;
        }
        this.numero = numero.trim();
    }

    public String getcomplemento() { return complemento; }
    public void setcomplemento(String complemento) {
        this.complemento = (complemento != null) ? complemento.trim() : "";
    }

    public String getbairro() { return bairro; }
    public void setbairro(String bairro) {
        this.bairro = (bairro != null) ? bairro.trim() : "";
    }

    public String getcidade() { return cidade; }
    public void setcidade(String cidade) {
        if (cidade == null || cidade.isBlank() || cidade.length() < 4) {
            JOptionPane.showMessageDialog(null, "Cidade deve ter no mínimo 4 caracteres.");
            return;
        }
        this.cidade = cidade.trim();
    }

    public String getuf() { return uf; }
    public void setuf(String uf) {
        if (uf == null || uf.isBlank() || uf.length() != 2) {
            JOptionPane.showMessageDialog(null, "UF deve ter exatamente 2 letras.");
            return;
        }
        this.uf = uf.trim().toUpperCase();
    }

    public String getcep() { return cep; }
    public void setcep(String cep) {
        if (cep == null || cep.isBlank() || cep.length() < 8) {
            JOptionPane.showMessageDialog(null, "CEP deve ter no mínimo 8 caracteres.");
            return;
        }
        this.cep = cep.trim();
    }

    public String getdataNascimento() { return data_nascimento; }
    public void setdataNascimento(String data_nascimento) {
        if (data_nascimento == null || data_nascimento.isBlank() || data_nascimento.length() < 8) {
            JOptionPane.showMessageDialog(null, "Data de nascimento deve ter no mínimo 8 caracteres.");
            return;
        }
        this.data_nascimento = data_nascimento.trim();
    }

    public String gettelefone() { return telefone; }
    public void settelefone(String telefone) {
        if (telefone == null || telefone.isBlank() || telefone.length() < 8) {
            JOptionPane.showMessageDialog(null, "Telefone deve ter no mínimo 8 caracteres.");
            return;
        }
        this.telefone = telefone.trim();
    }

    public String getcnpj() { return cnpj; }
    public void setcnpj(String cnpj) {
        if (cnpj == null || cnpj.isBlank() || cnpj.length() != 14) {
            JOptionPane.showMessageDialog(null, "CNPJ deve ter exatamente 14 dígitos.");
            return;
        }
        this.cnpj = cnpj.trim();
    }
        
        
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
