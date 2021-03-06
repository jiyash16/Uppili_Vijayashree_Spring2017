/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.OrganizationAdmin;

import UserInterface.EnterpriseAdmin.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.UserAccountManagement.TimesheetJPanel;
import UserInterface.UserAccountManagement.ViewUpdatePersonDetailsJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Jiya
 */
public class OrganizationAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    int wfh;
    public OrganizationAdminWorkAreaJPanel(JPanel userProcessContainer,UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem system,int wfh) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.organization = organization;
        this.system = system;
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

        lblswan = new javax.swing.JLabel();
        btnManagePatient = new javax.swing.JButton();
        btnManageWorkRequest1 = new javax.swing.JButton();
        btnBIReport = new javax.swing.JButton();
        btnManageUserAccount = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnTmeSheet1 = new javax.swing.JButton();
        btnManageWorkRequest2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblswan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblswan.setForeground(new java.awt.Color(255, 255, 255));
        lblswan.setText("Admin WorkArea");
        add(lblswan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 230, 50));

        btnManagePatient.setBackground(new java.awt.Color(255, 204, 102));
        btnManagePatient.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnManagePatient.setForeground(new java.awt.Color(255, 255, 255));
        btnManagePatient.setText("<html><Center><h3>Manage</h3><h3>Patient</h3><Center><html>");
        btnManagePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePatientActionPerformed(evt);
            }
        });
        add(btnManagePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 140, 109));

        btnManageWorkRequest1.setBackground(new java.awt.Color(0, 204, 204));
        btnManageWorkRequest1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnManageWorkRequest1.setForeground(new java.awt.Color(255, 255, 255));
        btnManageWorkRequest1.setText("<html><Center><h3>My</h3><h3>WorkRequest</h3><Center><html>");
        btnManageWorkRequest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageWorkRequest1ActionPerformed(evt);
            }
        });
        add(btnManageWorkRequest1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 140, 109));

        btnBIReport.setBackground(new java.awt.Color(0, 204, 51));
        btnBIReport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBIReport.setForeground(new java.awt.Color(255, 255, 255));
        btnBIReport.setText("<html><Center><h3>BI</h3><h3>Report</h3><Center><html>");
        btnBIReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBIReportActionPerformed(evt);
            }
        });
        add(btnBIReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 140, 110));

        btnManageUserAccount.setBackground(new java.awt.Color(204, 51, 255));
        btnManageUserAccount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnManageUserAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnManageUserAccount.setText("<html><Center><h3>Manage</h3><h3>User Account</h3><Center><html>");
        btnManageUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUserAccountActionPerformed(evt);
            }
        });
        add(btnManageUserAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 140, 109));

        btnProfile.setBackground(new java.awt.Color(0, 51, 204));
        btnProfile.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnProfile.setText("<html><Center><h3>Update</h3><h3>Profile</h3><Center><html>");
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        add(btnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 420, 110));

        btnTmeSheet1.setBackground(new java.awt.Color(255, 153, 153));
        btnTmeSheet1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTmeSheet1.setForeground(new java.awt.Color(255, 255, 255));
        btnTmeSheet1.setText("<html><Center><h3>Timesheet</h3><Center><html>");
        btnTmeSheet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTmeSheet1ActionPerformed(evt);
            }
        });
        add(btnTmeSheet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 140, 109));

        btnManageWorkRequest2.setBackground(new java.awt.Color(204, 0, 204));
        btnManageWorkRequest2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnManageWorkRequest2.setForeground(new java.awt.Color(255, 255, 255));
        btnManageWorkRequest2.setText("<html><Center><h3>Serve</h3><h3>WorkRequest</h3><Center><html>");
        btnManageWorkRequest2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageWorkRequest2ActionPerformed(evt);
            }
        });
        add(btnManageWorkRequest2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 140, 109));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManagePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePatientActionPerformed
        // TODO add your handling code here:
         ViewPatientDirectoryJPanel viewPatient = new ViewPatientDirectoryJPanel(userProcessContainer,enterprise);
        userProcessContainer.add("ViewPatientDirectoryJPanel",viewPatient);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnManagePatientActionPerformed

    private void btnManageWorkRequest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageWorkRequest1ActionPerformed
        // TODO add your handling code here:
       // System.out.println("organization"+organization);
        ManageAdminMyWorkRequestJPanel1 manageAdminMyWorkRequestJPanel1 = new ManageAdminMyWorkRequestJPanel1(userProcessContainer,userAccount,organization,enterprise);
        userProcessContainer.add("ManageAdminMyWorkRequestJPanel1",manageAdminMyWorkRequestJPanel1);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
        
    }//GEN-LAST:event_btnManageWorkRequest1ActionPerformed

    private void btnBIReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBIReportActionPerformed
        // TODO add your handling code here:
        BIReportsOrganizationJPanel bIReportsOrganizationJPanel = new BIReportsOrganizationJPanel(userProcessContainer,enterprise,organization);
        userProcessContainer.add("BIReportsOrganizationJPanel",bIReportsOrganizationJPanel);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnBIReportActionPerformed

    private void btnManageUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUserAccountActionPerformed
        // TODO add your handling code here:
        
           ManageUserAccountAdminJPanel manageadminUserAccount = new ManageUserAccountAdminJPanel(userProcessContainer,enterprise,system);
        userProcessContainer.add("ManageUserAccountAdminJPanel",manageadminUserAccount);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnManageUserAccountActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
          ViewUpdatePersonDetailsJPanel viewProfileAdmin = new ViewUpdatePersonDetailsJPanel(userProcessContainer,userAccount.getEmployee(), userAccount,"admin","edit",0);
        userProcessContainer.add("ViewUpdatePersonDetailsJPanel",viewProfileAdmin);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnTmeSheet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTmeSheet1ActionPerformed
        // TODO add your handling code here:
        TimesheetJPanel timesheetOrganizationAdminJPanel = new TimesheetJPanel(userProcessContainer,userAccount,0);
        userProcessContainer.add("TimesheetOrganizationJPanel",timesheetOrganizationAdminJPanel);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnTmeSheet1ActionPerformed

    private void btnManageWorkRequest2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageWorkRequest2ActionPerformed
        // TODO add your handling code here:
         ManageAdminWorkRequestJPanel manageAdminWorkRequestJPanel = new ManageAdminWorkRequestJPanel(userProcessContainer,userAccount, organization, enterprise);
        userProcessContainer.add("ManageAdminWorkRequestJPanel",manageAdminWorkRequestJPanel);
        CardLayout cl = (CardLayout)userProcessContainer.getLayout();
        cl.next(userProcessContainer);
       
    }//GEN-LAST:event_btnManageWorkRequest2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBIReport;
    private javax.swing.JButton btnManagePatient;
    private javax.swing.JButton btnManageUserAccount;
    private javax.swing.JButton btnManageWorkRequest1;
    private javax.swing.JButton btnManageWorkRequest2;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnTmeSheet1;
    private javax.swing.JLabel lblswan;
    // End of variables declaration//GEN-END:variables
}
