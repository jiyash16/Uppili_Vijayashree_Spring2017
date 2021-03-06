/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SOC;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.SOCOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.UserAccountManagement.TimesheetJPanel;
import UserInterface.UserAccountManagement.ViewUpdatePersonDetailsJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Jiya
 */
public class SOCWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SOCWorkAreaJPanel
     */

    JPanel userProcessContainer;
    UserAccount userAccount;
    SOCOrganization organization;
    Enterprise enterprise;
    EcoSystem system;
    public SOCWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, SOCOrganization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.enterprise = enterprise;
        this.organization = organization;
        this.system = system;
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
        btnTmeSheet1 = new javax.swing.JButton();
        btnWorkRequest = new javax.swing.JButton();
        btnMyWorkRequest = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnBIReport = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SOC WorkArea");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 170, 40));

        btnTmeSheet1.setBackground(new java.awt.Color(255, 153, 153));
        btnTmeSheet1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTmeSheet1.setForeground(new java.awt.Color(255, 255, 255));
        btnTmeSheet1.setText("<html><Center><h3>Timesheet</h3><Center><html>");
        btnTmeSheet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTmeSheet1ActionPerformed(evt);
            }
        });
        add(btnTmeSheet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 140, 109));

        btnWorkRequest.setBackground(new java.awt.Color(0, 204, 204));
        btnWorkRequest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnWorkRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnWorkRequest.setText("<html><Center><h3>Serve</h3><h3> WorkRequest</h3><Center><html>");
        btnWorkRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWorkRequestActionPerformed(evt);
            }
        });
        add(btnWorkRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 140, 109));

        btnMyWorkRequest.setBackground(new java.awt.Color(255, 153, 0));
        btnMyWorkRequest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMyWorkRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnMyWorkRequest.setText("<html><Center><h3>Serve</h3><h3>My  WorkRequest</h3><Center><html>");
        btnMyWorkRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyWorkRequestActionPerformed(evt);
            }
        });
        add(btnMyWorkRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 140, 109));

        btnProfile.setBackground(new java.awt.Color(0, 51, 204));
        btnProfile.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnProfile.setText("<html><Center><h3>Update</h3><h3>Profile</h3><Center><html>");
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        add(btnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 280, 110));

        btnBIReport.setBackground(new java.awt.Color(0, 204, 51));
        btnBIReport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBIReport.setForeground(new java.awt.Color(255, 255, 255));
        btnBIReport.setText("<html><Center><h3>BI</h3><h3>Report</h3><Center><html>");
        btnBIReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBIReportActionPerformed(evt);
            }
        });
        add(btnBIReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 140, 110));
    }// </editor-fold>//GEN-END:initComponents

    private void btnTmeSheet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTmeSheet1ActionPerformed
        // TODO add your handling code here:
        TimesheetJPanel timesheetSOCPanel = new TimesheetJPanel(userProcessContainer,userAccount,0);
        userProcessContainer.add("TimesheetSOCJPanel",timesheetSOCPanel);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnTmeSheet1ActionPerformed

    private void btnWorkRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWorkRequestActionPerformed
        // TODO add your handling code here:
        ManageSOCWorkRequestJPanel manageSOCWorkRequestJPanel = new ManageSOCWorkRequestJPanel(userProcessContainer,userAccount,organization,system);
        userProcessContainer.add("ManageSOCWorkRequestJPanel",manageSOCWorkRequestJPanel);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnWorkRequestActionPerformed

    private void btnMyWorkRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyWorkRequestActionPerformed
        // TODO add your handling code here:
        ManageSOCMyWorkRequestJPanel manageSOCMyWorkRequestJPanel = new ManageSOCMyWorkRequestJPanel(userProcessContainer,userAccount,system);
        userProcessContainer.add("ManageSOCMyWorkRequestJPanel",manageSOCMyWorkRequestJPanel);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnMyWorkRequestActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
        ViewUpdatePersonDetailsJPanel viewUpdateNurse = new ViewUpdatePersonDetailsJPanel(userProcessContainer,userAccount.getEmployee(), userAccount,"employee","edit",0);
        userProcessContainer.add("ViewUpdatePersonDetailsJPanel",viewUpdateNurse);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnBIReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBIReportActionPerformed
        // TODO add your handling code here:
         BIReportsSOCJPanel bIReportsSOCJPanel = new BIReportsSOCJPanel(userProcessContainer,userAccount,organization,system);
        userProcessContainer.add("BIReportsSOCJPanel",bIReportsSOCJPanel);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnBIReportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBIReport;
    private javax.swing.JButton btnMyWorkRequest;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnTmeSheet1;
    private javax.swing.JButton btnWorkRequest;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
