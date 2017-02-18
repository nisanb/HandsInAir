/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boundary.Internal.Agent;

import Controller.General.iMuzaMusic;
import Entity.Artist;
import Entity.Person;
import Entity.ShowsToArtists;
import Entity.EArtistStatus;
import Entity.EAuth;
import Boundary.Main.iWindow;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableColumn;

/**
 *
 * @author nisan
 */
public class frmManageArtists extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmTemplate
     */
    private static Artist art = null;

    public frmManageArtists() {

        initComponents();
        setTitle("Manage Artists");
        pnlArtist.setVisible(false);
        slctArtist.setBackground(Color.black);
        slctArtist.setForeground(Color.white);
        slctArtist.removeAllItems();
        slctArtist.addItem("Select an artist");
        slctArtist.setSelectedIndex(0);
        ResultSet r = iMuzaMusic.getDB().query("select * from Artists where AgentID='" + iMuzaMusic.getLoggedUser().getID() + "'");
        try {
            while (r.next()) {
                String ArtistID = r.getString("ArtistID");
                String strStageName = r.getString("strStageName");
                slctArtist.addItem(strStageName + " (" + ArtistID + ")");
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmManageArtists.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                public void valueChanged(ListSelectionEvent event) {
                    // do some actions here, for example
                    // print first column value from selected row
                    try{
                        System.out.println(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                    }
                    catch(Exception e){
                        
                    }
                }
            });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        lblAddArtist = new javax.swing.JLabel();
        slctArtist = new javax.swing.JComboBox<>();
        pnlArtist = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        lblArtistID = new javax.swing.JLabel();
        txtID = new javax.swing.JLabel();
        lblEmailAddress = new javax.swing.JLabel();
        txtStageName = new javax.swing.JLabel();
        lblStageName = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        lblFreeze = new javax.swing.JLabel();
        lblFacebook = new javax.swing.JLabel();
        txtStatus = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblPhoneNum = new javax.swing.JLabel();
        txtEmail1 = new javax.swing.JLabel();
        txtEmail2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(){
            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                    return String.class;
                    case 1:
                    return String.class;
                    case 2:
                    return String.class;
                    case 3:
                    return String.class;
                    default:
                    return Boolean.class;
                }
            }
        };
        lblFreeze1 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jLabel16.setBackground(new Color(0,0,0,0));
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("You may choose an artist by using the selector.");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(60, 30, 228, 14);

        lblSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/search.png"))); // NOI18N
        getContentPane().add(lblSearch);
        lblSearch.setBounds(20, 50, 30, 30);

        lblAddArtist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/add.png"))); // NOI18N
        lblAddArtist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddArtistMouseClicked(evt);
            }
        });
        getContentPane().add(lblAddArtist);
        lblAddArtist.setBounds(310, 40, 40, 50);

        slctArtist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        slctArtist.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                slctArtistItemStateChanged(evt);
            }
        });
        slctArtist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slctArtistActionPerformed(evt);
            }
        });
        getContentPane().add(slctArtist);
        slctArtist.setBounds(60, 50, 240, 30);

        pnlArtist.setBackground(new Color(0,0,0,0));
        pnlArtist.setLayout(null);
        pnlArtist.add(jSeparator2);
        jSeparator2.setBounds(30, 50, 210, 0);

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setEnabled(false);
        pnlArtist.add(jSeparator4);
        jSeparator4.setBounds(10, 40, 30, 10);

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlArtist.add(jSeparator5);
        jSeparator5.setBounds(10, 40, 10, 410);

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        pnlArtist.add(jSeparator6);
        jSeparator6.setBounds(10, 450, 570, 10);

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        pnlArtist.add(jSeparator7);
        jSeparator7.setBounds(130, 40, 450, 10);

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlArtist.add(jSeparator8);
        jSeparator8.setBounds(580, 40, 10, 420);

        lblArtistID.setForeground(new java.awt.Color(255, 255, 255));
        lblArtistID.setText("id");
        pnlArtist.add(lblArtistID);
        lblArtistID.setBounds(210, 60, 70, 14);

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtID.setForeground(new java.awt.Color(255, 255, 255));
        txtID.setText("Artist ID");
        pnlArtist.add(txtID);
        txtID.setBounds(20, 60, 70, 16);

        lblEmailAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblEmailAddress.setText("address");
        pnlArtist.add(lblEmailAddress);
        lblEmailAddress.setBounds(210, 120, 200, 14);

        txtStageName.setBackground(new java.awt.Color(255, 255, 255));
        txtStageName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtStageName.setForeground(new java.awt.Color(255, 255, 255));
        txtStageName.setText("Stage Name");
        pnlArtist.add(txtStageName);
        txtStageName.setBounds(20, 80, 90, 16);

        lblStageName.setForeground(new java.awt.Color(255, 255, 255));
        lblStageName.setText("name");
        pnlArtist.add(lblStageName);
        lblStageName.setBounds(210, 80, 210, 20);

        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Artist Details");
        pnlArtist.add(lblTitle);
        lblTitle.setBounds(50, 20, 100, 40);

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setText("Biography");
        pnlArtist.add(txtEmail);
        txtEmail.setBounds(20, 140, 110, 16);

        lblFreeze.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblFreeze.setForeground(new java.awt.Color(255, 0, 0));
        lblFreeze.setText("[Deactivate Artist]");
        lblFreeze.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFreezeMouseClicked(evt);
            }
        });
        pnlArtist.add(lblFreeze);
        lblFreeze.setBounds(470, 90, 110, 20);

        lblFacebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/Facebook-Download-PNG.png"))); // NOI18N
        pnlArtist.add(lblFacebook);
        lblFacebook.setBounds(510, 50, 50, 40);

        txtStatus.setBackground(new java.awt.Color(255, 255, 255));
        txtStatus.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtStatus.setForeground(new java.awt.Color(255, 255, 255));
        txtStatus.setText("Status");
        pnlArtist.add(txtStatus);
        txtStatus.setBounds(20, 100, 110, 16);

        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setText("status");
        pnlArtist.add(lblStatus);
        lblStatus.setBounds(210, 100, 200, 14);

        lblPhoneNum.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNum.setText("jLabel1");
        lblPhoneNum.setToolTipText("");
        pnlArtist.add(lblPhoneNum);
        lblPhoneNum.setBounds(20, 160, 420, 20);

        txtEmail1.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtEmail1.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail1.setText("Email Address");
        pnlArtist.add(txtEmail1);
        txtEmail1.setBounds(20, 120, 110, 16);

        txtEmail2.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtEmail2.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail2.setText("Approve Shows Invitations");
        pnlArtist.add(txtEmail2);
        txtEmail2.setBounds(20, 260, 210, 16);

        jTable1.setBackground(new Color(0,0,0,0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setOpaque(false);
        jScrollPane1.setViewportView(jTable1);

        pnlArtist.add(jScrollPane1);
        jScrollPane1.setBounds(20, 280, 540, 160);

        lblFreeze1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblFreeze1.setForeground(new java.awt.Color(255, 255, 255));
        lblFreeze1.setText("[Artist Evaluations]");
        lblFreeze1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFreeze1MouseClicked(evt);
            }
        });
        pnlArtist.add(lblFreeze1);
        lblFreeze1.setBounds(470, 110, 110, 20);

        getContentPane().add(pnlArtist);
        pnlArtist.setBounds(10, 80, 600, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void slctArtistItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_slctArtistItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Object item = evt.getItem();
            if (item.equals("Select an artist")) {
                pnlArtist.setVisible(false);
                return;
            }
            // do something with object
            String agID = iMuzaMusic.getID(slctArtist.getSelectedItem().toString());

            this.art = iMuzaMusic.getAgentEntity(agID);
            List<ShowsToArtists> AL = new ArrayList<ShowsToArtists>();
            String ShowID, ArtistID, showDate, showLocation;
            ResultSet shows = iMuzaMusic.getDB().query("SELECT Shows.*, Locations.strName\n"
                    + "FROM Locations INNER JOIN (Shows INNER JOIN ShowsToArtists ON Shows.pID = ShowsToArtists.ShowID) ON Locations.LocationID = Shows.iLocation\n"
                    + "WHERE (((Shows.pID)=[ShowsToArtists].[ShowID]) AND ((ShowsToArtists.Status)=\"Pending Approval\") AND ((ShowsToArtists.ArtistID)=\"" + art.getID() + "\") AND ((Locations.LocationID)=[Shows].[iLocation]));");
            try {
                while (shows.next()) {
                    ShowID = shows.getString("pID");
                    ArtistID = shows.getString("iMainArtist");
                    ResultSet getArtistName = iMuzaMusic.getDB().query("select strStageName from Artists where ArtistiD=\"" + ArtistID + "\"");
                    while (getArtistName.next()) {
                        ArtistID = getArtistName.getString("strStageName");
                    }
                    showLocation = shows.getString("strName");
                    showDate = shows.getString("pStartDate").substring(0, 10);
                    iMuzaMusic.log(ShowID + " " + ArtistID + " " + showLocation + " " + showDate);
                    AL.add(new ShowsToArtists(ShowID, ArtistID, "Pending Approval", showDate, showLocation));

                }
            } catch (SQLException ex) {
                Logger.getLogger(frmManageArtists.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Object[][] objs = new Object[AL.size()][5];
            int i = 0;
            for (ShowsToArtists sta : AL) {
                objs[i][0] = sta.getShowID();
                objs[i][1] = sta.getShowDate();
                objs[i][2] = sta.getArtistID();
                objs[i][3] = sta.getLocation();
                objs[i][4] = false;

                i++;
            }
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    objs,
                    new String[]{
                        "#", "Date", "Main Artist", "Location", "Approve Show"
                    }
            ));
TableColumn tc = jTable1.getColumnModel().getColumn(4);
            tc.setCellEditor(jTable1.getDefaultEditor(Boolean.class));
            tc.setCellRenderer(jTable1.getDefaultRenderer(Boolean.class));
            
            updateData();

        }
        
    }//GEN-LAST:event_slctArtistItemStateChanged

    private void slctArtistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slctArtistActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_slctArtistActionPerformed

    private void lblAddArtistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddArtistMouseClicked

        //Create new Branch
        hide();
        // AddBranchForm frm = new AddBranchForm();
        // iWindow.openWin(frm);
    }//GEN-LAST:event_lblAddArtistMouseClicked

    private void lblFreezeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFreezeMouseClicked

        //Freeze Agent
        if (art.getArStatus().equals(EArtistStatus.Active)) {
            iMuzaMusic.getDB().updateReturnID("update Artists set iStatus=2 where ArtistID=\"" + art.getID() + "\"");
            art.setArStatus(EArtistStatus.Inactive);
            lblFreeze.setText("[Activate Artist]");
            lblFreeze.setForeground(Color.green);
        } else {
            iMuzaMusic.getDB().updateReturnID("update Artists set iStatus=1 where ArtistID=\"" + art.getID() + "\"");
            art.setArStatus(EArtistStatus.Active);
            lblFreeze.setText("[Deactivate Artist]");
            lblFreeze.setForeground(Color.red);
        }

        updateData();
    }//GEN-LAST:event_lblFreezeMouseClicked

    private void lblFreeze1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFreeze1MouseClicked
        // TODO add your handling code here:
        List<Artist> unEvaluated = new ArrayList<Artist>();
        List<Artist> evaluated = new ArrayList<Artist>();
        Controller.Artist.EvaluationsController.getEvaluatedArtist(art, unEvaluated, evaluated);
        
        JFrame frmEvaluation = new frmEvaluateArtist(art, unEvaluated, evaluated);
        frmEvaluation.setLocationRelativeTo(null);
        frmEvaluation.setVisible(true);
    }//GEN-LAST:event_lblFreeze1MouseClicked

    public void updateData() {

        if (art != null) {
            //Artist chosen
            lblArtistID.setText(art.getID());
            lblPhoneNum.setText(art.getBiography());

            lblStageName.setText(art.getStageName());
            lblStatus.setText(art.getArStatus().toString());
            lblEmailAddress.setText(art.getEmailAddr());
            //treat fb
            //end fb
            pnlArtist.setVisible(true);

        }

        iWindow.update();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel16;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAddArtist;
    private javax.swing.JLabel lblArtistID;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblFacebook;
    private javax.swing.JLabel lblFreeze;
    private javax.swing.JLabel lblFreeze1;
    private javax.swing.JLabel lblPhoneNum;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblStageName;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlArtist;
    private javax.swing.JComboBox<String> slctArtist;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtEmail1;
    private javax.swing.JLabel txtEmail2;
    private javax.swing.JLabel txtID;
    private javax.swing.JLabel txtStageName;
    private javax.swing.JLabel txtStatus;
    // End of variables declaration//GEN-END:variables
}
