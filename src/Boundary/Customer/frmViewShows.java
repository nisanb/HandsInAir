/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boundary.Customer;

import Controller.General.iMuzaMusic;
import Entity.Person;
import java.awt.Color;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import static javax.swing.BorderFactory.createEmptyBorder;

/**
 *
 * @author nisan
 */
public class frmViewShows extends javax.swing.JInternalFrame {
    Person loggedIn = iMuzaMusic.getLoggedUser();
    /**
     * Creates new form frmViewShows
     */
    public frmViewShows() {
        setTitle("View Shows");
        initComponents();
        lblGreeting.setText("Welcome "+loggedIn.getFirstName()+",");
        SimpleDateFormat df = new SimpleDateFormat("MMMMMMMMMMM");
        
        String months = df.format(new Date());
        Date month2 = new Date();
        month2.setMonth(month2.getMonth()+1);
        months = months + " - " + df.format(month2);
        
        lblUpcoming.setText("Below are the 10 upcoming shows planned for "+months+".");
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
        lblGreeting = new javax.swing.JLabel();
        lblUpcoming = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View Shows");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 11, 195, 26);

        lblGreeting.setForeground(new java.awt.Color(255, 255, 255));
        lblGreeting.setText("Greeting");
        getContentPane().add(lblGreeting);
        lblGreeting.setBounds(10, 43, 200, 14);

        lblUpcoming.setForeground(new java.awt.Color(255, 255, 255));
        lblUpcoming.setText("Below are the 10 upcoming shows planned for ");
        getContentPane().add(lblUpcoming);
        lblUpcoming.setBounds(10, 63, 362, 14);

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        jScrollPane1.setBackground(new java.awt.Color(0,0,0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"asd", "dsa", "asd", null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);
        jScrollPane1.getViewport().setBorder(null);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 190, 790, 250);
        jScrollPane1.getViewport().setBackground(new java.awt.Color(0,0,0,0));
        jScrollPane1.setBorder(createEmptyBorder());

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblGreeting;
    private javax.swing.JLabel lblUpcoming;
    // End of variables declaration//GEN-END:variables
}
