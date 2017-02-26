/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boundary.Rep;

import Boundary.Main.iWindow;
import Boundary.Rep.Create.createRep;
import Controller.Main.iMuzaMusic;

/**
 *
 * @author Administrator
 */
public class frmManageUsers extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmManageUsers
     */
    public frmManageUsers() {
        initComponents();
        setTitle("User Management Area");
        lblGreeting.setText("Dear "+iMuzaMusic.getLoggedUser().getFirstName()+", Welcome to User Management Area.");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGreeting = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAgent = new javax.swing.JButton();
        btnRep = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        btnLRep = new javax.swing.JButton();

        getContentPane().setLayout(null);

        lblGreeting.setForeground(new java.awt.Color(255, 255, 255));
        lblGreeting.setText("jLabel1");
        getContentPane().add(lblGreeting);
        lblGreeting.setBounds(20, 20, 570, 14);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Please note that at this version you may only create new users.");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 40, 580, 14);

        btnAgent.setText("Create Agent");
        getContentPane().add(btnAgent);
        btnAgent.setBounds(620, 150, 160, 40);

        btnRep.setText("Create Rep");
        btnRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepActionPerformed(evt);
            }
        });
        getContentPane().add(btnRep);
        btnRep.setBounds(50, 150, 160, 40);

        btnCustomer.setText("Create Customer");
        getContentPane().add(btnCustomer);
        btnCustomer.setBounds(240, 150, 160, 40);

        btnLRep.setText("Create Location Rep");
        getContentPane().add(btnLRep);
        btnLRep.setBounds(430, 150, 160, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepActionPerformed
        // TODO add your handling code here:
        iWindow.openWin(new createRep());
    }//GEN-LAST:event_btnRepActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgent;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnLRep;
    private javax.swing.JButton btnRep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblGreeting;
    // End of variables declaration//GEN-END:variables
}
