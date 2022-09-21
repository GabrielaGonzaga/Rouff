/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author gaago
 */
public class NewJFrame1 extends javax.swing.JFrame {

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1262, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    static NewJFrame1 myFrame;
    static int countMe = 0;
    JPanel mainPanel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        myFrame = new NewJFrame1();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.prepareUI();
        myFrame.pack();
        myFrame.setVisible(true);
    }

    private void prepareUI() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JButton buttonAdd = new JButton("Add subPanel");
        buttonAdd.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.add(new subPanel());
                myFrame.pack();
            }
        });
        
        JButton buttonRemoveAll = new JButton("Remove All");
        buttonRemoveAll.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.removeAll();
                myFrame.pack();
            }
        });

        getContentPane().add(mainPanel, BorderLayout.CENTER);
        getContentPane().add(buttonAdd, BorderLayout.PAGE_START);
        getContentPane().add(buttonRemoveAll, BorderLayout.PAGE_END);
    }

    private class subPanel extends JPanel {
        
        subPanel me;

        public subPanel() {
            super();
            me = this;
            JLabel myLabel = new JLabel("Hello subPanel(): " + countMe++);
            add(myLabel);
            JButton myButtonRemoveMe = new JButton("remove me");
            myButtonRemoveMe.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent e) {
                    me.getParent().remove(me);
                    myFrame.pack();
                }
            });
            add(myButtonRemoveMe);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}