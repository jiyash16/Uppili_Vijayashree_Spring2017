/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PatientSupport;

import Business.Enterprise.Enterprise;
import Business.Organization.SupportOrganization;
import Business.UserAccount.UserAccount;
import Business.Validate;
import UserInterface.UserAccountManagement.TimesheetJPanel;
import UserInterface.UserAccountManagement.ViewUpdatePersonDetailsJPanel;
import UserInterface.UserAccountManagement.WorkFromHomeRequestJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Jiya
 */
public class PatientSupportWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientSupportWorkAreaJPanel
     */
    JPanel userProcessContainer;
    SupportOrganization organization;
    UserAccount userAccount;
    Enterprise enterprise;
    int wfh;
    public PatientSupportWorkAreaJPanel(JPanel userProcessContainer, SupportOrganization organization, UserAccount userAccount, Enterprise enterprise,int wfh) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.wfh = wfh;
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
        btnWorkRequest = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnTmeSheet1 = new javax.swing.JButton();
        btnMyWorkRequest = new javax.swing.JButton();
        btnWFHRequest = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Patient Support WorkArea");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 210, 40));

        btnWorkRequest.setBackground(new java.awt.Color(0, 204, 204));
        btnWorkRequest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnWorkRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnWorkRequest.setText("<html><Center><h3>Serve</h3><h3> WorkRequest</h3><Center><html>");
        btnWorkRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWorkRequestActionPerformed(evt);
            }
        });
        add(btnWorkRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 140, 109));

        btnProfile.setBackground(new java.awt.Color(0, 51, 204));
        btnProfile.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnProfile.setText("<html><Center><h3>Update</h3><h3>Profile</h3><Center><html>");
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        add(btnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 280, 110));

        btnTmeSheet1.setBackground(new java.awt.Color(255, 153, 153));
        btnTmeSheet1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTmeSheet1.setForeground(new java.awt.Color(255, 255, 255));
        btnTmeSheet1.setText("<html><Center><h3>Timesheet</h3><Center><html>");
        btnTmeSheet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTmeSheet1ActionPerformed(evt);
            }
        });
        add(btnTmeSheet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 199, 140, 110));

        btnMyWorkRequest.setBackground(new java.awt.Color(255, 153, 0));
        btnMyWorkRequest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMyWorkRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnMyWorkRequest.setText("<html><Center><h3>Serve</h3><h3>My  WorkRequest</h3><Center><html>");
        btnMyWorkRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyWorkRequestActionPerformed(evt);
            }
        });
        add(btnMyWorkRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 140, 110));

        btnWFHRequest.setBackground(new java.awt.Color(51, 153, 0));
        btnWFHRequest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnWFHRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnWFHRequest.setText("<html><Center><h3>Work From Home</h3><h3> WorkRequest</h3><Center><html>");
        btnWFHRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWFHRequestActionPerformed(evt);
            }
        });
        add(btnWFHRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 140, 109));
    }// </editor-fold>//GEN-END:initComponents

    private void btnWorkRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWorkRequestActionPerformed
        // TODO add your handling code here:
         if(wfh==1)
            {
                Validate.createLogFile(userAccount.getUsername(), "Employee viewed workrequest");
            }
        ServeSuportWorkRequestJPanel serveSuportWorkRequestJPanel = new ServeSuportWorkRequestJPanel(userProcessContainer,organization,enterprise,userAccount,wfh);
        userProcessContainer.add("ServeSuportWorkRequestJPanel",serveSuportWorkRequestJPanel);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnWorkRequestActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
         if(wfh==1)
            {
                Validate.createLogFile(userAccount.getUsername(), "Employee viewed his profile");
            }
        ViewUpdatePersonDetailsJPanel viewUpdateNurse = new ViewUpdatePersonDetailsJPanel(userProcessContainer,userAccount.getEmployee(),userAccount, "employee","edit",wfh);
        userProcessContainer.add("ViewUpdatePersonDetailsJPanel",viewUpdateNurse);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnTmeSheet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTmeSheet1ActionPerformed
        // TODO add your handling code here:
         if(wfh==1)
            {
                Validate.createLogFile(userAccount.getUsername(), "Employee viewed his timesheet");
            }
        TimesheetJPanel timesheetPatientSupportJPanel = new TimesheetJPanel(userProcessContainer,userAccount,wfh);
        userProcessContainer.add("TimesheetPatientSupportJPanel",timesheetPatientSupportJPanel);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnTmeSheet1ActionPerformed

    private void btnMyWorkRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyWorkRequestActionPerformed
        // TODO add your handling code here:
         if(wfh==1)
            {
                Validate.createLogFile(userAccount.getUsername(), "Employee viewed his workrequest");
            }
        ServeSupportMyWorkRequestJPanel serveSupportMyWorkRequestJPanel = new ServeSupportMyWorkRequestJPanel(userProcessContainer,userAccount,wfh);
        userProcessContainer.add("ServeSupportMyWorkRequestJPanel",serveSupportMyWorkRequestJPanel);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnMyWorkRequestActionPerformed

    private void btnWFHRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWFHRequestActionPerformed
        // TODO add your handling code here:
        WorkFromHomeRequestJPanel workFromHomePatientSupportJPanel = new WorkFromHomeRequestJPanel(userProcessContainer,userAccount,enterprise);
        userProcessContainer.add("WorkFromHomeRequestPatientSupportJPanel",workFromHomePatientSupportJPanel);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
        
    }//GEN-LAST:event_btnWFHRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMyWorkRequest;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnTmeSheet1;
    private javax.swing.JButton btnWFHRequest;
    private javax.swing.JButton btnWorkRequest;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
