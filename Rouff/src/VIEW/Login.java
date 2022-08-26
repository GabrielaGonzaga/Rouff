/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import ConexaoDAO.AdotadorDAO;
import DTO.AdotadorDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author gsabi
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form CadAdotadorVIEW
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        side_pane = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        logo1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtEmail = new javax.swing.JTextField();
        btnLogin = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        side_pane.setBackground(new java.awt.Color(255, 255, 255));
        side_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        side_pane.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 210));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(46, 43, 39));
        jLabel8.setText("by: @gagonzaga, @petile & @gsabino");
        side_pane.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 360, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Seja Bem  vindo, Faça seu login");
        side_pane.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/images/logo.png"))); // NOI18N
        side_pane.add(logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 210));
        side_pane.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 330, 10));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(102, 102, 102));
        txtPassword.setText("Senha"); // NOI18N
        txtPassword.setBorder(null);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassword(evt);
            }
        });
        side_pane.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 310, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setAlignmentX(0.1F);
        jSeparator1.setPreferredSize(new java.awt.Dimension(0, 8));
        side_pane.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 330, 20));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(102, 102, 102));
        txtEmail.setText("Email");
        txtEmail.setBorder(null);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmail(evt);
            }
        });
        side_pane.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 310, 30));

        btnLogin.setBackground(new java.awt.Color(102, 102, 102));
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setLabel("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        side_pane.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 330, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(side_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(side_pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPassword(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassword
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassword

    private void txtEmail(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmail
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmail

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
         String nome, email;
        
        nome = txtEmail.getText();
        email = txtPassword.getText();
        
        try {
            AdotadorDTO objadotadordto = new AdotadorDTO();
            objadotadordto.setNome(nome);
            objadotadordto.setEmail(email);

            AdotadorDAO objadotadordao = new AdotadorDAO();
            objadotadordao.cadastrarAdotante(objadotadordto);
            
            boolean status = true ;
             
            if(status){
                DashBoard dash = new DashBoard();
                dispose();
                dash.setVisible(true);
            }
        } catch (Exception  e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel fazer login "+ e);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnLogin;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
    private javax.swing.JPanel side_pane;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}