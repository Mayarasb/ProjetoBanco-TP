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
    public void setnum_conta(int num_conta) {
        if (num_conta <= 0) {
            JOptionPane.showMessageDialog(null, "Número da conta deve ser maior que zero.");
            return;
        }
        this.num_conta = num_conta;
    }

    public int getnum_agencia() { return num_agencia; }
    public void setnum_agencia(int num_agencia) {
        if (num_agencia <= 0) {
            JOptionPane.showMessageDialog(null, "Número da agência deve ser maior que zero.");
            return;
        }
        this.num_agencia = num_agencia;
    }

    public int getid_cli() { return id_cli; }
    public void setid_cli(int id_cli) {
        if (id_cli <= 0) {
            JOptionPane.showMessageDialog(null, "ID do cliente deve ser maior que zero.");
            return;
        }
        this.id_cli = id_cli;
    }

    public float getsaldo() { return saldo; }
    public void setsaldo(float saldo) {
        if (saldo < 0) {
            JOptionPane.showMessageDialog(null, "Saldo não pode ser negativo.");
            return;
        }
        this.saldo = saldo;
    
}
    
    public ContaCorrente(){
            
    }
      public String dadosSQLValues(){
        String dadosContaCorrente =
            "'" + this.getnum_agencia()+ "'," +
            "'" + this.getnum_conta()+ "'," +
            "'" + this.getid_cli()+ "'," +
            "'"  + this.getsaldo()+  "'";
        return dadosContaCorrente;
}
      
      public String alteraDadoSQLValues(){
            String dadosContaCorrente;
            dadosContaCorrente = 
            "NUM_AGE = '" + this.getnum_agencia() +  "'," +
            "NUM_CC = '" + this.getnum_conta() + "'," +
            "ID_CLI = '" + this.getid_cli() + "'," +
            "SALDO = '"+ this.getsaldo()+ "'";
                        
            return dadosContaCorrente;
        }
}



