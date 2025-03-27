/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Alunos
 */
public class ContaCorrente {
    private int num_conta;
    private int num_agencia;
    private int id_cli;
    private float saldo;
    
    public ContaCorrente(int num_conta,int num_agencia,int id_cli, float saldo){
        this.num_conta = num_conta;
        this.num_agencia = num_agencia;
        this.id_cli = id_cli;
        this.saldo = saldo;
    }
    
    public int getnum_conta() { return num_conta; }
    public void setnum_conta (int num_conta) { this.num_conta = num_conta; }
    
    public int getnum_agencia() { return num_agencia; }
    public void setnum_agencia (int num_agencia) { this.num_agencia = num_agencia; }
    
    public int getid_cli() { return id_cli; }
    public void setid_cli (int id_cli) { this.id_cli = id_cli; }
    
    public float getsaldo() { return saldo; }
    public void setsaldo (float saldo) { this.saldo = saldo; }
    
    public ContaCorrente(){
            
    }
      public String dadosSQLValues(){
        String dadosContaCorrente = "'"
            + this.getnum_agencia()+ "', '" 
            + this.getnum_conta()+ "', '" 
            + this.getid_cli()+ "', '" 
            + this.getsaldo()+ "'";
        return dadosContaCorrente;
}
      
      public String alteraDadoSQLValues(){
            String dadosContaCorrente;
            dadosContaCorrente = 
            "Número Agência = '" + this.getnum_agencia() +  "'," +
            "Número Conta Corrente = '" + this.getnum_conta()+ "'," +
            "Id Cliente = '" + this.getid_cli() + "'," +
            "Saldo = '"+ this.getsaldo()+ "',";
                        
            return dadosContaCorrente;
        }
}



