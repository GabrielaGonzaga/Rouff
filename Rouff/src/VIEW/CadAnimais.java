/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import ConexaoDAO.AnimalDAO;
import ConexaoDAO.Conexaobd;
import ConexaoDAO.UserDAO;
import DTO.AnimalDTO;
import DTO.UserDTO;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author gabi/sabino/diego
 */
public class CadAnimais extends javax.swing.JFrame {

    /**
     * Creates new form CadAdotadorVIEW
     */
    public CadAnimais() {
        initComponents();
        listarUsuarios();
        //listarUsua();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        side_pane1 = new javax.swing.JPanel();
        logo2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDescricao = new java.awt.TextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtRaca = new javax.swing.JTextField();
        txtTipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        tablePane = new javax.swing.JScrollPane();
        tableAnimals = new javax.swing.JTable();
        btnCadastro = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        logo1 = new javax.swing.JLabel();

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        side_pane1.setBackground(new java.awt.Color(255, 255, 255));
        side_pane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        side_pane1.add(logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 210));

        txtNome.setBackground(new java.awt.Color(243, 218, 202));
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(102, 102, 102));
        txtNome.setBorder(null);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome(evt);
            }
        });
        side_pane1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 430, 47));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Novo Animal");
        side_pane1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 290, -1));

        txtDescricao.setBackground(new java.awt.Color(243, 218, 202));
        txtDescricao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        side_pane1.add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 450, 140));

        jPanel4.setBackground(new java.awt.Color(243, 218, 202));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        side_pane1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 90, 47));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nome");
        side_pane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Raça");
        side_pane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, -1));

        jPanel5.setBackground(new java.awt.Color(243, 218, 202));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        side_pane1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 120, 47));

        txtRaca.setBackground(new java.awt.Color(243, 218, 202));
        txtRaca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRaca.setForeground(new java.awt.Color(102, 102, 102));
        txtRaca.setBorder(null);
        txtRaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRaca(evt);
            }
        });
        side_pane1.add(txtRaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 450, 47));

        txtTipo.setBackground(new java.awt.Color(255, 255, 255));
        txtTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTipo.setForeground(new java.awt.Color(102, 102, 102));
        txtTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gato", "Cachorro" }));
        txtTipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 218, 202), 3));
        txtTipo.setFocusable(false);
        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });
        side_pane1.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 470, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Descrição");
        side_pane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 90, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(46, 43, 39));
        jLabel8.setText("by: @gagonzaga, @petile & @gsabino");
        side_pane1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, 190, 30));

        btnVoltar.setBackground(new java.awt.Color(223, 151, 107));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.setToolTipText("");
        btnVoltar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        side_pane1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, 40));

        tablePane.setBackground(new java.awt.Color(62, 120, 198));
        tablePane.setForeground(new java.awt.Color(204, 204, 0));

        tableAnimals.setBackground(new java.awt.Color(255, 255, 255));
        tableAnimals.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableAnimals.setForeground(new java.awt.Color(51, 51, 51));
        tableAnimals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Animal", "Adotante", "status"
            }
        ));
        tableAnimals.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tableAnimals.setRowHeight(30);
        tablePane.setViewportView(tableAnimals);

        side_pane1.add(tablePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 990, 220));

        btnCadastro.setBackground(new java.awt.Color(141, 103, 71));
        btnCadastro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastro.setText("Casdastrar");
        btnCadastro.setToolTipText("");
        btnCadastro.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        side_pane1.add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 320, 260, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tipo");
        side_pane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 50, -1));

        logo1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logo1.setForeground(new java.awt.Color(255, 255, 255));
        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/images/cadAni_bkgd.png"))); // NOI18N
        logo1.setText("    ");
        side_pane1.add(logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1160, 790));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(side_pane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(side_pane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 730, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNome(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome

    private void txtRaca(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRaca
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRaca

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed

    }//GEN-LAST:event_txtTipoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        DashBoard dash = new DashBoard();
        dispose();
        dash.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        String raca, tipo, descricao, nome;

        nome = txtNome.getText();
        raca = txtRaca.getText();
        descricao = txtDescricao.getText();
        tipo = txtTipo.getSelectedItem().toString();
        
        try {
            AnimalDTO objAnimalDTO = new AnimalDTO();
            objAnimalDTO.setNome(nome);
            objAnimalDTO.setRaca(raca);
            objAnimalDTO.setDescricao(descricao);
            objAnimalDTO.setTipo(tipo);

            AnimalDAO obj = new AnimalDAO();
            obj.cadastrar(objAnimalDTO);
      
        listarUsuarios();

        } catch (Exception  e) {
            JOptionPane.showMessageDialog(null, "Um erro aconteceu revise os campos e tente novamente");
        }
    }//GEN-LAST:event_btnCadastroActionPerformed

    public static void main(String args[]) {        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadAnimais().setVisible(true);
            }
        });
    }

  private void listarUsuarios() {
        try {
        Conexaobd conn = new Conexaobd();
        AnimalDAO obj = new AnimalDAO();

        DefaultTableModel model = (DefaultTableModel) tableAnimals.getModel();

        ArrayList<AnimalDTO> lista = obj.listarAnimais(conn.conebd());
        List<String[]> sqlTable = new ArrayList<String[]>();

        for (int num = 0; num < lista.size(); num++) {
            model.addRow(new Object[]{
            lista.get(num).getNome(),
            lista.get(num).getRaca(),
            lista.get(num).getTipo(),
            lista.get(num).getDescricao()
            });
        }
        
        tableAnimals.setGridColor(Color.decode("#8D6747"));
        tableAnimals.getTableHeader().setBackground(Color.decode("#8D6747"));
        tableAnimals.getTableHeader().setForeground(Color.white);
        tableAnimals.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 18));
        
        JList list = new JList(sqlTable.toArray());
        list.setCellRenderer(new ListCellRenderer() {
 
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                 String[] val = (String[]) value;
                 return new JLabel(val[0]);   
             }
       
        });
        
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel listar os Animais "+ erro);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel logo1;
    private javax.swing.JLabel logo2;
    private javax.swing.JPanel side_pane1;
    private javax.swing.JTable tableAnimals;
    private javax.swing.JScrollPane tablePane;
    private java.awt.TextArea txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRaca;
    private javax.swing.JComboBox<String> txtTipo;
    // End of variables declaration//GEN-END:variables
}
