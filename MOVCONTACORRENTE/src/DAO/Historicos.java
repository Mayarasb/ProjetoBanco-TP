/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Alunos
 */
public class Historicos {
    private int Id_His;
    private String Desc_historico;
    
    public Historicos (int Id_His,String historico){
        this.Id_His = Id_His;
        this.Desc_historico = historico;
    }
    
    public int getId_His() { return Id_His; }
    public void setId_His(int Id_His) { this.Id_His = Id_His; }
    
    public String getdesc_historico() { return Desc_historico; }
    public void setDesc_historico(String historico) { this.Desc_historico = historico; }
    
    public Historicos(){
    }
    
      public String dadosSQLValues(){
        String dadosHistorico;
        dadosHistorico = 
            "'" + this.getId_His()+ "'" + "," +
            "'" + this.getdesc_historico()+ "'";
        return dadosHistorico;
}
      public String alteraDadoSQLValues(){
            String dadosHistorico;
            dadosHistorico = 
            "ID_HIS = '" + this.getId_His() +  "'," +
            "DES_HIS = '"  + this.getdesc_historico()+ "'";
            
            return dadosHistorico;
        }
}


