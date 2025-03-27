/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

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
        this.num_conta = num_conta;
    }

    public int getNum_age() {
        return num_age;
    }

    public void setNum_age(int num_age) {
        this.num_age = num_age;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getData_mov() {
        return data_mov;
    }

    public void setData_mov(String data_mov) {
        this.data_mov = data_mov;
    }

    public String getDebito_credito() {
        return debito_credito;
    }

    public void setDebito_credito(String debito_credito) {
        this.debito_credito = debito_credito;
    }

    public int getId_His() {
        return id_His;
    }

    public void setId_His(int id_His) {
        this.id_His = id_His;
    }

    public String getCompl_His() {
        return Compl_His;
    }

    public void setCompl_His(String Compl_His) {
        this.Compl_His = Compl_His;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float Saldo) {
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
            "Número da Agência = '" + this.getNum_age() +  "'," +
            "Número da Conta = '" + this.getNum_conta()+ "'," +
            "Data de movimentação = '" + getData_mov() + "'," +
            "Documento= '"+ this.getDocumento()+ "'," +
            "Crédito/Débito = '" +  this.getDebito_credito() +  "'," +    
            "Id Histórico = '" +  this.getId_His()+ "'," + 
            "Comp Histórico = '" +  this.getCompl_His()+ "'," + 
            "Valor = '" + this.getValor() + "'," + 
            "Saldo = '"  + this.getSaldo()+ "',";
            
            return dadosMovimentacao;
        }
}

    

