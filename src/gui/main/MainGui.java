/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.main;

import ex2design.iMuzaMusic;
import java.sql.SQLException;
import ex2design.utilities.EAuth;
import gui.internal.frmCreateShow;
import gui.internal.frmManageArtists;
import gui.internal.frmViewReport;
import gui.internal.frmWatchArtists;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Administrator
 */
public class MainGui extends javax.swing.JFrame {

    /**
     * Creates new form MainGui
     */
    public MainGui() {
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
        pnlAgent = new javax.swing.JPanel();
        btnManageArtists = new javax.swing.JLabel();
        btnAddShow = new javax.swing.JLabel();
        btnTesting = new javax.swing.JLabel();
        pnlRep = new javax.swing.JPanel();
        btnViewReport = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        pnlAgent.setOpaque(false);

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

        btnTesting.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnTesting.setForeground(new java.awt.Color(255, 255, 255));
        btnTesting.setText("Testing button");
        btnTesting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTestingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlAgentLayout = new javax.swing.GroupLayout(pnlAgent);
        pnlAgent.setLayout(pnlAgentLayout);
        pnlAgentLayout.setHorizontalGroup(
            pnlAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageArtists, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddShow, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlAgentLayout.setVerticalGroup(
            pnlAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgentLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnManageArtists, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddShow, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        getContentPane().add(pnlAgent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        pnlRep.setOpaque(false);

        btnViewReport.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnViewReport.setForeground(new java.awt.Color(255, 255, 255));
        btnViewReport.setText("View Reports");
        btnViewReport.setToolTipText("");
        btnViewReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewReportMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlRepLayout = new javax.swing.GroupLayout(pnlRep);
        pnlRep.setLayout(pnlRepLayout);
        pnlRepLayout.setHorizontalGroup(
            pnlRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRepLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnViewReport, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlRepLayout.setVerticalGroup(
            pnlRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRepLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnViewReport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(342, Short.MAX_VALUE))
        );

        getContentPane().add(pnlRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/muzagui.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
        iMuzaMusic.setLoggedUser(null);
        setVisible(false);
        iWindow.getPanel().setVisible(false);
        iWindow.getCurrentWindow().setVisible(false);
        LoginGui tmp = new LoginGui();
        tmp.setVisible(true);
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        // TODO add your handling code here:
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

    private void btnTestingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTestingMouseClicked
        frmWatchArtists add = new frmWatchArtists();
        iWindow.openWin(add);
    }//GEN-LAST:event_btnTestingMouseClicked

    private void btnViewReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewReportMouseClicked
        // TODO add your handling code here:
       frmViewReport add = new frmViewReport();
       iWindow.openWin(add);
    }//GEN-LAST:event_btnViewReportMouseClicked

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
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGui().setVisible(true);
            }
        });
    }

    public void refreshVars() {
        lblTitle.setText("Homepage");
        lblUserType.setText("" + iMuzaMusic.getLoggedUser().getUserAuth());
        lblUsernames.setText(iMuzaMusic.getLoggedUser().getFirstName() + " " + iMuzaMusic.getLoggedUser().getLastName());
        pnlAgent.setVisible(false);

        switch (iMuzaMusic.getLoggedUser().getUserAuth()) {
            case Agent:
                pnlAgent.setVisible(true);
                break;
                
            case Representative:
                
                pnlRep.setVisible(true);
                break;
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentFrame;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btnAddShow;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel btnManageArtists;
    private javax.swing.JLabel btnTesting;
    private javax.swing.JLabel btnViewReport;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserType;
    private javax.swing.JLabel lblUsernames;
    private javax.swing.JPanel pnlAgent;
    private javax.swing.JPanel pnlRep;
    // End of variables declaration//GEN-END:variables

}
