/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boundary.Rep;

import Controller.Rep.SettingsManager;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class frmEditSettings extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmEditSettings
     */
    public frmEditSettings() {
        initComponents();
        updateData();
    }

    
    
    public void updateData(){
        
        //Get vars
        SettingsManager.getSettings(new Date());
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
        lblUpdated = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        spnArtistCommission = new javax.swing.JSpinner();
        spnLocationCommission = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        spnMaxAddonCommission = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spnMaxAllowedShowtime = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        spnMaxPresaleTickets = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        spnMinDaysBeforePresale = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        spnPresaleDiscount = new javax.swing.JSpinner();
        spnRegularTicketsPeriod = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        spnShowAddonCommission = new javax.swing.JSpinner();
        spnShowApprovalTimeout = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtbDayCard = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(null);

        lblGreeting.setForeground(new java.awt.Color(255, 255, 255));
        lblGreeting.setText("jLabel1");
        getContentPane().add(lblGreeting);
        lblGreeting.setBounds(27, 11, 737, 14);

        lblUpdated.setForeground(new java.awt.Color(255, 255, 255));
        lblUpdated.setText("jLabel1");
        getContentPane().add(lblUpdated);
        lblUpdated.setBounds(27, 31, 540, 14);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Maximum added commission to open location");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 190, 360, 30);

        spnArtistCommission.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 5));
        getContentPane().add(spnArtistCommission);
        spnArtistCommission.setBounds(180, 80, 40, 20);

        spnLocationCommission.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 5));
        getContentPane().add(spnLocationCommission);
        spnLocationCommission.setBounds(180, 130, 40, 20);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Maximum Addon Commission");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 180, 150, 20);

        spnMaxAddonCommission.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 5));
        getContentPane().add(spnMaxAddonCommission);
        spnMaxAddonCommission.setBounds(180, 180, 40, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Location Commission");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 130, 120, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Artist Commission");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 80, 120, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Artist share commissions from performance revenue");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 90, 360, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Location Commision from show sales");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 140, 360, 30);

        spnMaxAllowedShowtime.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        getContentPane().add(spnMaxAllowedShowtime);
        spnMaxAllowedShowtime.setBounds(540, 80, 40, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Max Allowed Showtime");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(390, 80, 150, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Maximum allowed show time (hours)");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(390, 90, 360, 30);

        spnMaxPresaleTickets.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        getContentPane().add(spnMaxPresaleTickets);
        spnMaxPresaleTickets.setBounds(540, 130, 40, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Max Presale Tickets");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(390, 130, 150, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Maximum Tickets per client purchase on presale");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(390, 140, 360, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Max Presale Tickets");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(390, 130, 150, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Maximum Tickets per client purchase on presale");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(390, 140, 360, 30);

        spnMinDaysBeforePresale.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        getContentPane().add(spnMinDaysBeforePresale);
        spnMinDaysBeforePresale.setBounds(540, 180, 40, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Min Days Before Presale");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(390, 180, 150, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Minimum allowed days for pre sale period");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(390, 190, 360, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Define presale discount (% Percent)");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(30, 230, 360, 30);

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Presale Discount");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(30, 220, 150, 20);

        spnPresaleDiscount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 5));
        getContentPane().add(spnPresaleDiscount);
        spnPresaleDiscount.setBounds(180, 220, 40, 20);

        spnRegularTicketsPeriod.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        getContentPane().add(spnRegularTicketsPeriod);
        spnRegularTicketsPeriod.setBounds(540, 220, 40, 20);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Regular Tickets Sale");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(390, 220, 150, 20);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Days period for regular tickets sale");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(390, 230, 360, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Commission prefix per addon");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(30, 270, 360, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Birthday Greeting Card");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(310, 320, 150, 20);

        spnShowAddonCommission.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 5));
        getContentPane().add(spnShowAddonCommission);
        spnShowAddonCommission.setBounds(180, 260, 40, 20);

        spnShowApprovalTimeout.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        getContentPane().add(spnShowApprovalTimeout);
        spnShowApprovalTimeout.setBounds(540, 260, 40, 20);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Show Approval Timeout");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(390, 260, 150, 20);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Days until a show is automatically cancelled if not all artists approved attendance");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(390, 270, 390, 30);

        jButton1.setText("Update Changes");
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 460, 710, 23);

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Show Addon Commission");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(30, 260, 150, 20);

        txtbDayCard.setColumns(20);
        txtbDayCard.setRows(5);
        jScrollPane1.setViewportView(txtbDayCard);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 360, 710, 80);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("You may use {name}, {age} and {date} in your text");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(260, 340, 680, 13);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGreeting;
    private javax.swing.JLabel lblUpdated;
    private javax.swing.JSpinner spnArtistCommission;
    private javax.swing.JSpinner spnLocationCommission;
    private javax.swing.JSpinner spnMaxAddonCommission;
    private javax.swing.JSpinner spnMaxAllowedShowtime;
    private javax.swing.JSpinner spnMaxPresaleTickets;
    private javax.swing.JSpinner spnMinDaysBeforePresale;
    private javax.swing.JSpinner spnPresaleDiscount;
    private javax.swing.JSpinner spnRegularTicketsPeriod;
    private javax.swing.JSpinner spnShowAddonCommission;
    private javax.swing.JSpinner spnShowApprovalTimeout;
    private javax.swing.JTextArea txtbDayCard;
    // End of variables declaration//GEN-END:variables
}
