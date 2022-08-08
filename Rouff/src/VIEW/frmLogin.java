package VIEW;

import DTO.UserDTO;
import DB.UserDB;
import javax.swing.JPanel;

public class frmLogin extends javax.swing.JFrame {

    public frmLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        side_pane1 = new javax.swing.JPanel();
        logo1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        side_pane = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnLogin = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();

        side_pane1.setBackground(new java.awt.Color(255, 255, 255));
        side_pane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/images/logo.png"))); // NOI18N
        side_pane1.add(logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 210));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField4.setText("  Senha");
        jTextField4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        side_pane1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 330, 50));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton2.setText("Login");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        side_pane1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 330, 50));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(46, 43, 39));
        jLabel11.setText("by: @gagonzaga, @petile & @gsabino");
        side_pane1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 360, 30));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Faça seu Login");
        side_pane1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField5.setText("  Email");
        jTextField5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        side_pane1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 330, 50));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Seja Bem-vindo");
        side_pane1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        side_pane.setBackground(new java.awt.Color(255, 255, 255));
        side_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(46, 43, 39));
        jLabel8.setText("by: @gagonzaga, @petile & @gsabino");
        side_pane.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 190, 20));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/images/logo.png"))); // NOI18N
        side_pane.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, 210));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Faça seu Login");
        side_pane.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(102, 102, 102));
        txtEmail.setText("Email");
        txtEmail.setBorder(null);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmail(evt);
            }
        });
        side_pane.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 310, 30));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Seja Bem-vindo");
        side_pane.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setAlignmentX(0.1F);
        jSeparator1.setPreferredSize(new java.awt.Dimension(0, 8));
        side_pane.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 330, 20));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(102, 102, 102));
        txtPassword.setText("Senha"); // NOI18N
        txtPassword.setBorder(null);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassword(evt);
            }
        });
        side_pane.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 310, 30));
        side_pane.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 330, 10));

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
        side_pane.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 330, 50));

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(side_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(side_pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void txtPassword(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassword
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassword

    private void txtEmail(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmail
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmail

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String email, password;
        
        email = txtEmail.getText();
        password = txtPassword.getText();
        
        UserDTO objUser = new UserDTO();
        objUser.setEmail(email);
        objUser.setPassword(password);
        
        UserDB objUserDB = new UserDB();
        objUserDB.userLogin(objUser);
    }//GEN-LAST:event_btnLoginActionPerformed

    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnLogin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
    private javax.swing.JPanel side_pane;
    private javax.swing.JPanel side_pane1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables

    private void setColor(JPanel btn_2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void resetColor(JPanel[] jPanel, JPanel[] jPanel0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
