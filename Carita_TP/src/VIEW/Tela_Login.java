/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;
import MODEL.Login;
import DAO.connectDAO;
/**
 *
 * @author Alunos
 */
public class Tela_Login extends javax.swing.JFrame {
String operacaoAtivaGlobal ="Nenhum";
    /**
     * Creates new form Tela_Login1
     */
    public Tela_Login() {
        initComponents();
    }

    public Tela_Login(String operacaoAtiva){
        //Constructor
        initComponents();
        operacaoAtivaGlobal = operacaoAtiva;
        String operacao = "Incluir";
        
        if(operacaoAtiva.equals(operacao)){
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
            jTextField4.setVisible(true);
            jTextField5.setVisible(true);
            jButton1.setText(operacaoAtivaGlobal + " BD");
          
              }
        operacao = "Alterar";
        if(operacaoAtiva.equals(operacao)){
            jLabel2.setVisible(false);
            jLabel3.setVisible(false);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            jLabel6.setVisible(true);
           
            
           jTextField1.setVisible(false);
            jTextField2.setVisible(false);
            jTextField3.setVisible(false);
            jTextField4.setVisible(false);
            jTextField5.setVisible(true);
            jButton1.setText(operacaoAtivaGlobal + " BD");
        }
        
          operacao = "Excluir";
        if(operacaoAtiva.equals(operacao)){
            jLabel2.setVisible(false);
            jLabel3.setVisible(false);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            jLabel6.setVisible(true);
           
            
            jTextField1.setVisible(false);
            jTextField2.setVisible(false);
            jTextField3.setVisible(false);
            jTextField4.setVisible(false);
            jTextField5.setVisible(true);
            jButton1.setText("Pesquisar-Excluir");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Senha");

        jLabel5.setText("E-mail");

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Id");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("USUÁRIO");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        jButton2.setText("Limpar Tela");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ler");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("CPF");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(77, 77, 77)
                                .addComponent(jButton2)
                                .addGap(96, 96, 96)
                                .addComponent(jButton3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField3))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField4))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField1)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

         String operacao = "Incluir";
          if (operacaoAtivaGlobal.equals(operacao))
          {
            Login login_tela = new Login();              
            login_tela.setId(jTextField5.getText());
            login_tela.setNome(jTextField1.getText());
            login_tela.setCpf(jTextField2.getText());
            login_tela.setEmail(jTextField4.getText());
            login_tela.setSenha(jTextField3.getText());
            
            if (!login_tela.setId(jTextField5.getText()))
            {
                // coloca o código para selecionar o 
                // jTextField3 para digitar novamente
                jTextField5.requestFocusInWindow();
                return;
            }
            if (login_tela.setNome(jTextField1.getText()))
            {
            } else {
                // coloca o código para selecionar o
                // jTextField3 para digitar novamente
                jTextField1.requestFocusInWindow();
                return;
             }
            if (login_tela.setCpf(jTextField2.getText()))
            {
            } else {
                // coloca o código para selecionar o
                // jTextField3 para digitar novamente
                jTextField2.requestFocusInWindow();
                return;
             }
             if (login_tela.setEmail(jTextField4.getText()))
            {
            } else {
                // coloca o código para selecionar o
                // jTextField3 para digitar novamente
                jTextField4.requestFocusInWindow();
                return;
             }
             
              if (login_tela.setSenha(jTextField3.getText()))
            {
            } else {
                // coloca o código para selecionar o
                // jTextField3 para digitar novamente
                jTextField3.requestFocusInWindow();
                return;
             }


            //Inserção no banco de dados
            connectDAO objcon = new connectDAO();
            objcon.connectDB();
            objcon.insereRegistroJFBD("LOGIN", login_tela.dadosSQLValues());
          }
          
          operacao = "Alteração";
          if (operacaoAtivaGlobal.equals(operacao))
          {
              connectDAO objcon = new connectDAO();
          
            Login login_tela = new Login();              
            login_tela.setId(jTextField5.getText());
            login_tela.setNome(jTextField1.getText());
            login_tela.setCpf(jTextField2.getText());
            login_tela.setEmail(jTextField4.getText());
            login_tela.setSenha(jTextField3.getText());
                 
                 
            objcon.alteraRegistroJFBD("LOGIN", login_tela.alteraDadoSQLValues(), "ID ='" + jTextField5.getText()+"'");
                  
 
          }
          
          
           operacao = "Alterar";
          if (operacaoAtivaGlobal.equals(operacao))
          {
              connectDAO objcon = new connectDAO();
              Login login_tela = new Login();  
              login_tela = objcon.pesquisaLoginJFBD("LOGIN","ID = '" + jTextField5.getText() + "'");
          
        jTextField5.setText(login_tela.getId());
        jTextField1.setText(login_tela.getNome());
        jTextField2.setText(login_tela.getCpf());
        jTextField4.setText(login_tela.getEmail());
        jTextField3.setText(login_tela.getSenha());
        
            
                   
            jLabel6.setVisible(true);
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel5.setVisible(true);
            jLabel4.setVisible(true);
                        
            jTextField5.setVisible(true);
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField4.setVisible(true);
            jTextField3.setVisible(true);
            jButton1.setText("Alterar");
            jButton2.setVisible(false);
            jButton3.setVisible(false);
            operacaoAtivaGlobal = "Alteração";
           
                     
          }
          
          operacao = "Exclusão";
          if (operacaoAtivaGlobal.equals(operacao))
          {
              connectDAO objcon = new connectDAO();
              objcon.excluiRegistroJFBD("LOGIN","ID ='"+jTextField5.getText()+"'");
                  
            jTextField5.setText("");
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField4.setText("");
            jTextField3.setText("");
            jButton2.setVisible(false);
            jButton3.setVisible(false);
            this.dispose();
 
          }
          
          operacao = "Excluir";
          if (operacaoAtivaGlobal.equals(operacao))
          {
              connectDAO objcon = new connectDAO();
              Login login_tela = new Login();  
              login_tela = objcon.pesquisaLoginJFBD("LOGIN","ID = '" + jTextField5.getText() + "'");
          
            jTextField5.setText(login_tela.getId());
            jTextField1.setText(login_tela.getNome());
            jTextField2.setText(login_tela.getCpf());
            jTextField4.setText(login_tela.getEmail());
            jTextField3.setText(login_tela.getSenha());

          
            jLabel6.setVisible(true);
            jLabel2.setVisible(true);
            jLabel1.setVisible(true);
            jLabel3.setVisible(true);
            jLabel5.setVisible(true);
            jLabel4.setVisible(true);
                        
            jTextField5.setVisible(true);
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField4.setVisible(true);
            jTextField3.setVisible(true);
                                              
            jTextField5.setEditable(false);
            jTextField1.setEditable(false);
            jTextField2.setEditable(false);
            jTextField4.setEditable(false);
            jTextField3.setEditable(false);
            jButton1.setText("Excluir");
            jButton2.setVisible(false);
            jButton3.setVisible(false);
            operacaoAtivaGlobal = "Exclusão";
          
          }
          
    

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField5.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField4.setText("");
        jTextField3.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Login login_tela = new Login();

        jTextField5.setText(login_tela.getId());
        jTextField1.setText(login_tela.getNome());
        jTextField2.setText(login_tela.getCpf());
        jTextField4.setText(login_tela.getEmail());
        jTextField3.setText(login_tela.getSenha());

    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
