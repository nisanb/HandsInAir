/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boundary.Main;

import Boundary.General.frmViewShows;
import Entity.Artist;
import Controller.Main.XMLManager;
import Controller.Main.iMuzaMusic;
import java.sql.SQLException;
import Entity.EAuth;
import Boundary.Agent.frmCreateShow;
import Boundary.Agent.frmLocationManager;
import Boundary.Agent.frmManageArtists;
import Boundary.Reports.frmViewReport;
import Boundary.Customer.frmFanArtist;
import Boundary.LRep.frmEditLocation;
import java.awt.Color;
import java.awt.Graphics;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class MainGui extends javax.swing.JFrame {

    /**
     * Creates new form MainGui
     */
    public MainGui() throws SQLException {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        refreshVars();
        iWindow.setPanel(ContentFrame);
        iWindow.setLblTitle(lblTitle);

    
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblUsernames = new javax.swing.JLabel();
        lblUserType = new javax.swing.JLabel();
        ContentFrame = new javax.swing.JPanel();
        pnlRep = new javax.swing.JPanel();
        btnManageArtists3 = new javax.swing.JLabel();
        btnAddShow5 = new javax.swing.JLabel();
        pnlLRep = new javax.swing.JPanel();
        btnManageArtists2 = new javax.swing.JLabel();
        btnAddShow4 = new javax.swing.JLabel();
        pnlCustomer = new javax.swing.JPanel();
        btnManageArtists1 = new javax.swing.JLabel();
        btnAddShow3 = new javax.swing.JLabel();
        pnlAgent = new javax.swing.JPanel();
        btnManageArtists = new javax.swing.JLabel();
        btnAddShow = new javax.swing.JLabel();
        btnAddShow1 = new javax.swing.JLabel();
        btnAddShow2 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1020, 766));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(204, 204, 204));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitle.setText("Page Title");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 240, 20));

        lblUsernames.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUsernames.setForeground(new java.awt.Color(255, 255, 255));
        lblUsernames.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsernames.setText("First Name");
        getContentPane().add(lblUsernames, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 200, 30));

        lblUserType.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUserType.setForeground(new java.awt.Color(255, 255, 255));
        lblUserType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserType.setText("User Type");
        getContentPane().add(lblUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, 30));

        ContentFrame.setBackground(new Color(0,0,0,0));
        ContentFrame.setForeground(new java.awt.Color(255, 51, 102));
        ContentFrame.setAutoscrolls(true);
        ContentFrame.setOpaque(false);
        ContentFrame.setVisible(false);

        javax.swing.GroupLayout ContentFrameLayout = new javax.swing.GroupLayout(ContentFrame);
        ContentFrame.setLayout(ContentFrameLayout);
        ContentFrameLayout.setHorizontalGroup(
            ContentFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        ContentFrameLayout.setVerticalGroup(
            ContentFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        getContentPane().add(ContentFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 830, 690));

        pnlRep.setOpaque(false);
        pnlRep.setVisible(false);

        btnManageArtists3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnManageArtists3.setForeground(new java.awt.Color(255, 255, 255));
        btnManageArtists3.setText("Edit Global Settings");
        btnManageArtists3.setToolTipText("");
        btnManageArtists3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManageArtists3MouseClicked(evt);
            }
        });

        btnAddShow5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAddShow5.setForeground(new java.awt.Color(255, 255, 255));
        btnAddShow5.setText("Generate Report");
        btnAddShow5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddShow5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlRepLayout = new javax.swing.GroupLayout(pnlRep);
        pnlRep.setLayout(pnlRepLayout);
        pnlRepLayout.setHorizontalGroup(
            pnlRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRepLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddShow5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageArtists3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlRepLayout.setVerticalGroup(
            pnlRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRepLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnManageArtists3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddShow5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
        );

        getContentPane().add(pnlRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        pnlLRep.setOpaque(false);
        pnlLRep.setVisible(false);

        btnManageArtists2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnManageArtists2.setForeground(new java.awt.Color(255, 255, 255));
        btnManageArtists2.setText("View Shows");
        btnManageArtists2.setToolTipText("");
        btnManageArtists2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManageArtists2MouseClicked(evt);
            }
        });

        btnAddShow4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAddShow4.setForeground(new java.awt.Color(255, 255, 255));
        btnAddShow4.setText("Edit Location Details");
        btnAddShow4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddShow4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlLRepLayout = new javax.swing.GroupLayout(pnlLRep);
        pnlLRep.setLayout(pnlLRepLayout);
        pnlLRepLayout.setHorizontalGroup(
            pnlLRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLRepLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddShow4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageArtists2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlLRepLayout.setVerticalGroup(
            pnlLRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLRepLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnManageArtists2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddShow4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
        );

        getContentPane().add(pnlLRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        pnlCustomer.setOpaque(false);
        pnlCustomer.setVisible(false);

        btnManageArtists1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnManageArtists1.setForeground(new java.awt.Color(255, 255, 255));
        btnManageArtists1.setText("View Shows");
        btnManageArtists1.setToolTipText("");
        btnManageArtists1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManageArtists1MouseClicked(evt);
            }
        });

        btnAddShow3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAddShow3.setForeground(new java.awt.Color(255, 255, 255));
        btnAddShow3.setText("Fan Your Artists!");
        btnAddShow3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddShow3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlCustomerLayout = new javax.swing.GroupLayout(pnlCustomer);
        pnlCustomer.setLayout(pnlCustomerLayout);
        pnlCustomerLayout.setHorizontalGroup(
            pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddShow3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageArtists1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlCustomerLayout.setVerticalGroup(
            pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCustomerLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnManageArtists1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddShow3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
        );

        getContentPane().add(pnlCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        pnlAgent.setOpaque(false);
        pnlAgent.setVisible(false);

        btnManageArtists.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnManageArtists.setForeground(new java.awt.Color(255, 255, 255));
        btnManageArtists.setText("Manage Artists");
        btnManageArtists.setToolTipText("");
        btnManageArtists.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManageArtistsMouseClicked(evt);
            }
        });

        btnAddShow.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAddShow.setForeground(new java.awt.Color(255, 255, 255));
        btnAddShow.setText("Add Shows");
        btnAddShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddShowMouseClicked(evt);
            }
        });

        btnAddShow1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAddShow1.setForeground(new java.awt.Color(255, 255, 255));
        btnAddShow1.setText("View Shows");
        btnAddShow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddShow1MouseClicked(evt);
            }
        });

        btnAddShow2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAddShow2.setForeground(new java.awt.Color(255, 255, 255));
        btnAddShow2.setText("Locations Manager");
        btnAddShow2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddShow2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlAgentLayout = new javax.swing.GroupLayout(pnlAgent);
        pnlAgent.setLayout(pnlAgentLayout);
        pnlAgentLayout.setHorizontalGroup(
            pnlAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddShow, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageArtists, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddShow1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddShow2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlAgentLayout.setVerticalGroup(
            pnlAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgentLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnManageArtists, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddShow, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddShow2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddShow1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        getContentPane().add(pnlAgent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boundary/Images/muzagui.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 1020, 770));

        btnExit.setText("jButton1");
        btnExit.setEnabled(false);
        btnExit.setFocusPainted(false);
        btnExit.setFocusable(false);
        btnExit.setRequestFocusEnabled(false);
        btnExit.setRolloverEnabled(false);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, 160, 40));

        btnLogout.setText("jButton1");
        btnLogout.setEnabled(false);
        btnLogout.setFocusPainted(false);
        btnLogout.setFocusable(false);
        btnLogout.setRequestFocusEnabled(false);
        btnLogout.setRolloverEnabled(false);
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 160, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
        iMuzaMusic.log("Logging out..");
        iMuzaMusic.setLoggedUser(null);
        dispose();
        setVisible(false);
        iMuzaMusic.log("Successfully logged out");
        
        LoginGui tmp = new LoginGui();
        iMuzaMusic.log("Activating login screen");
        tmp.setVisible(true);
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        // TODO add your handling code here:
        iMuzaMusic.log("Exit command identified");
        iMuzaMusic.log("Exporting XML for iRecord");
        XMLManager.ExportXML();
        iMuzaMusic.log("Quitting MuzaMusic");
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnManageArtistsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageArtistsMouseClicked
        // TODO add your handling code here:
        frmManageArtists add = new frmManageArtists();
        iWindow.openWin(add);
    }//GEN-LAST:event_btnManageArtistsMouseClicked

    private void btnAddShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddShowMouseClicked
        // TODO add your handling code here:
        frmCreateShow add = new frmCreateShow();
        iWindow.openWin(add);
    }//GEN-LAST:event_btnAddShowMouseClicked

    private void btnAddShow1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddShow1MouseClicked
        iWindow.openWin(new frmViewShows());
        
    }//GEN-LAST:event_btnAddShow1MouseClicked

    private void btnAddShow2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddShow2MouseClicked

        iWindow.openWin(new frmLocationManager());
    }//GEN-LAST:event_btnAddShow2MouseClicked

    private void btnManageArtists1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageArtists1MouseClicked
        // TODO add your handling code here:
        iWindow.openWin(new frmViewShows());
    }//GEN-LAST:event_btnManageArtists1MouseClicked

    private void btnAddShow3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddShow3MouseClicked
        // TODO add your handling code here:
        iWindow.openWin(new frmFanArtist());
    }//GEN-LAST:event_btnAddShow3MouseClicked

    private void btnManageArtists2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageArtists2MouseClicked
        // TODO add your handling code here:
        iWindow.openWin(new frmViewShows());
    }//GEN-LAST:event_btnManageArtists2MouseClicked

    private void btnAddShow4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddShow4MouseClicked
        // TODO add your handling code here:
        //        // TODO add your handling code here:
//        ResultSet rs = iMuzaMusic.getDB().query("select count(*) from Locations where RepID in(\""+iMuzaMusic.getLoggedUser().getID()+"\")");
//        Integer num=0;
//        iMuzaMusic.log("Checking if LRep has a location set up already");
//        try {
//            if(rs.next()){
//                num = rs.getInt(1);
//                iMuzaMusic.log("Yep! has "+num+" location.");
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(MainGui.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        if(num>0) iWindow.openWin(new frmEditLocation());
        iWindow.openWin(new frmEditLocation());
        //else iWindow.openWin(new frmCreateLocation());
    }//GEN-LAST:event_btnAddShow4MouseClicked

    private void btnManageArtists3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageArtists3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageArtists3MouseClicked

    private void btnAddShow5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddShow5MouseClicked

        iWindow.openWin(new frmViewReport());
        //else iWindow.openWin(new frmCreateLocation());
    }//GEN-LAST:event_btnAddShow5MouseClicked


    public void refreshVars() {
        lblTitle.setText("Homepage");
        lblUserType.setText("" + iMuzaMusic.getLoggedUser().getUserAuth());
        lblUsernames.setText(iMuzaMusic.getLoggedUser().getFirstName() + " " + iMuzaMusic.getLoggedUser().getLastName());
      
        
        iMuzaMusic.log("Aquiring menu for "+iMuzaMusic.getLoggedUser().getID()+" Auth: "+iMuzaMusic.getLoggedUser().getUserAuth());
        switch (iMuzaMusic.getLoggedUser().getUserAuth()) {
            case Agent:
                pnlAgent.setVisible(true);
                break;
            case Representative:
                pnlRep.setVisible(true);
                break;
            case Location_Representative:
                pnlLRep.setVisible(true);
                break;
            case Customer:
                pnlCustomer.setVisible(true);
                break;
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentFrame;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btnAddShow;
    private javax.swing.JLabel btnAddShow1;
    private javax.swing.JLabel btnAddShow2;
    private javax.swing.JLabel btnAddShow3;
    private javax.swing.JLabel btnAddShow4;
    private javax.swing.JLabel btnAddShow5;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel btnManageArtists;
    private javax.swing.JLabel btnManageArtists1;
    private javax.swing.JLabel btnManageArtists2;
    private javax.swing.JLabel btnManageArtists3;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserType;
    private javax.swing.JLabel lblUsernames;
    private javax.swing.JPanel pnlAgent;
    private javax.swing.JPanel pnlCustomer;
    private javax.swing.JPanel pnlLRep;
    private javax.swing.JPanel pnlRep;
    // End of variables declaration//GEN-END:variables

}
