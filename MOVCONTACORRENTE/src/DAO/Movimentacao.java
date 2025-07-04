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
public class Movimentacao {
    private int num_conta;
    private int num_age;
    private String documento;
    private String data_mov;
    private String debito_credito;
    private int id_His;
    private String Compl_His;
    private float Valor;
    private float Saldo;
    
    
    public Movimentacao ( int num_conta, int num_age, String documento, String data_mov, String debito_credito,
            int id_His,String Compl_His,float Valor, float Saldo){
    
    
}

  public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        if (num_conta <= 0) {
            JOptionPane.showMessageDialog(null, "Número da conta deve ser maior que zero.");
            return;
        }
        this.num_conta = num_conta;
    }

    public int getNum_age() {
        return num_age;
    }

    public void setNum_age(int num_age) {
        if (num_age <= 0) {
            JOptionPane.showMessageDialog(null, "Número da agência deve ser maior que zero.");
            return;
        }
        this.num_age = num_age;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        if (documento == null || documento.isBlank() || documento.length() < 4) {
            JOptionPane.showMessageDialog(null, "Documento deve ter no mínimo 4 caracteres.");
            return;
        }
        this.documento = documento;
    }

    public String getData_mov() {
        return data_mov;
    }

    public void setData_mov(String data_mov) {
        if (data_mov == null || data_mov.isBlank() || data_mov.length() < 4) {
            JOptionPane.showMessageDialog(null, "Data da movimentação deve ter no mínimo 4 caracteres.");
            return;
        }
        this.data_mov = data_mov;
    }

    public String getDebito_credito() {
        return debito_credito;
    }

    public void setDebito_credito(String debito_credito) {
        if (debito_credito == null || debito_credito.isBlank()) {
            JOptionPane.showMessageDialog(null, "Campo Débito/Crédito não pode ser nulo ou em Branco");
            return;
        }
        this.debito_credito = debito_credito;
    }

    public int getId_His() {
        return id_His;
    }

    public void setId_His(int id_His) {
        if (id_His <= 0) {
            JOptionPane.showMessageDialog(null, "ID do histórico deve ser maior que zero.");
            return;
        }
        this.id_His = id_His;
    }

    public String getCompl_His() {
        return Compl_His;
    }

    public void setCompl_His(String Compl_His) {
        if (Compl_His == null || Compl_His.isBlank() || Compl_His.length() < 4) {
            JOptionPane.showMessageDialog(null, "Complemento do histórico deve ter no mínimo 4 caracteres.");
            return;
        }
        this.Compl_His = Compl_His;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        if (Valor <= 0) {
            JOptionPane.showMessageDialog(null, "Valor da movimentação deve ser maior que zero.");
            return;
        }
        this.Valor = Valor;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float Saldo) {
        if (Saldo < 0) {
            JOptionPane.showMessageDialog(null, "Saldo não pode ser negativo.");
            return;
        }
        this.Saldo = Saldo;
    }

   
    
    public Movimentacao(){
    }
    
      public String dadosSQLValues(){
        String dadosMovimentacao;
        dadosMovimentacao = 
            "'" + this.getNum_age() + "'" + "," +
            "'" + this.getNum_conta()+ "'" + "," +
            "'" + this.getData_mov()+ "'" + "," +
            "'" + this.getDocumento()+ "'" + "," +
            "'" + this.getDebito_credito()+ "'" + "," +
            "'" + this.getId_His() + "'" + "," +
            "'" + this.getCompl_His() + "'" + "," +
            "'" + this.getValor()+ "'" + "," +
            "'" + this.getSaldo()+ "'";
        return dadosMovimentacao;
}
      public String alteraDadoSQLValues(){
            String dadosMovimentacao;
            dadosMovimentacao = 
            "NUM_AGE = '" + this.getNum_age() +  "'," +
            "NUM_CC = '" + this.getNum_conta()+ "'," +
            "DATA_MOV = '" + getData_mov() + "'," +
            "NUM_DOCTO = '"+ this.getDocumento()+ "'," +
            "DEBITO_CREDITO = '" +  this.getDebito_credito() +  "'," +    
            "ID_HIS = '" +  this.getId_His()+ "'," + 
            "COMPL_HIS = '" +  this.getCompl_His()+ "'," + 
            "VALOR = '" + this.getValor() + "'," + 
            "SALDO = '"  + this.getSaldo()+ "'";
            
            return dadosMovimentacao;
        }
}

    

