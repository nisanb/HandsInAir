/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boundary.Rep.Create;

import Boundary.Main.iWindow;
import Controller.Main.iMuzaMusic;
import Entity.Agent;
import Entity.Customer;
import Entity.EAuth;
import Entity.Rep;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Base64;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import Controller.Main.FileManager;

/**
 *
 * @author Administrator
 */
public class createCustomer extends javax.swing.JInternalFrame {
    File uploadedFile = null;
    /**
     * Creates new form createRep
     */
    public createCustomer() {
        initComponents();
        lblCustomerID.setText(Controller.Rep.createManager.getNextID(EAuth.Customer));
        Date today = new Date();
        today.setYear(today.getYear()-18);
        jxBirthDate.getMonthView().setUpperBound(today);
        jxBirthDate.setDate(today);
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
        jLabel2 = new javax.swing.JLabel();
        lblCustomerID = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fldFirstName = new javax.swing.JTextField();
        errFirstName = new javax.swing.JLabel();
        lblerrFirstName = new javax.swing.JLabel();
        xIcon = new javax.swing.JLabel();
        vIcon = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fldLastName = new javax.swing.JTextField();
        errLastName = new javax.swing.JLabel();
        lblerrLastName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        errPassword = new javax.swing.JLabel();
        lblerrPassword = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        errNickname = new javax.swing.JLabel();
        lblerrNickname = new javax.swing.JLabel();
        fldPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        errEmail = new javax.swing.JLabel();
        lblerrEmail = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jxBirthDate = new org.jdesktop.swingx.JXDatePicker();
        errBirthDate = new javax.swing.JLabel();
        lblerrBirthDate = new javax.swing.JLabel();
        fldEmail = new javax.swing.JTextField();
        fldNickname = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        errFile = new javax.swing.JLabel();
        lblerrFile = new javax.swing.JLabel();
        errSubmit = new javax.swing.JLabel();
        lblerrSubmit = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Please use the form below to create a new Customer");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 11, 490, 14);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 50, 80, 14);

        lblCustomerID.setForeground(new java.awt.Color(255, 255, 255));
        lblCustomerID.setText("jLabel3");
        getContentPane().add(lblCustomerID);
        lblCustomerID.setBounds(110, 50, 150, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 70, 70, 20);

        fldFirstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fldFirstNameFocusLost(evt);
            }
        });
        getContentPane().add(fldFirstName);
        fldFirstName.setBounds(110, 70, 150, 20);

        errFirstName.setToolTipText("");
        getContentPane().add(errFirstName);
        errFirstName.setBounds(260, 70, 20, 20);

        lblerrFirstName.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lblerrFirstName);
        lblerrFirstName.setBounds(280, 70, 300, 20);

        xIcon.setVisible(false);
        xIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boundary/Images/x.png"))); // NOI18N
        getContentPane().add(xIcon);
        xIcon.setBounds(610, 100, 20, 20);

        vIcon.setVisible(false);
        vIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boundary/Images/v.png"))); // NOI18N
        getContentPane().add(vIcon);
        vIcon.setBounds(610, 80, 20, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 90, 70, 20);

        fldLastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fldLastNameFocusLost(evt);
            }
        });
        getContentPane().add(fldLastName);
        fldLastName.setBounds(110, 90, 150, 20);

        errLastName.setToolTipText("");
        getContentPane().add(errLastName);
        errLastName.setBounds(260, 90, 20, 20);

        lblerrLastName.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lblerrLastName);
        lblerrLastName.setBounds(280, 90, 310, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 110, 70, 20);

        errPassword.setToolTipText("");
        getContentPane().add(errPassword);
        errPassword.setBounds(260, 110, 20, 20);

        lblerrPassword.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lblerrPassword);
        lblerrPassword.setBounds(280, 110, 370, 20);

        jButton1.setText("Create Customer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 280, 240, 23);

        errNickname.setToolTipText("");
        getContentPane().add(errNickname);
        errNickname.setBounds(260, 150, 40, 20);

        lblerrNickname.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lblerrNickname);
        lblerrNickname.setBounds(300, 150, 200, 20);

        fldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fldPasswordFocusLost(evt);
            }
        });
        getContentPane().add(fldPassword);
        fldPassword.setBounds(110, 110, 150, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 130, 70, 20);

        errEmail.setToolTipText("");
        getContentPane().add(errEmail);
        errEmail.setBounds(260, 130, 20, 20);

        lblerrEmail.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lblerrEmail);
        lblerrEmail.setBounds(280, 130, 370, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nickname");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 150, 70, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Birth Date");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 170, 70, 20);

        jxBirthDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jxBirthDateFocusLost(evt);
            }
        });
        jxBirthDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jxBirthDateActionPerformed(evt);
            }
        });
        getContentPane().add(jxBirthDate);
        jxBirthDate.setBounds(110, 170, 150, 22);

        errBirthDate.setToolTipText("");
        getContentPane().add(errBirthDate);
        errBirthDate.setBounds(260, 170, 40, 20);

        lblerrBirthDate.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lblerrBirthDate);
        lblerrBirthDate.setBounds(300, 170, 200, 20);

        fldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fldEmailFocusLost(evt);
            }
        });
        getContentPane().add(fldEmail);
        fldEmail.setBounds(110, 130, 150, 20);

        fldNickname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fldNicknameFocusLost(evt);
            }
        });
        getContentPane().add(fldNickname);
        fldNickname.setBounds(110, 150, 150, 20);

        jButton2.setText("Upload Avatar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 200, 110, 23);

        errFile.setToolTipText("");
        getContentPane().add(errFile);
        errFile.setBounds(130, 200, 40, 20);

        lblerrFile.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lblerrFile);
        lblerrFile.setBounds(170, 200, 200, 20);

        errSubmit.setToolTipText("");
        getContentPane().add(errSubmit);
        errSubmit.setBounds(260, 280, 40, 20);

        lblerrSubmit.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lblerrSubmit);
        lblerrSubmit.setBounds(300, 280, 200, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fldFirstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fldFirstNameFocusLost
        // TODO add your handling code here:
        if(fldFirstName.getText().length()<2){
            //Name is too short
            errFirstName.setIcon(xIcon.getIcon());
            lblerrFirstName.setText("Name must have more than 1 character");
        } else if(!fldFirstName.getText().matches("[a-zA-Z]+")){
            //Name contains special chars
            errFirstName.setIcon(xIcon.getIcon());
            lblerrFirstName.setText("Name must contain only letters.");
        } else {
            errFirstName.setIcon(vIcon.getIcon());
            lblerrFirstName.setText("");
        }
        iWindow.update();
    }//GEN-LAST:event_fldFirstNameFocusLost

    private void fldLastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fldLastNameFocusLost
        // TODO add your handling code here:
           if(fldLastName.getText().length()<2){
            //Name is too short
            errLastName.setIcon(xIcon.getIcon());
            lblerrLastName.setText("Name must have more than 1 character");
        } else if(!fldLastName.getText().matches("[a-zA-Z]+")){
            //Name contains special chars
            errLastName.setIcon(xIcon.getIcon());
            lblerrLastName.setText("Name must contain only letters.");
        } else {
            errLastName.setIcon(vIcon.getIcon());
            lblerrLastName.setText("");
        }
        iWindow.update();
    }//GEN-LAST:event_fldLastNameFocusLost

    private void fldPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fldPasswordFocusLost
        // TODO add your handling code here:
        if(fldPassword.getText().length()<5){
            //Password too short
            errPassword.setIcon(xIcon.getIcon());
            lblerrPassword.setText("Password must more than 4 characters.");
        } else if(fldPassword.getText().matches("[ ]")){
            errPassword.setIcon(xIcon.getIcon());
            lblerrPassword.setText("Password must not have spaces!");
        } else{
            errPassword.setIcon(vIcon.getIcon());
            lblerrPassword.setText("");
        }
        iWindow.update();
    }//GEN-LAST:event_fldPasswordFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(lblerrFirstName.getText().length()>0 ||
                lblerrFile.getText().length()>0 ||
                lblerrLastName.getText().length()>0 ||
                lblerrEmail.getText().length()>0 ||
                    lblerrPassword.getText().length()>0){
            errSubmit.setIcon(xIcon.getIcon());
            lblerrSubmit.setText("Please fix the errors before proceeding.");
        } else{
            iMuzaMusic.Success("Customer #"+lblCustomerID.getText()+" has been successfully created.");
            Customer c = new Customer(lblCustomerID.getText(), fldFirstName.getText(), fldLastName.getText(), fldPassword.getText(), EAuth.Customer, jxBirthDate.getDate(), fldNickname.getText(), uploadedFile, fldEmail.getText());
           
            Controller.Rep.createManager.create(c);
        }
        
        
        
        iWindow.update();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jxBirthDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jxBirthDateFocusLost
       ;
    }//GEN-LAST:event_jxBirthDateFocusLost

    private void fldEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fldEmailFocusLost
        // TODO add your handling code here:
         String mail = fldEmail.getText();
        if(mail.length()==0)
        lblerrEmail.setText("Enter Email Address");
        else
        if (!Controller.Validators.EmailValidator.validateEmail(mail))
        lblerrEmail.setText("Please enter valid email - username@domain.host");
        else lblerrEmail.setText("");

        if(lblerrEmail.getText().equals("")) //no error
        errEmail.setIcon(vIcon.getIcon());
        else errEmail.setIcon(xIcon.getIcon());
        iWindow.update();
                          

    }//GEN-LAST:event_fldEmailFocusLost

    private void jxBirthDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jxBirthDateActionPerformed

        iMuzaMusic.log("Chosen date: "+jxBirthDate.getDate());
        if(jxBirthDate.getDate()==null){
            errBirthDate.setIcon(xIcon.getIcon());
            lblerrBirthDate.setText("Please select a birth date");
            jxBirthDate.setDate(jxBirthDate.getMonthView().getUpperBound());
        } else {
            errBirthDate.setIcon(vIcon.getIcon());
            lblerrBirthDate.setText("");
        }
        iWindow.update();
    }//GEN-LAST:event_jxBirthDateActionPerformed

    private void fldNicknameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fldNicknameFocusLost
                // TODO add your handling code here:
        if(fldNickname.getText().length()<2)
            lblerrNickname.setText("Nickname is too short.");
        
        if(lblerrNickname.getText().length()>0)
            errNickname.setIcon(xIcon.getIcon());
        else errNickname.setIcon(vIcon.getIcon());
        
        iWindow.update();
    }//GEN-LAST:event_fldNicknameFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            //upload avatar
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            uploadedFile = chooser.getSelectedFile();
            long size = Files.size(uploadedFile.toPath()) / 1000;
            if(size>2048){
                errFile.setIcon(xIcon.getIcon());
                lblerrFile.setText("Sorry, but it seems like you are trying to upload a large file.");
                iWindow.update();
                return;
            }
           
            iMuzaMusic.log("Image uploaded: "+uploadedFile.getAbsolutePath());
        } catch (IOException ex) {
            Logger.getLogger(createCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errBirthDate;
    private javax.swing.JLabel errEmail;
    private javax.swing.JLabel errFile;
    private javax.swing.JLabel errFirstName;
    private javax.swing.JLabel errLastName;
    private javax.swing.JLabel errNickname;
    private javax.swing.JLabel errPassword;
    private javax.swing.JLabel errSubmit;
    private javax.swing.JTextField fldEmail;
    private javax.swing.JTextField fldFirstName;
    private javax.swing.JTextField fldLastName;
    private javax.swing.JTextField fldNickname;
    private javax.swing.JPasswordField fldPassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private org.jdesktop.swingx.JXDatePicker jxBirthDate;
    private javax.swing.JLabel lblCustomerID;
    private javax.swing.JLabel lblerrBirthDate;
    private javax.swing.JLabel lblerrEmail;
    private javax.swing.JLabel lblerrFile;
    private javax.swing.JLabel lblerrFirstName;
    private javax.swing.JLabel lblerrLastName;
    private javax.swing.JLabel lblerrNickname;
    private javax.swing.JLabel lblerrPassword;
    private javax.swing.JLabel lblerrSubmit;
    private javax.swing.JLabel vIcon;
    private javax.swing.JLabel xIcon;
    // End of variables declaration//GEN-END:variables
}