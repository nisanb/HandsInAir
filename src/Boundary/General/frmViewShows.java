/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boundary.General;

import Boundary.Main.iWindow;
import Boundary.Customer.frmTicketPurchase;
import Controller.General.ViewShowController;
import Controller.Main.iMuzaMusic;
import Entity.Artist;
import Entity.Customer;
import Entity.Person;
import Entity.Show;
import java.awt.Color;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import static javax.swing.BorderFactory.createEmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author nisan
 */
public class frmViewShows extends javax.swing.JInternalFrame {
    Person loggedIn = iMuzaMusic.getLoggedUser();
    Show showChosed = null;
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
        Controller.General.ViewShowController.fillShowTable(jTable1, lblErr);
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                public void valueChanged(ListSelectionEvent event) {
                    // do some actions here, for example
                    // print first column value from selected row
                    try{
                        if(showChosed!=null && showChosed.equals((Show)jTable1.getValueAt(jTable1.getSelectedRow(), 1)))
                            return;
                        showChosed = (Show) jTable1.getValueAt(jTable1.getSelectedRow(), 1);
                        iMuzaMusic.log("Refreshing show info ("+showChosed.getpID()+")");
                        refreshShow();
                        iWindow.update();
                    }
                    catch(Exception e){
                        
                    }
                }
            });
    }

    public void refreshShow(){
        if(showChosed==null){
            pnlShowDetails.setVisible(false);
            return;
        }
        iMuzaMusic.log("Starting to refresh show details..");
        pnlShowDetails.setVisible(true);
        lblShowTitle.setText("Displaying Details for Show #"+showChosed.getpID());
        lblArtist.setText(showChosed.getiMainArtist());
        lblAddress.setText(showChosed.getiLocation()+" ("+showChosed.getiLocationAddress()+")");
        lblCurrentPrice.setText("$"+showChosed.getpTicketPrice().toString());
        lblMinAge.setText(showChosed.getpMinAge()+"+");
        lblTickets.setText(showChosed.getNumPurchased()+"/"+showChosed.getMaxCapacity());
        lblPrice.setText("$"+showChosed.getpTicketPrice());
        lblWormup.setText(ViewShowController.fillSubArtistsTable(showChosed.getpID()));
        if(iMuzaMusic.getLoggedUser() instanceof Customer)
            addTickets.setVisible(true);
        
        if(lblWormup.getText().length()==0)
            lblWormup.setText("None.");
        pnlShowDetails.setVisible(false);
        pnlShowDetails.repaint();
        pnlShowDetails.setVisible(true);
        
            
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
        lblUpcoming = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblErr = new javax.swing.JLabel();
        pnlShowDetails = new javax.swing.JPanel();
        lblWormup = new javax.swing.JLabel();
        lblArtist = new javax.swing.JLabel();
        lblShowTitle = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblTickets = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblCurrentPrice = new javax.swing.JLabel();
        lblMinAge = new javax.swing.JLabel();
        addTickets = new javax.swing.JLabel();
        gmaps = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblSuccess = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        lblGreeting.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGreeting.setForeground(new java.awt.Color(255, 255, 255));
        lblGreeting.setText("Greeting");
        getContentPane().add(lblGreeting);
        lblGreeting.setBounds(10, 20, 200, 14);

        lblUpcoming.setForeground(new java.awt.Color(255, 255, 255));
        lblUpcoming.setText("Below are the 10 upcoming shows planned for ");
        getContentPane().add(lblUpcoming);
        lblUpcoming.setBounds(10, 40, 540, 14);

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
        jScrollPane1.setBounds(10, 190, 790, 160);
        jScrollPane1.getViewport().setBackground(new java.awt.Color(0,0,0,0));
        jScrollPane1.setBorder(createEmptyBorder());

        lblErr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblErr.setVisible(false);
        lblErr.setForeground(new java.awt.Color(255, 255, 255));
        lblErr.setText("We are sorry, there are no shows to dispaly.");
        getContentPane().add(lblErr);
        lblErr.setBounds(10, 150, 520, 30);

        pnlShowDetails.setOpaque(false);
        pnlShowDetails.setLayout(null);
        pnlShowDetails.setVisible(false);

        lblWormup.setForeground(new java.awt.Color(255, 255, 255));
        lblWormup.setText("List");
        pnlShowDetails.add(lblWormup);
        lblWormup.setBounds(110, 150, 340, 14);

        lblArtist.setForeground(new java.awt.Color(255, 255, 255));
        lblArtist.setText("Address:");
        pnlShowDetails.add(lblArtist);
        lblArtist.setBounds(110, 50, 270, 14);

        lblShowTitle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblShowTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblShowTitle.setText("Viewing show det");
        pnlShowDetails.add(lblShowTitle);
        lblShowTitle.setBounds(190, 10, 390, 14);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Artist:");
        pnlShowDetails.add(jLabel5);
        jLabel5.setBounds(10, 50, 80, 14);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tickets Sold:");
        pnlShowDetails.add(jLabel7);
        jLabel7.setBounds(10, 70, 90, 14);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Show Price:");
        pnlShowDetails.add(jLabel8);
        jLabel8.setBounds(10, 90, 90, 14);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("VIP Price:");
        pnlShowDetails.add(jLabel9);
        jLabel9.setBounds(10, 110, 90, 14);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address:");
        pnlShowDetails.add(jLabel4);
        jLabel4.setBounds(10, 30, 80, 14);

        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("Address:");
        pnlShowDetails.add(lblAddress);
        lblAddress.setBounds(110, 30, 260, 14);

        lblTickets.setForeground(new java.awt.Color(255, 255, 255));
        lblTickets.setText("Address:");
        pnlShowDetails.add(lblTickets);
        lblTickets.setBounds(110, 70, 290, 14);

        lblPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblPrice.setText("Address:");
        pnlShowDetails.add(lblPrice);
        lblPrice.setBounds(110, 90, 300, 14);

        lblCurrentPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblCurrentPrice.setText("Address:");
        pnlShowDetails.add(lblCurrentPrice);
        lblCurrentPrice.setBounds(110, 110, 290, 14);

        lblMinAge.setForeground(new java.awt.Color(255, 255, 255));
        lblMinAge.setText("Address:");
        pnlShowDetails.add(lblMinAge);
        lblMinAge.setBounds(110, 130, 300, 14);

        addTickets.setForeground(new java.awt.Color(51, 51, 255));
        addTickets.setVisible(false);
        addTickets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boundary/Images/ticketadd.png"))); // NOI18N
        addTickets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addTicketsMouseClicked(evt);
            }
        });
        pnlShowDetails.add(addTickets);
        addTickets.setBounds(490, 110, 80, 60);

        gmaps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boundary/Images/mapsIcon.png"))); // NOI18N
        gmaps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gmapsMouseClicked(evt);
            }
        });
        pnlShowDetails.add(gmaps);
        gmaps.setBounds(490, 30, 100, 60);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Minimum Age:");
        pnlShowDetails.add(jLabel3);
        jLabel3.setBounds(10, 130, 80, 14);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Wormup Artists:");
        pnlShowDetails.add(jLabel6);
        jLabel6.setBounds(10, 150, 140, 14);

        getContentPane().add(pnlShowDetails);
        pnlShowDetails.setBounds(10, 360, 790, 220);

        lblSuccess.setVisible(false);
        lblSuccess.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSuccess.setForeground(new java.awt.Color(51, 255, 51));
        lblSuccess.setText("jLabel2");
        getContentPane().add(lblSuccess);
        lblSuccess.setBounds(10, 100, 810, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gmapsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gmapsMouseClicked
        // TODO add your handling code here:
        iMuzaMusic.OpenURI(showChosed.getLocGoogleMap());
    }//GEN-LAST:event_gmapsMouseClicked

    private void addTicketsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTicketsMouseClicked
        // TODO add your handling code here:
        frmTicketPurchase frm = new frmTicketPurchase(this, showChosed);
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
    }//GEN-LAST:event_addTicketsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addTickets;
    private javax.swing.JLabel gmaps;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblArtist;
    private javax.swing.JLabel lblCurrentPrice;
    private javax.swing.JLabel lblErr;
    private javax.swing.JLabel lblGreeting;
    private javax.swing.JLabel lblMinAge;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblShowTitle;
    public javax.swing.JLabel lblSuccess;
    private javax.swing.JLabel lblTickets;
    private javax.swing.JLabel lblUpcoming;
    private javax.swing.JLabel lblWormup;
    private javax.swing.JPanel pnlShowDetails;
    // End of variables declaration//GEN-END:variables
}
