/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import ConexaoDAO.UserDAO;
import DTO.UserDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author gabi/sabino/diego
 */
public class Cadastro extends javax.swing.JFrame {

    /**
     * Creates new form CadAdotadorVIEW
     */
    public Cadastro() {
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
        txtPassword = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtEmail = new javax.swing.JTextField();
        btnCadastro = new java.awt.Button();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtNome = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        side_pane.setBackground(new java.awt.Color(255, 255, 255));
        side_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        side_pane.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 210));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(46, 43, 39));
        jLabel8.setText("by: @gagonzaga, @petile & @gsabino");
        side_pane.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 360, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Preencha os campos para se cadastrar");
        side_pane.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/images/logo.png"))); // NOI18N
        side_pane.add(logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, 210));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(102, 102, 102));
        txtPassword.setText("Senha"); // NOI18N
        txtPassword.setBorder(null);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassword(evt);
            }
        });
        side_pane.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 310, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setAlignmentX(0.1F);
        jSeparator1.setPreferredSize(new java.awt.Dimension(0, 8));
        side_pane.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 330, 20));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(102, 102, 102));
        txtEmail.setText("Email");
        txtEmail.setBorder(null);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmail(evt);
            }
        });
        side_pane.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 310, 30));

        btnCadastro.setBackground(new java.awt.Color(102, 102, 102));
        btnCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastro.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastro.setLabel("Login");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        side_pane.add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 330, 50));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Seja Bem vindo(a),");
        side_pane.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setAlignmentX(0.1F);
        jSeparator3.setPreferredSize(new java.awt.Dimension(0, 8));
        side_pane.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 330, 20));

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(102, 102, 102));
        txtNome.setText("Nome");
        txtNome.setBorder(null);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome(evt);
            }
        });
        side_pane.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 310, 30));
        side_pane.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 330, 10));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setForeground(new java.awt.Color(102, 102, 102));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adotante", "ADM" }));
        jComboBox1.setBorder(null);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        side_pane.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 330, 50));

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

    private void txtNome(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        String email, senha, nome;

        nome = txtNome.getText();
        email = txtEmail.getText();
        senha = txtPassword.getText();

        try {
            UserDTO objsUserDTO = new UserDTO();
            objsUserDTO.setNome(nome);
            objsUserDTO.setEmail(email);
            objsUserDTO.setSenha(senha);

            UserDAO objUser = new UserDAO();
            objUser.cadastrar(objsUserDTO);
            
            boolean status = true;

            if(status){
                Login dash = new Login();
                dispose();
                dash.setVisible(true);
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso, faça seu login");
            }
            
        } catch (Exception  e) {
            JOptionPane.showMessageDialog(null, "Um erro aconteceu revise os campos e tente novamente");
        }
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void txtEmail(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmail
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmail

    private void txtPassword(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassword
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassword

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnCadastro;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
    private javax.swing.JPanel side_pane;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
